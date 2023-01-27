package LV1;/*
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수,solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class H12910 {
    static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();    //  ArrayList< 여기 >안에 정수 int는 안돼는가!

        for(int i = 0; i <arr.length; i++){
            if(arr[i] %divisor == 0) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        Integer[] answerInt = list.toArray(new Integer[list.size()]);
        if(answerInt.length == 0) {             // 배열의 길이가 0이면
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = Arrays.stream(answerInt).mapToInt(Integer::intValue). toArray();        // int 배열로 변환 작업
        }

        return answer;
    }
    public static void main(String[] args) {
        int arr1[]={5,9,7,10};
        int divisor1=5;
        System.out.println(Arrays.toString(solution(arr1,divisor1)));

        int arr2[]={2,36,1,3};
        int divisor2=1;
        System.out.println(Arrays.toString(solution(arr2,divisor2)));
        int arr3[]={3,2,6};
        int divisor3=10;
        System.out.println(Arrays.toString(solution(arr3,divisor3)));
    }
}