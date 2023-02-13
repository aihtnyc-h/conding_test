package Lv0;
// Z가 나오면 바로 전에 더했던 숫자를 뺀다.
import java.util.LinkedList;
public class H120853 {
    public static int solution(String s) {
        int answer = 0;

        LinkedList<Integer> numbers = new LinkedList<>();

        if (!s.isEmpty()) {
            String[] split_s = s.split(" ");

            for (int i = 0; i < split_s.length; i++) {
                if (split_s[i].equals("Z")) {
                    if (i - 1 >= 0 && numbers.size() > 0)
                        numbers.removeLast();
                }
                else
                    numbers.add(Integer.valueOf(split_s[i]));
            }
        }

        for (Integer number : numbers) {
            answer += number;
        }

        return answer;
    }
    public static void main(String[] args){
        String s = "1 2 Z 3";
        // 1 + 2 -2 +3 = 4
        System.out.println(solution(s));
    }
}

