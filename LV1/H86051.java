package LV1;

import java.util.Arrays;

public class H86051 {
    public static int solution(int[] numbers) {
        int answer = 45;
        for (int i : numbers) {
            answer -= i;
        }
        return answer;
    }
    public static void main(String[] args){
        int[] numbers1 = new int[]{1, 2, 3, 4, 6, 7, 8, 0};
        int[] numbers2 = new int[]{5,8,4,0,6,7,9};
        System.out.println(solution(numbers1));
        System.out.println(solution(numbers2));
    }
}
