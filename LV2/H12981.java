package LV2;

import java.util.HashSet;
import java.util.Set;

public class H12981 {
	public int[] solution(int n, String[] words) {
		Set<String> wordSet = new HashSet<>();
		String lastWord = words[0];
		wordSet.add(lastWord);

		for (int i = 1; i < words.length; i++) {
			// 끝말잇기 규칙을 위반하거나 이미 사용된 단어를 사용한 경우
			if (lastWord.charAt(lastWord.length() - 1) != words[i].charAt(0) || !wordSet.add(words[i])) {
				return new int[]{(i % n) + 1, (i / n) + 1};
			}
			lastWord = words[i];
		}

		// 탈락자가 없는 경우
		return new int[]{0, 0};
	}
}