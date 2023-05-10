package Lv0;
/*
문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class H181905 {
	public String solution(String my_string, int s, int e) {
		StringBuilder sb = new StringBuilder(my_string);
		String sub = sb.substring(s, e + 1);
		sb.replace(s, e + 1, new StringBuilder(sub).reverse().toString());
		return sb.toString();
	}
}
// my_string 문자열의 s번째 인덱스부터 e번째 인덱스까지의 부분을 뒤집은 새로운 문자열을 반환