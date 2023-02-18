package Lv0;

public class H120910 {
    public static int solution(int n, int t) {


        for (int i = 0; i <t; i++) {
            n *= 2;
        }
        return n;
    }
    public static void main(String[] args){
        int n = 2;
        int t = 10;
        System.out.println(solution(n, t));
    }
}
