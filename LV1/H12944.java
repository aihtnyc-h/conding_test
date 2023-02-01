package LV1;

public class H12944 {
    public static double solution(int[] arr) {
//        int count = 0;
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >=1 && arr[i] <=100 ){
//                sum += arr[i];
//                count ++;
//            }
//        }
//        double answer = (double) sum / count;
//        // 런타임 에러... 되긴하는데 그럼 줄여보자!!!
        double answer = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        answer = (double) sum / arr.length;

        return answer;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,5};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }
}
