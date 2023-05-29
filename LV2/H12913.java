package LV2;

public class H12913 {
    int solution(int[][] land) {
        // 각 행을 순회하면서, 자신의 열을 제외한 이전 행의 최댓값을 자신의 점수에 더한다.
        // 이는 같은 열을 연속해서 밟을 수 없는 규칙을 반영한 것
        for(int i=1; i<land.length; i++){
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]); // 첫 번째 열 선택
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]); // 두 번째 열 선택
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]); // 세 번째 열 선택
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]); // 네 번째 열 선택
        }

        // 마지막 행에서 가장 큰 값을 선택하면, 그것이 모든 행을 거치며 얻을 수 있는 최대 점수이다.
        int answer = Math.max(Math.max(Math.max(land[land.length-1][0], land[land.length-1][1]), land[land.length-1][2]), land[land.length-1][3]);

        return answer;
    }
}