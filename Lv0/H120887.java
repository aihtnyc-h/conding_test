package Lv0;

public class H120887 {
	public static int solution(int i, int j, int k) {
		int answer = 0;
		String K = String.valueOf(k);
		for (int l = i; l <= j ; l++) {
			String value = String.valueOf(l);
			if (value.contains(K)) {
				String[] array = value.split("");
				for (String A : array) {
					if (A.equals(K)) answer++;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args){
		int i = 1;
		int j = 13;
		int k = 1;
		System.out.println(solution(i, j, k));
	}
}
