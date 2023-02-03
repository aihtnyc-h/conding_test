package Lv0;

import java.util.Arrays;

public class H120842 {
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int count = 0;

        for (int i = 0; i < num_list.length/n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[count];
            }
        }
        return answer;
    }
    public static void main(String[] args){
        int[] num_list = {1,2,3,4,5,6,7,8};
        int n = 2;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }
}
