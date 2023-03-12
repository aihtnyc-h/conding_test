package Lv0;

public class H120871 {
    public static int solution(int n) {
        int answer = n;
        // 1부터 시작
        int i = 1;
        while (i <= answer) {
            if ((i % 3 == 0) || String.valueOf(i).contains("3")) {
                answer++;
            }
            i++;
        }
        return answer;
    }
    public static void main(String[] args){
        int n = 15;
        System.out.println(solution(n));
    }
}
