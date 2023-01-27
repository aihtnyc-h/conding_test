/*
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 */
package LV1;

import java.util.*;
public class H12935 {
    public static int[] solution(int[] arr) {
        if(arr.length <= 1) return new int[] {-1};

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int a : arr) {
            list.add(a);
        }
        Integer min = Collections.min(list);
        list.remove(min);
        int[] answer = new int[arr.length - 1];
        for (int i = 0; i < list.size(); ++i) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
