/*
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 */
package LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class H12917 {

    // 문자열 정렬  -> 문자열을 char배열로 변환해서 Arrays.sort메소드를 이용해 오름차순 정렬을 한 후 for문을 돌려서 다시 내림차순으로 바뀜!
    // int형과 char형의 형변환 다시 공부하기!
    public static String solution(String s) {
        String answer = "";
        char[] temp = s.toCharArray();
        int[] intTemp = new int[temp.length];
        for (int i = 0; i < temp.length ; i++) {
            intTemp[i] = (int) temp[i];
        }
        Arrays.sort(intTemp);
        for (int i = 0; i < intTemp.length; i++) {
            temp[intTemp.length-1-i]= (char)intTemp[i];
        }
        answer = new String(temp);
        return answer;
    }


    public static void main(String[] args) {
        String[] s = new String[]{"Zbcdefg"};
        System.out.println((solution(Arrays.toString(s))));
    }
}
