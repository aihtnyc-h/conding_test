package LV1;
/*
네오와 프로도가 숫자놀이를 하고 있습니다.
네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
0	zero        z e
1	one         o n
2	two         t w
3	three       t h
4	four        f o
5	five        f i
6	six         s i
7	seven       s e
8	eight       e i
9	nine        n i
 */
import java.util.Arrays;

public class H81301 {
    public static int solution(String s){
        int len = s.length()-1; // 0부터 시작하기에
        String b = "";

        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == 'o' && i<len){ // 1
                if (s.charAt(i) == 'o' && s.charAt(i+1) == 'n') b+= "1"; // one인 경우! -> o와 n이 들어있으면 1
            }

            if (s.charAt(i) == 't' && i<len){ // 2 3
                if (s.charAt(i) == 't' && s.charAt(i+1) == 'w') b+= "2"; // two인 경우! -> 와 t이 들어있으면 w
                if (s.charAt(i) == 't' && s.charAt(i+1) == 'h') b+= "3"; // three인 경우! -> 와 t이 들어있으면 h
            }

            if (s.charAt(i) == 'f' && i<len){ // 4 5
                if (s.charAt(i) == 'f' && s.charAt(i+1) == 'o') b+= "4"; // four인 경우! -> 와 f이 들어있으면 o
                if (s.charAt(i) == 'f' && s.charAt(i+1) == 'i') b+= "5"; // five인 경우! -> 와 f이 들어있으면 i
            }

            if (s.charAt(i) == 's' && i<len){ // 6 7
                if (s.charAt(i) == 's' && s.charAt(i+1) == 'i') b+= "6"; // six인 경우! -> 와 s이 들어있으면 i
                if (s.charAt(i) == 's' && s.charAt(i+1) == 'e') b+= "7"; // seven인 경우! -> 와 s이 들어있으면 e
            }

            if (s.charAt(i) == 'e' && i<len){ // 8
                if (s.charAt(i) == 'e' && s.charAt(i+1) == '1') b+= "8"; // eight인 경우! -> 와 e이 들어있으면 i
            }

            if (s.charAt(i) == 'n' && i<len){ // 9
                if (s.charAt(i) == 'n' && s.charAt(i+1) == 'i') b+= "9"; // nine인 경우! -> 와 n이 들어있으면 i
            }

            if(s.charAt(i)=='z') b+="0"; // 0
            if('0'<=s.charAt(i)&&s.charAt(i)<='9') b+=s.charAt(i)-48;   // 값이 숫자인 경우
            }

        int answer = Integer.parseInt(b); //  구한 값을 int형을 변환 -> 결과적으로 숫자로 만들어야하기 떄문
        return answer;
    }
    public static void main(String[] args){
        String s = Arrays.toString(new String[]{"one4seveneight"});
        System.out.println(solution(s));
    }
}
