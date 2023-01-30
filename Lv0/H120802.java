package Lv0;

// 두 수의 합
/*
문제 설명
정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
*/
public class H120802 {
    public static int solution(int num1, int num2) {
        int answer = -1;
        if (-50000 <= num1 && 50000 >= num1 && -50000 <= num2 && 50000 >= num2) {
            answer = (num1 + num2);

        }
        return answer;
    }
    public static void main(String[] args){
        int num1 = 2;
        int num2 = 3;
        System.out.println(num1 + num2);
    }
}

