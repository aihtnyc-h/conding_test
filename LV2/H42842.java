package LV2;

public class H42842 {
	public int[] solution(int brown, int yellow) {
		int total = brown + yellow;  // 전체 타일의 개수 계산
		for (int i = (int)Math.sqrt(total); i > 0; i--) {  // 전체 타일의 개수의 제곱근에서부터 1까지 반복
			if (total % i == 0) {  // 약수인지 확인
				int j = total / i;  // 몫을 구함 (가로 길이)
				// 노란색 타일의 개수를 만족하는지 확인
				if ((j - 2) * (i - 2) == yellow) {
					return new int[] {j, i};  // 가로, 세로 길이를 배열에 담아 반환
				}
			}
		}
		return null;  // 조건을 만족하는 가로, 세로 길이를 찾지 못한 경우 null 반환
	}
}