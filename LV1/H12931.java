package LV1;

import java.util.Arrays;

public class H12931 {
    public static int solution(int n) {
        int answer = 0;

        int length = (int)(Math.log10(n)+1);                //n 의 자릿수

        for(int i=0; i<length; i++) {
            answer+=n%Math.pow(10, i+1)/Math.pow(10, i);    //10의 n승만큼 계속 나누면서 각 자릿수를 더함
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(Arrays.toString(new int[]{solution(n)}));
    }
}