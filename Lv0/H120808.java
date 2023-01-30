package Lv0;

// 분수의 덧셈
/*
첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class H120808 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int den = denom1*denom2; // 분모
        int num = numer1*denom2 + numer2*denom1; // 분자
        int max = 1;

        for(int i = 1; i <= den && i <= num; i++){ // 최대 공약수
            if(den % i == 0 && num % i == 0){
                max = i;
            }
        }
        answer[0] = num / max; //분자
        answer[1] = den / max; //분자

        return answer;
    }
    public static void main(String[] args){

        System.out.println();
    }
}