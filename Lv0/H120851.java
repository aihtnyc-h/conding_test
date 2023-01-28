package Lv0;

public class H120851 {
    public static int solution(String my_string){
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++)
            if (Character.isDigit(my_string.charAt(i)))
                answer += Integer.parseInt(my_string.charAt(i) + "");

        return answer;
    }

    public static void main(String[] args){
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }
}
