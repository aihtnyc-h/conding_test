package LV1;

public class 수박수박수박수박수박수 {
    public static String solution(int n){
        String answer = "";
        for (int i = 1; i <= n ; i++) {     // int 1 = 0; 을 하면 박수박수로 나오기에 1부터 시작!지
            if (i%2 != 0){
                answer += "수";
            }else {
                answer += "박";
            }

        }
        return answer;
    }
    public static void main(String[] args){
        int n1 = 3;
        int n2 = 4;
        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }
}
