// 배열 원소의 길이
/*
문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
 */
public class H120854 {
    public int[] solution(String[] strlist) {
        int x = strlist.length;
        int[] y = new int[x];
        int z = 0;

        for (int i = 0; i<x; i++){
            y[i] = strlist[i].length();
        }
        int[] answer = {2};
        return y;
    }
}