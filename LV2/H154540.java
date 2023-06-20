package LV2;

import java.util.ArrayList;
import java.util.Collections;

public class H154540 {
    private final int[] dx = {-1, 0, 1, 0};  // 상, 우, 하, 좌로 움직일 x 좌표
    private final int[] dy = {0, 1, 0, -1};  // 상, 우, 하, 좌로 움직일 y 좌표
    private boolean[][] visited;  // 해당 좌표를 방문했는지 저장하는 배열
    private String[] maps;  // 주어진 지도
    private int m, n;  // 지도의 행과 열의 개수
    private int day;  // 하나의 무인도에서 머무를 수 있는 최대 일수

    public int[] solution(String[] maps) {
        this.maps = maps;  // 지도를 클래스 변수에 저장
        this.m = maps.length;  // 행의 개수를 저장
        this.n = maps[0].length();  // 열의 개수를 저장
        this.visited = new boolean[m][n];  // 방문 배열을 생성
        ArrayList<Integer> result = new ArrayList<>();  // 결과를 저장할 리스트 생성

        // 지도의 모든 좌표를 순회
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                // 만약 방문하지 않았고, 무인도(숫자)라면
                if(!visited[i][j] && maps[i].charAt(j) != 'X'){
                    this.day = 0;  // 무인도에서 머무를 수 있는 일수를 0으로 초기화
                    dfs(i, j);  // dfs를 시작
                    result.add(this.day);  // 결과 리스트에 추가
                }
            }
        }

        // 만약 무인도가 하나도 없다면
        if(result.size() == 0) {
            return new int[]{-1};  // -1을 반환
        } else {
            int[] answer = new int[result.size()];  // 결과 배열을 생성
            Collections.sort(result);  // 결과 리스트를 정렬
            // 결과 배열에 리스트의 원소를 차례대로 넣음
            for(int i=0; i<result.size(); i++) answer[i] = result.get(i);
            return answer;  // 결과 배열을 반환
        }
    }

    // DFS 메소드
    public void dfs(int x, int y) {
        visited[x][y] = true;  // 해당 좌표를 방문했음을 표시
        day += maps[x].charAt(y) - '0';  // 무인도에서 머무를 수 있는 일수에 해당 좌표의 값을 더함

        // 상, 우, 하, 좌 순서로 방문 가능한지 확인
        for(int i=0; i<4; i++){
            int nx = x + dx[i];  // 다음 x 좌표
            int ny = y + dy[i];  // 다음 y 좌표
            // 만약 다음 좌표가 지도 내부에 있고,
            if(nx >= 0 && nx < m && ny >= 0 && ny < n){
                // 다음 좌표를 아직 방문하지 않았으며, 무인도(숫자)라면
                if(!visited[nx][ny] && maps[nx].charAt(ny) != 'X'){
                    dfs(nx, ny);  // dfs를 계속 진행
                }
            }
        }
    }
}