package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class H120835 {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i: emergency){
            al.add(i);
        }
        Collections.sort(al, Collections.reverseOrder());
        for (int i = 0; i < answer.length; i++) {
            answer[i] = al.indexOf(emergency[i])+1;
        }
        return answer;
    }
    public static void main(String[] args){
        int[] emergency = {3,76,24};
        System.out.println(Arrays.toString(solution(emergency)));
    }
}
