package LV1;


import java.util.ArrayList;

public class H12925 {
    public static int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);

        return answer;
    }
    public static void main(String[] args){
        String s1 = "1234";
        String s2 = "-1234";
        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }
}
