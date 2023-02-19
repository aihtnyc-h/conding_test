package Lv0;

public class H120895 {
    public static String solution(String my_string, int num1, int num2) {
        String[] arr = my_string.split("");

        String temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        return String.join("", arr);
    }
    public static void main(String[] args){
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        System.out.println(solution(my_string, num1, num2));
    }
}
