package LV2;

import java.util.ArrayList;
import java.util.Arrays;

public class H86971 {
    private boolean[] visited;  // 방문 여부를 저장하는 배열
    private ArrayList<Integer>[] adjList;  // 인접 리스트

    // DFS로 연결된 노드 수 세기
    private int countNodes(int node) {
        int count = 1;  // 현재 노드를 포함하므로 시작은 1
        visited[node] = true;  // 현재 노드를 방문했음을 표시

        // 인접한 노드를 순회
        for (int adjNode : adjList[node]) {
            // 아직 방문하지 않은 노드라면
            if (!visited[adjNode]) {
                // DFS를 재귀적으로 호출하며 연결된 노드 수를 증가
                count += countNodes(adjNode);
            }
        }

        return count;  // 연결된 노드의 수 반환
    }

    public int solution(int n, int[][] wires) {
        int answer = n;  // 초기 답변값은 전체 노드의 수로 설정
        visited = new boolean[n+1];  // 방문 배열 크기를 노드의 수+1로 초기화
        adjList = new ArrayList[n+1];  // 인접 리스트 크기를 노드의 수+1로 초기화

        // 인접 리스트 초기화
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }

        // 인접 리스트 구성
        for (int[] wire : wires) {
            adjList[wire[0]].add(wire[1]);
            adjList[wire[1]].add(wire[0]);
        }

        // 각 전선을 끊어볼 때마다 두 그룹의 노드 수 차이 계산
        for (int[] wire : wires) {
            // 해당 전선을 인접 리스트에서 제거
            adjList[wire[0]].remove((Integer)wire[1]);
            adjList[wire[1]].remove((Integer)wire[0]);

            // 방문 배열 초기화
            Arrays.fill(visited, false);

            // DFS를 이용하여 노드 수 계산
            int count = countNodes(wire[0]);

            // 노드 수 차이를 계산하여 최소값을 찾음
            answer = Math.min(answer, Math.abs(n - 2 * count));

            // 끊었던 전선을 다시 연결
            adjList[wire[0]].add(wire[1]);
            adjList[wire[1]].add(wire[0]);
        }

        // 최소 노드 수 차이 반환
        return answer;
    }
}