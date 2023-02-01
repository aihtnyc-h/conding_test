package LV1;
//substring(시작index, 끝index +1)
public class H12903 {
    public static String solution(String s) {
        String answer = "";
        return s.substring((s.length()-1)/2, s.length()/2+1);


    }
//    int a = word.length();
//    String word1;
//    if ( a % 2 == 0 )
//    word1 = word.substring(a/2 - 1, (a/2) + 1);
//    else
//    word1 = word.substring((a/2), (a/2) + 1);
//    return word1;
//}
    public static void main(String[] args){
        String s1 = "abcde";
        String s2 = "qwer";
        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }
}
