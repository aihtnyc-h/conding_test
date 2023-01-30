package Lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class H120905{
    public static int[] solution(int n, int[] numlist){
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i : numlist) {
            //for (int i = 1; i <numlist.length ; i++) { 실패 결과가  3,6 나옴 -> for each문을 써보자!
            //for each는 while for문과 다르게 사용, 객체에 크기만큼 반복 횟수를 정합니다.
            if (i%n == 0){
                arr.add(i);
                // arr를 int로 변환이 필요함 이대로 출력하면 아무것도 안나옴
            }
        }
        answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
    public static void main(String[] args){
        int n = 3;
        int[] numlist = {4,5,6,7,8,9,10,11,12};
        System.out.println(Arrays.toString(solution(n, numlist)));
    }
}
