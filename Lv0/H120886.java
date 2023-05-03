package Lv0;
/*
문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
 */
import java.util.Arrays;

public class H120886 {
	public int solution(String before, String after) {
		char[] beforeChars = before.toCharArray();
		char[] afterChars = after.toCharArray();

		Arrays.sort(beforeChars);
		Arrays.sort(afterChars);

		if (Arrays.equals(beforeChars, afterChars)) {
			return 1;
		} else {
			return 0;
		}
	}
}
