package Lv0;
/*
우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
a는 0, b는 1, c는 2, ..., j는 9입니다.
예를 들어 23살은 cd, 51살은 fb로 표현합니다.
나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
a == 0
b == 1
c == 2
d == 3
e == 4
f == 5
g == 6
h == 7
i == 8
j == 9
 */


public class H120834 {
    public static String solution(int age) {
        String answer = "";

        String temp = Integer.toString(age); // 매개변수로 들어온 int를 String으로 바꿈
        for (int i = 0; i < temp.length() ; i++) {  // String의 크기만큼 for문
            answer+=(char) ((char) temp.charAt(i)+49); // String의 i번째 리터럴에 49를 더한 char값을 넣음
        }
        return answer;
    }
    public static void main(String[] args){
        int age = 23;
        System.out.println(solution(age));
    }
}
