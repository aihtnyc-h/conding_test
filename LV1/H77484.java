package LV1;

import java.util.ArrayList;
import java.util.Arrays;

public class H77484 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        // 반복문으로 로또 번호를 읽을 수 있게 넣어주고
        // 읽을 수 있는 숫자 중 맞춘 번호를 count 저장해서 카운트
        int count = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                    break;  // 반복문 멈추기 맞을 경우 빠져나오기
                }
            }
        }
        // 읽을 수 없는 숫자를 zero에 저장해서 카운트!
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
            }
        }
        int max = count + zero; //최대 일치 번호
        int min = count;        // 최소 일치 번호
        if (max == 1 || max == 0) max = 1;
        if (min == 1 || min == 0) min = 1;

        // 일치 번호에 따른 순위 결정!
        answer[0] = 7 - max;
        answer[1] = 7 - min;
        return answer;
    }
/*
    public static void main(String[] args){
        int[] lottos = new int[]{1,2,3,4,5};
        int[] win_nums = new int[]{31,10,45,1,6,19};
        System.out.println((solution(lottos));
        System.out.println((solution(win_nums));
    }
    }
*/
}

