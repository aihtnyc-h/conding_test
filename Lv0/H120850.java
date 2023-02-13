package Lv0;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class H120850 {
    public static int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();

        for (char i :my_string.toCharArray()) {
            if (i >= 48 && i <= 57) {
                list.add(Integer.parseInt(String.valueOf(i)));
            }
        }
        return
        list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
    public static void main(String[] args){
        String my_string = "hi12392";
        System.out.println(solution(my_string));
    }
}
