package LV1;

public class H82612 {
    public static long solution(int price, int money, int count) {
        long answer = 0;
        for(int i=1; i<=count; i++){
            answer += price*i;  //price*1 잘못 넣었다.ㅠㅠ
        }
        if(answer > money){
            answer -= money;
        }else {
            answer = 0;
        }
        return answer;
    }



    public static void main(String[] args){
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(solution(price, money, count));
    }
}
