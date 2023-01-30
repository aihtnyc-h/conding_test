package LV1;

import java.util.Arrays;

/*
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
 */
public class H1277 {
        public static int answer = 0;
        public static int solution(int[] nums) {

            for(int i = 0; i < nums.length; i++){
                for(int j = i+1; j< nums.length; j++){
                    for(int k = j+1; k < nums.length; k++){
                        int sum = nums[i] + nums[j] + nums[k];
                        check(sum);
                        //https://docs.oracle.com/javase/8/docs/api/java/util/zip/Checksum.html
                        //https://en.wikipedia.org/wiki/Checksum
                    }
                }
            }
            return answer;
        }

        // 소수 판단 함수
        public static void check(int num){
            int i = 2;
            while (i*i <= num){
                // 소수가 아닐 때
                if(num%i == 0){
                    return;
                }
                i+=1;
            }
            answer++;
        }


    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4};
        System.out.println(solution(nums));
    }
}