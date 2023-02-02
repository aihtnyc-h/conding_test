package 시험;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
르탄이가 가지고 있는 돈 1000원
편의점 잔돈 (다양하게 있음)500원, 100원, 50원, 10원
르탄이가 물건을 사고 1000원 지폐를 냈을 때 잔돈의 개수를 구하는 프로그램

그리디
거스름돈의 경우는 구현문제이기 때문에 일일히 if문을 통해서 문제를 풀어내보려고 했습니다.
while(Cost>0)을 통해서 루프를 통해서 Cost 값을 계속 줄여가면서 0원이 될때까지 줄어가는 방식으로 구현했습니다
160
900
550
320
 */
public class purchase {
    public static void main(String[] args) throws IOException {

        //그냥 풀었을 때
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //BufferedReader 정수를 읽는데 사용
        int cost = Integer.parseInt(br.readLine());
        cost = 1000-cost;
        int num =0;
        while(cost>0){
            if(cost/500>0){
                num += cost/500;
                cost = cost%500;
            }
            else if(cost/100>0){
                num += cost/100;
                cost = cost%100;
            }
            else if(cost/50>0){
                num += cost/50;
                cost = cost%50;
            }
            else if(cost/10>0){
                num += cost/10;
                cost = cost%10;
            }
            else{
                num += cost/1;
            }
        }
        System.out.println(num);

//        그리디로 풀었을 경우!
//        어차피 계산할때부터 애초에 금액이 1000원의 남은 잔돈을 가지고 나머지 금액을 계속 빼가는 방식입니다.
//        즉, 500원을 최대한 빼주면 적어도 500원이 새로 생기는 경우는 없을 겁니다.
//        우리는 이런 추측을 바탕으로 100원이나 50원 10원 5원에도, 적용할 수 있습니다.
//        각 금액별로 딱 한번씩만 값을 나누면서 그 값을 num에 저장하면됩니다. 그러면 정답이 나오게 됩니다.
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cost = Integer.parseInt(br.readLine());
//        int[] coinArr = {500, 100, 50, 10};
//        cost = 1000 - cost;
//        int num = 0;
//
//        for (int i = 0; i < 4; i++) {
//            if (cost / coinArr[i] > 0) {
//                num += cost / coinArr[i];
//                cost = cost % coinArr[i];
//            }
//        }
//        System.out.println(num);

    }
}

        //public static void main(String[] args){
//            int num1 = 160;
//            int num2 = 900;
//            int num3 = 550;
//            int num4 = 320;
//
//            System.out.println(solution(num1));
//            System.out.println(solution(num2));
//            System.out.println(solution(num3));
//            System.out.println(solution(num4));
//        }




