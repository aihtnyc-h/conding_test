package Lv0;
/*
문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
StringBuilder 쓰기!!
 */
public class H181941 {
	public String solution(String[] arr) {
		StringBuilder answer = new StringBuilder();
		for (String s : arr) {
			answer.append(s);
		}
		return answer.toString();
	}
}
/*
StringBuilder a = new StringBuilder();
return a.toString();

for (String s : arr) {
a.append(s);
}

주어진 문자열 배열 arr의 원소들을 순서대로 이어붙여 새로운 문자열을 생성하고 반환!
문자열 생성을 위해 StringBuilder를 사용!!
 */