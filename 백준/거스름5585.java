package 백준;
/*
타로는 자주 JOI잡화점에서 물건을 산다.
JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 언제나 거스름돈 개수가 가장 적게 잔돈을 준다.
타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
입력은 한줄로 이루어져있고, 타로가 지불할 돈(1 이상 1000미만의 정수) 1개가 쓰여져있다.
 */

// change 배열에 동전을 저장
// remain 돌려줘야하는 돈에 1000 - 물건 값
// 출력할 count 선언
// for문 돌려서 500엔 부터 몫을 카운트에 넣고 나머지를 remain에 넣어주기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 거스름5585 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int cost = Integer.parseInt(br.readLine());
            int[] coinArr = {500, 100, 50, 10, 5, 1};
            cost = 1000-cost;
            int num =0;
            for(int i=0; i<6; i++){
                if(cost/coinArr[i]>0){
                    num += cost/coinArr[i];
                    cost = cost%coinArr[i];
                }
            }
            System.out.println(num);
        }
    }
