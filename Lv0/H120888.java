package Lv0;

import java.util.Stack;

public class H120888 {
    public static String solution(String my_string) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            //my_string.indexOf(my_string.charAt(i));
            if(i==my_string.indexOf(my_string.charAt(i)))
                answer+=my_string.charAt(i);
        }

        return answer;
    }
    public static void main(String[] args){
        String my_string = "people";
        System.out.println(solution(my_string));
    }
}
