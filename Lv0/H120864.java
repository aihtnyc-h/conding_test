package Lv0;

public class H120864 {
	public static int solution(String my_string) {
		int answer = 0;                                     //모든 숫자를 더할 변수
		String[] split=my_string.split("[a-zA-z]+");        //매개변수로 들어온 문자열을 대소문자 알파벳을 기준으로 스플릿
		for(int i=0; i<split.length; i++) {
			if(split[i].matches("[0-9]+")) {            //배열의 i번째 값이 정수면
				answer+=Integer.parseInt(split[i]);     //answer에 더함
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		System.out.println(solution(my_string));
	}

}
