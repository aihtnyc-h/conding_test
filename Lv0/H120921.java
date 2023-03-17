package Lv0;

public class H120921 {
	public static int solution(String A, String B) {
		int answer = 0;
		String copy = A;
		for (int i = 0; i < A.length(); i++) {
			if (copy.equals(B)){
				return answer;
			}
			String a = copy.substring(copy.length() -1);
			copy = a + copy.substring(0, copy.length() -1);
			answer++;
		}
		return -1;
	}
	public static void main(String[] args) {
		String A = "hello";
		String B = "ohell";
		System.out.println(solution(A, B));
	}
}