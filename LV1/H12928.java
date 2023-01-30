package LV1;

public class H12928 {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n%i == 0){
                answer += i;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        int n = 12;
        System.out.println(solution(n));
    }
}
