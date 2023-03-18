package Lv0;

public class H120913 {
	public static String[] solution(String my_str, int n) {
		int cnt = (my_str.length() + n -1 ) / n;
		String[] answer = new String[cnt];
		System.out.println(cnt);


		for (int i = 0; i < cnt; i++) {
			int start = i * n;
			int end = 0;

			if (start + n >= my_str.length()) {
				end = my_str.length();
			} else {
				end = start + n;
			}
			answer[i] =my_str.substring(start, end);
		}
		return answer;
	}
	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		System.out.println(solution(my_str, n));
	}
}

