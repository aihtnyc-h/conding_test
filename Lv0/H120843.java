package Lv0;

public class H120843 {
    public static int solution(int[] numbers, int k) {
        int answer = numbers[2*(k-1)%numbers.length];
        return answer;
    }
    public static void main(String[] args){
        int[] numbers = {1,2,3,4};
        int k = 2;
        System.out.println(solution(numbers, k));
    }
}
