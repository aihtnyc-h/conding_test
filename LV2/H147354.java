package LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class H147354 {
    public static int solution(int[][] data, int col, int row_begin, int row_end) {
        sort(data, col);
        List<Integer> modResult = getModResult(data, row_begin, row_end);
        return getXOR(modResult);
    }

    // 튜플의 col 번째 컬럼의 값을 기준으로 오름차순 정렬을 하되, 값이 동일하면 첫 번째 컬럼의 값을 기준으로 내림차순 정렬
    // data[i][j]는 i + 1 번째 튜플의 j + 1 번째 컬럼의 값을 의미합니다.
    private static void sort(int[][] data, int col) {
        Arrays.sort(data, (o1, o2) -> {
            if (o1[col - 1] == o2[col - 1]) {
                return o2[0] - o1[0];
            }
            return o1[col - 1] - o2[col - 1];
        });
    }

    // 정렬된 데이터에서 S_i를 i번째 행의 튜플에 대해 각 컬럼의 값을 i로 나눈 나머지들의 합으로 정의
    private static List<Integer> getModResult(int[][] data, int row_begin, int row_end) {
        List<Integer> result = new ArrayList<>();

        for (int i = row_begin; i <= row_end; i++) {
            int sum = 0;
            for (int j = 0; j < data[0].length; j++) {
                sum += data[i - 1][j] % i;
            }
            result.add(sum);
        }

        return result;
    }

    // row_begin <= i <= row_end 인 모든 S_i를 누적하며 XOR 한 값을 해시값으로 반환
    private static int getXOR(List<Integer> modResult) {
        int sum = modResult.get(0);

        for (int i = 1; i < modResult.size(); i++) {
            sum ^= modResult.get(i);
        }

        return sum;
    }
}