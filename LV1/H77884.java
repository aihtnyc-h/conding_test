package LV1;
/*
두 정수 left와 right가 매개변수로 주어집니다.
left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 */
/*
약수를 어떻게 표현할 것인가?  -> 제곱근으로 표현해보자! Math.sqrt를 이용하자!

 */
public class H77884 {
    public static int solution(int left, int rigth) {
        int answer = 0;

        // 제곱근이 있으면 약수의 개수가 홀수
        for (int num = left; num <= rigth; num++) {
            //int n = (int) Math.sqrt(num); // Math.sqrt는 double이기에 앞에 int써주기! -> 왼쪽과 오른쪽이 정수 n에 넣기 위해서
            //if (n * n == num) answer -= num;    // 프로그래머스에서는 이거 넣으면 안돌아감..
            if (num % Math.sqrt(num)== 0) answer -= num;
            else answer += num;
        }
        return answer;
    }
    public static void main(String[] args){
        int left = 13;
        int rigth = 17;

        System.out.println(solution( left,  rigth));
    }
}
