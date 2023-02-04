package Lv0;

public class H120898 {
    public static int solution(String message) {
        int answer = 0;
        answer = message.length() * 2;
        return answer;
    }
    public static void main(String[] args){
        String meessage1 = "haappy birthday!";
        System.out.println(solution(meessage1));
    }
}
