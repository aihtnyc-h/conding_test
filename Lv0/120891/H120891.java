import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class H120891 {
    public int solution(int order) {
        int answer=0;                                       //3, 6, 9 가 몇번 들어있는 담을 answer
        String[] ss=String.valueOf(order).split("");        //order 를 String 으로 바꾸고 한 문자씩 split
        ArrayList<String> arr=new ArrayList<String>(Arrays.asList(ss));
        answer+=Collections.frequency(arr, "3");            //3이 들어간 횟수
        answer+=Collections.frequency(arr, "6");            //6이 들어간 횟수
        answer+=Collections.frequency(arr, "9");            //9가 들어간 횟수
        return answer;
    }
}