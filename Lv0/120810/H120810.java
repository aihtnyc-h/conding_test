// 나머지 구하기
/*
문제 설명
정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
 */
public class H120810 {
    public int solution(int num1, int num2) {
        int answer = -1;
        if(0<=num1 && 100>=num1 && 0<=num2 && 100>=num2){
            answer = (num1 % num2);
        }
        return answer;
    }
}