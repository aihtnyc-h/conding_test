package LV1.H12930_1;

import java.util.*;
public class H12930_1 {

    static String solution(String s) {
        String answer = "";

        String[] strArr = s.split(" ");
        for (int j = 0; j < strArr.length; j++) {
            StringBuilder sb = new StringBuilder(strArr[j]);
            System.out.println(sb);

            for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            } else {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
        }

            if (j == strArr.length - 1) answer += sb;
            else answer += sb + " ";
        }

        int count = s.length() - answer.length();

        return answer + " ".repeat(count);
    }

    public static void main(String[] args) {
        String s = "try hello world";
        String s1[] = {"TrY HeLlO WoRlD"};
        System.out.println(solution(s));
    }
}