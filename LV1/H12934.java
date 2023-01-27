/*
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */
package LV1;

import java.util.Arrays;

public class H12934 {
    public static long solution(long n) {
        if(Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long)Math.pow((int)Math.sqrt(n)+1,2);
        }

        return -1;
    }
    public static void main(String[] args) {
        long n = 121;
        long n1 = 3;
        System.out.println(Arrays.toString(new long[]{solution(n)}));
    }
}
