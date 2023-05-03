package Lv0;

import java.util.ArrayList;

public class H181868 {
	class Solution {
		public String[] solution(String my_string) {
			ArrayList<String> words = new ArrayList<>();

			String[] answers = my_string.trim().split("\\s+");
			for (String answer : answers) {
				if (!answer.isEmpty()) {
					words.add(answer);
				}
			}
			return answers;
		}
	}
}
