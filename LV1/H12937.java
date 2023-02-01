package LV1;

public class H12937 {
    public static String solution(int num) {
        String answer = "";

        //if (num >=1) {      // 테스트 케이스가 음수인것도 있다고 한다;;;
            if (num % 2 == 0) {
                answer = "Even";
            } else {
                answer = "Odd";
            }
        //}


        return answer;
    }
    public static void main(String[] args){
        int num1 = 3;
        int num2 = 4;
        System.out.println(solution(num1));
        System.out.println(solution(num2));
    }
}
