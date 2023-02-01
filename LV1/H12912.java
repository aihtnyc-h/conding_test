package LV1;

public class H12912 {
    public static long solution(int a, int b) {
        long answer = 0;
        if (a != b){
            for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                answer += i;
            }
        }else {
            answer = a;
        }

        return answer;
    }
    public static void main(String[] args){
        int a1 = 3;
        int b1 = 5;
        int a2 = 3;
        int b2 = 3;
        int a3 = 5;
        int b3 = 3;
        System.out.println(solution(a1, b1));
        System.out.println(solution(a2, b2));
        System.out.println(solution(a3, b3));
    }
}
