package LV2;

import java.util.HashSet;

public class H131701 {
    public int solution(int[] elements) {
        int n = elements.length;
        int[] sums = new int[2 * n];
        HashSet<Integer> uniqueSums = new HashSet<>();

        // 원형 수열을 구성하기 위해 elements를 sums 배열에 두 번 복사
        for (int i = 0; i < n; i++) {
            sums[i] = sums[i + n] = elements[i];
        }

        // 가능한 모든 연속 부분 수열의 합을 구하고, 이를 HashSet에 추가하여 중복을 제거
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < i + n; j++) {
                sum += sums[j];
                uniqueSums.add(sum);
            }
        }

        // 최종적으로, 연속 부분 수열의 합으로 만들 수 있는 유일한 값의 개수를 반환
        return uniqueSums.size();
    }
}