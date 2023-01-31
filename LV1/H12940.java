package LV1;


import java.util.Arrays;

/*
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 */
// 방법 2가지
// 1. max() min()을 사용해서 최대공약수와 최소공배수 만들기
//    맨앞에 최대공약수 max() (큰수/ 작은수) if(나머지) (작은수/나머지),
//    최소공배수 min()을 변수에 넣어주기 n * m / 최대공약수
// 2. GCD A/b를 진행하여 최대공약수를 계산한다.                최대공약수를 구하는 함수    GCD(int n, int m ) return 최대공약수
//    LCM 최소공배수를 구한다.                               최소공배수를 구하는 함수    LCM(int n, int m ) return 최소공배수
//    지역변수에 문제가 생길 가능성 높음 전역 변수화시키자!
// 3. 유클리드 호제법 :임의의 두 자연수 a, b(a > b)가 주어지고 a를 b로 나눈 나머지를 r(r = a % b)로 이라고 하자. a = b가되고 b = r이 되는데, 이때 b가 0이 될 때의 a가 최대공약수
//    최소공배수 : 최소 공배수 * 최대 공약수 = a * b 임을 이용 따라서 최소 공배수 = a * b / 최대 공약수
public class H12940 {

        // 2 방법
        public static int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];

        answer[0] = gcd(a, b);              // 최대공약수
        answer[1] = lcm(a, b, answer[0]);   // 최소공배수 저장

        return answer;
    }
    // 최소공약수 LCM(int n, int m ) return 최소공배수
    public static int lcm(int a, int b, int gcd) {
        if (gcd == 0) return 0;
        return (a * b) / gcd;
    }
    // 최대공배수 GCD(int n, int m ) return 최대공약수
    public static int gcd(int a, int b){
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    //3. 유클리드 호제법
        public static int[] solution(int n, int m) {
            // 최대 공약수
            int a = Math.max(n, m);
            int b = Math.min(n, m);
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }

            // 최대 공배수 = 두 수의 곱 / 최대공약수
            return new int[] { a, n * m / a };
        }



    public static void main(String[] args){
        int n = 3;
        int m = 12;
        System.out.println(Arrays.toString(gcdlcm(n,m)));
    }
}
