package Lv0;
/*
문자열 myString과 pat이 주어집니다.
myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
 */
public class H181871 {
	public int solution(String myString, String pat) {
		int answer = 0;
		int dex = 0;

		while ((dex = myString.indexOf(pat, dex)) != -1) {
			answer++;
			dex += 1;

			//dex += pat.length() > 1 ? 1 : 2;
		}
		return answer;
	}
}
