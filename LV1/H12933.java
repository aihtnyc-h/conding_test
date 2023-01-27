/*
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */
package LV1;

import java.util.Arrays;
import java.util.Collections;

public class H12933 {
    public static long solution(long n) {
        String[] answer = String.valueOf(n).split("");
        Arrays.sort(answer, Collections.reverseOrder());
        return Long.parseLong(String.join("", answer));
    }
        public static void main(String[] args) {
            long n = 118372;
            System.out.println(Arrays.toString(new long[]{solution(n)}));
        }
    }
