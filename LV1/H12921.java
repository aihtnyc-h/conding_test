package LV1;

import java.util.*;


/*
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)
 */
// 에라토스테니스의 체
//
public class H12921 {
    public static int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n + 1];

        //에라토스테니스의 체 사용
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i < prime.length ; i++) {
            if (prime[i]){
                for (int j = i * i; j < prime.length; j += i) {         // * 를 계속 까먹는다..!!! 꼭 넣어줘야한다
                    prime[j] = false;
                }
            }
        }

        // 소수의 개수 세기
        for (int i = 1; i < prime.length; i++) {
            if (prime[i]){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(solution(n));
    }
}
