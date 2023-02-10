package Lv0;

public class H120844 {
    public static int[] solution(int[] numbers, String direction) {
        if(direction.equals("right")){
            int temp=numbers[numbers.length-1];
            for(int i=numbers.length-1; i>0; i--){
                numbers[i]=numbers[i-1];
            }
            numbers[0]=temp;
        }else{
            int temp=numbers[0];
            for(int i=0; i<numbers.length-1; i++){
                numbers[i]=numbers[i+1];
            }
            numbers[numbers.length-1]=temp;
        }
        return numbers;
    }
    public static void main(String[] args){
        int[] numbers = {1,2,3};
        String description = "right";
        System.out.println(solution(numbers, description));
    }
}
