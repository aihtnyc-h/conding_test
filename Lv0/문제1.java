package Lv0;

public class 문제1 {
		public String solution(String[] seoul) {
			String answer = "";
			int idx = 0;
			for (int i = 0; i < seoul.length; i++) {
				if (seoul[i].equals("Kim")) {
					idx = i;
					break;
				}
			}
			answer = "김서방은 " + idx + "에 있다";
			return answer;
		}

}

/*
class Solution {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return "";
    }
}
 */
