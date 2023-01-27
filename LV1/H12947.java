/*
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 */
package LV1;

import java.util.Arrays;

public class H12947 {
    public static boolean solution(int x){
        String[] str = String.valueOf(x).split("");     // 정수의 각 자리 수가 배열의 요소가 되는 문자열 배열로 바꾸려면, 먼저 문자열로 바꾸고 split을 이용해서 끊어줌
        int sum = 0;
        for (String s : str){
            sum += Integer.parseInt(s);
        }
        if (x % sum == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        int x = 18;
        System.out.println(Arrays.toString(new boolean[]{solution(x)}));
    }
}
