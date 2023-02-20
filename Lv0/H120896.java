package Lv0;

public class H120896 {
    public static String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                answer += (char)(i + 97);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        String s = "abcabcadc";
        System.out.println(solution(s));
    }
}
