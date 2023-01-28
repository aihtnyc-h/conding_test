package LV1;
import java.util.*;
public class H12906 {
    public static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>(); //배열 리스트를 쓰자
        int tem = -1;
        for (int i = 0; i < arr.length; i++) {
            if (tem != arr[i]) {          // arr의 i번째 정수가 tem과 같지 않으면
                tem = arr[i];           // tem에 저장하고
                list.add(arr[i]);       // list에 저장
            }

        }
        int[] answer = new int[list.size()];     //크기가 list만 배열

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);

        }
        return answer;
    }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(solution(arr)));
    }

}
