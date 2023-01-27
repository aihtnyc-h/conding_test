package LV1;

public class H12922 {
    public static String solution(int n) {
        String answer = "";
        for(int i=1; i<=n; i++) {
            if(i%2!=0) {
                answer+="수";
            }else {
                answer+="박";
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }
}