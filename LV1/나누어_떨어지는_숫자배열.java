package LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 나누어_떨어지는_숫자배열 {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = new int[0];
/*
ArrayList
ArrayList는 자바에서 정말 많이 사용이 되며, list 인터페이스를 상속받은 클래스입니다. 기존 배열과  틀린점은 가변성으로써 크기를 따로 선언을 해주지 않아도 된다는 점과 list의 수많은 함수들을 사용할 수 있다는 점입니다.
 */
        ArrayList<Integer> list= new ArrayList<Integer>();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%divisor == 0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        Integer[] answerInt = list.toArray(new Integer[list.size()]);
        if (answerInt.length == 0){
            answer = new int[1];
            answer[0] =- 1;
        } else {
            answer = Arrays.stream(answerInt).mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {5,9,7,10};
        int divisor = 5;
        System.out.println(Arrays.toString(solution(arr,divisor)));
    }
}
