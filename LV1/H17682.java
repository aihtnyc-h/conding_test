package LV1;

public class H17682 {
	public int solution(String dartResult) {
		// 각 기회에서 얻은 점수를 저장할 배열 선언합니다.
		int[] score = new int[3];
		int idx = 0; // 현재 점수를 가리키는 인덱스입니다.

		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i); // 현재 문자를 가져옵니다.

			if (Character.isDigit(c)) { // 현재 문자가 숫자인 경우
				if(c == '1' && dartResult.charAt(i+1) == '0') {  // 10점인 경우
					score[idx] = 10;
					i++;  // '0'을 건너뜁니다.
				} else {
					score[idx] = c - '0';  // 현재 점수를 저장합니다.
				}
			} else if(c == 'S' || c == 'D' || c == 'T') {  // 보너스인 경우
				if(c == 'D') {
					score[idx] = (int) Math.pow(score[idx], 2);  // 2제곱합니다.
				} else if(c == 'T') {
					score[idx] = (int) Math.pow(score[idx], 3);  // 3제곱합니다.
				}
				idx++;  // 다음 점수를 가리키도록 인덱스를 증가시킵니다.
			} else if(c == '*' || c == '#') {  // 옵션인 경우
				if(c == '*') {
					if(idx > 1) score[idx-2] *= 2;  // 바로 전 점수를 2배합니다.
					score[idx-1] *= 2;  // 현재 점수를 2배합니다.
				} else if(c == '#') {
					score[idx-1] *= -1;  // 현재 점수를 마이너스로 만듭니다.
				}
			}
		}

		// 최종 점수를 계산합니다.
		int answer = 0;
		for(int i = 0; i < 3; i++) {
			answer += score[i];
		}

		return answer;
	}
}