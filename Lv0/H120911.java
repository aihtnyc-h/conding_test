package Lv0;

import java.util.Arrays;

public class H120911 {
    public static String solution(String my_string) {
        String answer = "";
        String[] arry = my_string.toLowerCase().split("");

        Arrays.sort(arry);

        for(int i = 0; i<arry.length; i++){
            answer += arry[i];
        }
        return answer;
    }
    public static void main(String[] args){
        String my_string = "Bcad";
        System.out.println(solution(my_string));
    }

}
