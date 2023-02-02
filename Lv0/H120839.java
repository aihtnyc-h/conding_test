package Lv0;
/*
가위는 2 바위는 0 보는 5로 표현합니다.
가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
 */
public class H120839 {
    public static String solution(String rsp) {
        String answer = "";
        String[] rspA = rsp.split("");

        for (int i = 0; i < rspA.length; i++) {
            if (rspA[i].equals("2")) { // 가위
                answer += "0"; // 바위
            } else if (rspA[i].equals("0")) { // 바위
                answer += "5"; // 보
            } else if (rspA[i].equals("5")) { // 보
                answer += "2"; // 가위
            }
        }
            return answer;

    }
    public static void main(String[] args){
        String rsp1 = "2";
        String rsp2 = "205";
        System.out.println(solution(rsp1));
        System.out.println(solution(rsp2));
    }
}

