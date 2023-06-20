package LV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H135807 {
    private int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            min = Math.min(min, num);
        }
        return min;
    }

    // 주어진 숫자의 약수들을 반환하는 함수
    private List<Integer> getDivisors(int num) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (i * i != num) {
                    divisors.add(num / i);
                }
            }
        }
        // 약수들을 큰 숫자부터 작은 숫자 순서로 정렬
        divisors.sort(Collections.reverseOrder());
        return divisors;
    }

    // 주어진 배열의 모든 숫자들이 주어진 약수로 나누어 떨어지는지 확인하는 함수
    private boolean canDivideAll(int[] array, int divisor) {
        for (int num : array) {
            if (num % divisor != 0) {
                return false;
            }
        }
        return true;
    }

    // 주어진 배열의 숫자 중 하나라도 주어진 약수로 나누어 떨어지는지 확인하는 함수
    private boolean canDivideAny(int[] array, int divisor) {
        for (int num : array) {
            if (num % divisor == 0) {
                return true;
            }
        }
        return false;
    }

    // 철수와 영희가 가지고 있는 카드에서 조건을 만족하는 최대 약수를 찾는 함수
    private int getAnswer(int[] arrayA, int[] arrayB) {
        int minA = getMin(arrayA);
        List<Integer> divisors = getDivisors(minA);
        for (int divisor : divisors) {
            // 철수의 카드 숫자들이 모두 약수로 나누어 떨어지고, 영희의 카드 숫자들 중 어느 것도 약수로 나누어 떨어지지 않을 때
            if (canDivideAll(arrayA, divisor) && !canDivideAny(arrayB, divisor)) {
                return divisor;
            }
        }
        return 0;
    }

    // 철수와 영희가 갖고 있는 카드에 적힌 숫자들로부터 조건을 만족하는 최대 약수를 찾는 함수
    public int solution(int[] arrayA, int[] arrayB) {
        // 철수와 영희의 역할을 바꿔서 계산한 결과 중에서 더 큰 값을 반환
        return Math.max(getAnswer(arrayA, arrayB), getAnswer(arrayB, arrayA));
    }
}