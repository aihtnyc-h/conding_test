package LV1;
/*
자연수 n이 매개변수로 주어집니다.
n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
답이 항상 존재함은 증명될 수 있습니다.
 n % x -> 1
 n보다 작은 수 중에서 나누었을 때 나머지가 1이면 그 숫자를 리턴!
 */
public class H87389 {
    public static int solution(int n) {
       int answer = 0;

        for (int x = 1; x < n; x++) {
            if (n % x == 1){
                return x;
            }

        }

        return answer;
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(solution(n));
    }
}
