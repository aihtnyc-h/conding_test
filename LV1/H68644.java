package LV1;

import java.util.*;

public class H68644 {
    public static int[] solution(int[] numbers) {  //정답을 담을 ArrayList 생성

            HashSet<Integer>set= new HashSet<Integer>();   //중복값을 지워줄 HashSet 생성

            for(int i=0;i<numbers.length-1;i++) {
                for(int j=i+1;j<numbers.length;j++) {
                    set.add(numbers[i]+numbers[j]);  //HashSet에 두 수의 합을 저장
                }
            }
            Integer[] answerInt = set.toArray(new Integer[0]);      // set -> Integer 배열로 전환하는거
            int[] answer = Arrays.stream(answerInt).mapToInt(Integer::intValue).toArray();      // Integer -> int배열 전환    //mapToInt올바른 동작을 유지   mapToInt(Integer::intValue)
            Arrays.sort(answer);
            //ArrayList<Integer>list=new ArrayList<>(set);  //Set은 순서가 없기때문에 ArrayList로 변환
            //list.sort(null);  // collrection.sort가 아닌 ArrayList의 sort를 사용

            return answer;
        }
    public static void main(String[] args) {
        int[] numbers = new int[]{2,1,3,4,1};
        System.out.println(Arrays.toString(new int[][]{solution(numbers)}));
    }
}
// a, b, c, d가 있으면 각각 더해서 값을 도출하고 오름차순으로 정렬한다.