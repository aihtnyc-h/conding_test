package LV1;

import java.util.Arrays;

public class H12950 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
    public static void main(String[] arg){
        int[][] arr1 = new int[][]{{1,2},{2,3}};
        int[][] arr2 = new int[][]{{3,4},{5,6}};

        System.out.println(solution(arr1, arr2));
    }
}
