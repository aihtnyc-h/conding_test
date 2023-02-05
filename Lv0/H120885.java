package Lv0;

import java.util.Scanner;

public class H120885 {
    public static String solution(String bin1, String bin2) {
        String answer = "";
        long num1 = 0, num2 = 0, sum = 0;

        long cnt = 1;
        for (int i = bin1.length() - 1; i >= 0; i--) {
            num1 += Long.parseLong(bin1.charAt(i) + "") * cnt;
            cnt *= 2;
        }

        cnt = 1;
        for (int i = bin2.length() - 1; i >= 0; i--) {
            num2 += Long.parseLong(bin2.charAt(i) + "") * cnt;
            cnt *= 2;
        }

        sum = num1 + num2;
        while (sum >= 1) {
            answer = sum % 2 + answer;
            sum /= 2;
        }

        return (answer == "" ? answer = "0" : answer);
    }

    public static void main(String[] args){
        String bin1 = "10";
        String bin2 = "11";
        System.out.println(solution(bin1, bin2));
    }
}
