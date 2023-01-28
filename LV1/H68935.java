package LV1;

public class H68935 {
    public static int Solution(int num) {
        int answer = 0;
        String three = Integer.toString(num, 3);      // n을 3진법으로 변환

        StringBuffer sb = new StringBuffer(three);        // StringBuffer 뭐로 선언할까 고민해보장
        String rev = sb.reverse().toString();

        answer = Integer.parseInt(rev, 3);


        return answer;
    }
    public static void main(String[] args) {
        int num = 45;
        System.out.println(Solution (num));
    }
}
/*
//3진법 나누다가 틀려부렸다 다시 풀어보자
//어디가 잘못되었는지 찾아보기!
int ans = 45;

       while (num >0) {
           ans = (num % 3) + ans;
           num /= 3;
					System.out.println(num);
       }

        return ans;;

        //i-- 를 넣어서 거꾸로 !
*/