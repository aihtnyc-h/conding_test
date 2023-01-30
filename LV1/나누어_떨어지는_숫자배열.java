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

HashSet
HashSet이란 set 인터페이스를 구현한 클래스입니다. 순서가 없고 중복을 허용하지 않는다라는 특징을 가지고 있습니다.
Hash는 일반 배열들 보다 빠른 검색이 가능합니다.

Iterator
Iterator는 자바에서 collrection Framework에서 값을 가져오거나 삭제할 때 사용을 합니다. Iterator는 모든 컬렉션 프레임워크에 공통으로 사용 가능하며, 컬렉션 프레임워크에서 쉽게 값을 가져오고 제거할 수 있다는 특징이 있습니다.
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
