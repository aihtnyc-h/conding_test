// 피자 나눠 먹기(2)
/*
머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
 */
class GCD{                                          //최대공약수를 구하는 메소드
    public static int getGCD(int num1, int num2) {
        if(num1%num2==0) {                          //num1을 num2로 나눠서 나머지가0이면
            return num2;                            //최대공약수는 num2
        }
        return getGCD(num2, num1%num2);             //나머지가 있으면 num2와 같이 다시 GCD메소드에 넣음(재귀)
    }
}
public class H120815 {
    public int solution(int n) {
        int answer = 0;
        int gcd=GCD.getGCD(n, 6);                   //매개변수로 들어온 n과 6의 최대공약수
        int lcm=n*6/gcd;                            //n과 6의 최소공배수(조각수)
        answer=lcm/6;                               //6으로 나눔(피자개수)
        return answer;
    }
}
