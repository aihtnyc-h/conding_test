package LV2;

import java.util.HashSet;
import java.util.Set;

public class H42839 {
    public int solution(String numbers) {
        int answer = 0; // 소수의 개수를 저장할 변수
        Set<Integer> set = new HashSet<>(); // 중복되는 숫자 조합을 제거하기 위해 Set 사용

        // 모든 숫자 조합을 생성
        permutation("", numbers, set);

        // 생성된 모든 숫자 조합에 대해 소수인지 체크
        for (Integer number : set) {
            // 소수인 경우 answer 증가
            if (isPrime(number)) {
                answer++;
            }
        }

        // 만들 수 있는 소수의 개수 반환
        return answer;
    }

    // 재귀적으로 모든 숫자 조합을 생성하는 함수
    private void permutation(String prefix, String str, Set<Integer> set) {
        int n = str.length();
        if (!prefix.equals("")) {
            set.add(Integer.valueOf(prefix)); // 숫자 조합을 Set에 추가
        }

        // 재귀적으로 숫자 조합 생성
        for (int i = 0; i < n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
        }
    }

    // 숫자가 소수인지 판단하는 함수
    private boolean isPrime(int number) {
        if (number <= 1) { // 1 이하의 수는 소수가 아님
            return false;
        }

        if (number == 2) { // 2는 소수
            return true;
        }

        // 2부터 number의 제곱근까지 나누어 보면서 소수인지 판별
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // 나누어 떨어지는 경우 소수가 아님
            if (number % i == 0) {
                return false;
            }
        }

        // 위의 for loop를 통과하면 소수
        return true;
    }
}