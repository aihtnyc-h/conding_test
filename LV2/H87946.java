package LV2;

public class H87946 {
    // 최대 탐험 가능한 던전 수를 저장할 변수
    int answer = 0;

    public int solution(int k, int[][] dungeons) {
        // 각 던전을 방문했는지 여부를 체크하는 배열
        boolean[] visited = new boolean[dungeons.length];

        // 깊이 우선 탐색(DFS)를 시작
        dfs(k, dungeons, visited, 0);

        // 최대 탐험 가능한 던전 수를 반환
        return answer;
    }

    // 깊이 우선 탐색(DFS)을 수행하는 메소드
    private void dfs(int fatigue, int[][] dungeons, boolean[] visited, int count) {
        // 현재까지 탐험한 던전 수(count)와 answer 중 큰 값을 answer로 저장
        answer = Math.max(answer, count);

        // 모든 던전에 대해서
        for (int i = 0; i < dungeons.length; i++) {
            // 아직 방문하지 않은 던전이고, 현재 피로도가 던전의 최소 필요 피로도 이상인 경우
            if (!visited[i] && fatigue >= dungeons[i][0]) {
                // 해당 던전을 방문했음을 표시
                visited[i] = true;

                // 던전의 소모 피로도를 현재 피로도에서 빼고, 다음 던전을 탐험하기 위해 재귀 호출합
                dfs(fatigue - dungeons[i][1], dungeons, visited, count + 1);

                // 백트래킹: 던전 탐험을 마치고 해당 던전의 방문 상태를 원래대로 되돌린다.
                visited[i] = false;
            }
        }
    }
}