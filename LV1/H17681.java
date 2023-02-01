package LV1;

import java.util.Arrays;

/*
이진법 계산하는 방법을 찾아보자!!
toBinaryString
 */
public class H17681 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String s = "";
        for(int i=0; i<n; i++) {
            String one = Integer.toBinaryString(arr1[i]);          //arr1의 i번째 정수를 2진법으로 바꿈
            String two = Integer.toBinaryString(arr2[i]);          //arr2의 i번째 정수를 2진법으로 바꿈
            String oneF = String.format("%0" + n + "d", Long.parseLong(one));   //길이가 n인 String으로 바꾸되 남는 왼쪽
            String twoF = String.format("%0" + n + "d", Long.parseLong(two));   //자리는 '0'으로 채움

            for(int j=0; j<n; j++) {
                if(oneF.charAt(j) == '0' && twoF.charAt(j) == '0'){ //j번째 정수가 둘다 0 이면
                    s+=" ";         //공백을 채움
                }else {
                    s+="#";
                }
            }

            answer[i]=s;
            s = "";
        }
        return answer;
    }
    public static void main(String[] args){
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30, 1, 21, 17, 2};
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
    }
}
