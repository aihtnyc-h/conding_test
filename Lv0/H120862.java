package Lv0;

public class H120862 {
    public static int solution(int[] numbers) {
            int answer = -1000000000;
            for(int i=0;i<numbers.length;i++){
                for(int j=i+1;j<numbers.length;j++){
                    if(answer<numbers[i]*numbers[j]) answer=numbers[i]*numbers[j];
                }
            }
            return answer;
        }
    public static void main(String[] args){
        int[] numbers = {1, 2, -3, 4, -5};
        System.out.println(solution(numbers));
    }
}
