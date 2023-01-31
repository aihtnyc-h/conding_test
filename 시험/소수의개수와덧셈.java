package 시험;
/*
문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
str에 나타나는 숫자 중 소수의 최대값과 소수가 아닌 수의 최소값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.

예를들어 s가 "2 3 4 5"라면 "4 5"를 리턴하고, "15 3 10 9 7 8"라면 "8 7"을 리턴하면 됩니다.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class 소수의개수와덧셈 {
    public static String solution(String s) {
        //문자열을  문자배열로 바꾼다
        String[] numbers = s.split(" ");
        //문자 배열을 int 배열로 바꾼다.
        int[] arr = Stream.of(numbers).mapToInt(Integer::parseInt).toArray();


        //최대 소수값과 최소 비소수값을 담을 변수 선언
        int max_prime = 0;
        int min_divide = Integer.MAX_VALUE;


        //소수면 true, 아니면 false 문항으로 구분하고 각각의 max, min 값과 비교후 교체
        for (int i : arr) {
            if (check_prime(i)) {
                max_prime = Math.max(max_prime, i);
            } else {
                min_divide = Math.min(min_divide, i);
            }
        }

        //정답을 문자열로 재 작성후 return
        return min_divide + " " + max_prime;
    }

    private static boolean check_prime(int n) {
        for (int j = 2; j <= Math.sqrt(n) ; j++) {
            if (n%1 == 0){
                return false;
            }

        }
        return true;
    }


//        for (int i = 0; i <s.length() ; i++) {
//            for (int j = ; j < s.length(); j++) {
//                for (int k = 0; k < s.length(); k++) {
//                    int sum = s[i] + s[j] + s[k];
//                    cheak(sum);
//                }
//            }
//        }
//        return answer;
//    }
//
//    private static void cheak(int s) {
//        int i = 2;
//        while (i*i <= s){
//            // 소수가 아닐 때
//            if(s%i == 0){
//                return;
//            }
//            i+=1;
//        }
//        s++;
//    }

    public static void main(int[] args) {
        int[] s = new int[]{2, 3, 4, 5};
        System.out.println(solution(Arrays.toString(s)));

    }


}