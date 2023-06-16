package LV2;

import java.util.ArrayList;
import java.util.List;

public class H12936 {
    public int[] solution(int n, long k) {
        // 1부터 n까지의 숫자를 저장할 리스트를 생성
        List<Integer> numberList = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            numberList.add(i);
        }

        // 팩토리얼 값을 저장할 배열을 생성
        long[] factorial = new long[n+1];
        factorial[0] = 1;
        for(int i = 1; i <= n; i++) {
            factorial[i] = factorial[i-1] * i;
        }

        // 재귀 함수를 호출하여 결과를 반환
        return solve(numberList, factorial, n, k);
    }

    private int[] solve(List<Integer> numberList, long[] factorial, int n, long k) {
        // n이 0이면 빈 배열을 반환 (재귀 종료 조건)
        if(n == 0) {
            return new int[0];
        }
        // k 번째에 위치할 첫 번째 숫자를 계산
        long fact = factorial[n-1];
        int index = (int)((k-1) / fact);
        // 계산한 인덱스의 숫자를 리스트에서 제거
        int number = numberList.remove(index);
        // k를 갱신하고 나머지 숫자들에 대해 재귀 호출
        int[] subResult = solve(numberList, factorial, n-1, k - fact * index);
        // 결과를 저장할 배열을 생성하고 첫 번째 숫자를 넣음
        int[] result = new int[n];
        result[0] = number;
        // 나머지 숫자들을 결과 배열에 넣음
        for(int i = 1; i < n; i++) {
            result[i] = subResult[i-1];
        }
        // 결과 배열을 반환
        return result;
    }
}