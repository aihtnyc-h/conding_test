package Lv0;

public class H120848 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 10; i++) {
            if (n >= factorial(i)) {
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }

    public static int factorial(int number) {
        if (number > 1) return number * factorial(number - 1);
        return number;
    }
    public static void main(String[] args) {
        int n = 3628800;
        System.out.println(solution(n));
    }
}
