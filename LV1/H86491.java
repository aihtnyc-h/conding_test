package LV1;

import java.util.Arrays;

public class H86491 {

    public static int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for (int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);

            if (max > width) width = max;
            if (min > height) height = min;
        }

        return width * height;
    }

    // 결과값 뭐로 넣을지 고민하기
    public static void main(String[] args){

        System.out.println();

    }
}
/*
오늘도 실패...
public static void main(String[] args){
        int[] width = new int[0];
        int[] height = new int[0];
        int[] sizes = width * height;
        System.out.println(sizes);
 */