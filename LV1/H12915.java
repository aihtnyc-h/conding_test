package LV1;

import java.util.Arrays;

/*
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
 */
public class H12915 {
    public static String[] solution(String[] strings, int n){
        String[] answer = new String[strings.length];

        for (int i = 0; i < strings.length ; i++) {
            strings[i] = strings[i].charAt(n)+strings[i];           // string의 i번째 문자열 제일 앞에 n번째 문자를 붙임
        }
        Arrays.sort(strings);                                       //정렬
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(1);          // 제일 앞에 붙였던 문자를 다시 제거!
        }
        return answer;
    }
    public static void main(String[] args){
        String strings[] = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(solution(strings, n)));
    }
}
