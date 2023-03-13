package Lv0;


import java.util.Arrays;

public class H120912 {
    public static int solution(int[] array) {
        return (int) Arrays.stream(Arrays.toString(array).replaceAll("[^0-9]", "")
                        .split(""))
                .filter(i -> i.equals("7"))
                .count();
    }
    public static void main(String[] args){
        int[] array = {7, 77, 17};
        System.out.println(solution(array));
    }
}
