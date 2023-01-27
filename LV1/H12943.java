/*
1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될 때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.

1-1. 입력된 수가 짝수라면 2로 나눕니다.
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다.
위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요.
단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
 */
package LV1;

import java.util.Arrays;

public class H12943 {
    public static int solution(int num) {
        long n = num;               //숫자가 커질수 있으니 long으로 변환
        int answer = 0;

        if (n == 1) {                //먼저 n이 1일 경우를 잡음
            return 0;
        }

        while (n != 1) {            //n이 1이 될때까지 while을 돌림
            if (n % 2 == 0) {       //n이 짝수일경우
                n /= 2;
            } else {                //n이 홀수일경우
                n *= 3;
                n += 1;
            }
            answer++;               //answer에 카운트
            if (answer == 501) {    //answer가 500을 넘어가면
                break;              //더이상 반복문 돌릴 필요가 없음
            }
        }

        if (answer < 501) {
            return answer;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
          int n = 6;

        System.out.println(Arrays.toString(new int[]{solution(n)}));

    }
}