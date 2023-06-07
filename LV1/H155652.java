package LV1;

public class H155652 {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();  // 결과 문자열을 저장할 StringBuilder를 선언

        for (char c : s.toCharArray()) {  // 문자열 s를 한 문자씩 순회한다.
            int counter = index;  // counter 변수를 index로 초기화하고 변수는 알파벳을 몇 칸 이동할지를 결정한다.
            while (counter > 0) {  // counter가 0보다 클 동안 반복한다.
                c++;  // 문자 c를 한 칸 뒤로 이동시킨다.
                if (c > 'z') {  // 만약 문자 c가 'z'를 넘어갈 경우
                    c = 'a';  // 문자 c를 'a'로 돌려놓는다.
                }
                if (!skip.contains(String.valueOf(c))) {  // 만약 문자 c가 skip에 포함되지 않은 경우
                    counter--;  // counter를 하나 감소시킨다. 이는 실제로 알파벳을 한 칸 이동시키는 것을 의미한다.
                }
            }
            answer.append(c);  // 최종적으로 이동한 문자 c를 결과 문자열에 추가한다.
        }

        return answer.toString();  // 결과 문자열을 String 형태로 변환하여 반환한다.
    }
}