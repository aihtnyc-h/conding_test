package LV2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class H1844 {
    // 상, 하, 좌, 우로 이동하기 위한 델타 배열
    private final int[] dx = {-1, 1, 0, 0};
    private final int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        int n = maps.length; // 맵의 세로 크기
        int m = maps[0].length; // 맵의 가로 크기
        int[][] dist = new int[n][m]; // 시작 위치부터 각 위치까지의 최단 거리를 저장할 배열

        // dist 배열을 모두 -1로 초기화 (아직 방문하지 않은 위치를 의미)
        for (int[] row : dist) {
            Arrays.fill(row, -1);
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0}); // 시작 위치를 큐에 넣는다
        dist[0][0] = 1; // 시작 위치의 거리는 1

        // BFS 탐색 시작
        while (!queue.isEmpty()) {
            int[] cur = queue.poll(); // 현재 위치를 큐에서 꺼낸다
            for (int dir = 0; dir < 4; dir++) { // 상하좌우 4방향으로 이동
                int nx = cur[0] + dx[dir];
                int ny = cur[1] + dy[dir];
                // 맵의 범위를 벗어나거나 벽이 있는 경우 이동할 수 없음
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || maps[nx][ny] == 0) {
                    continue;
                }
                // 아직 방문하지 않은 위치인 경우
                if (dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[cur[0]][cur[1]] + 1; // 현재 위치의 거리 + 1
                    queue.offer(new int[]{nx, ny}); // 큐에 새로운 위치를 추가
                }
            }
        }

        // 도착지까지의 최단 거리를 반환. 도달할 수 없는 경우 -1을 반환
        return dist[n-1][m-1];
    }
}