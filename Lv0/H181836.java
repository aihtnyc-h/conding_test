package Lv0;
/*
직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다.
이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때,
이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 */
public class H181836 {
	public String[] solution(String[] picture, int k) {
		int rowCount = picture.length;
		int colCount = picture[0].length();

		String[] answer = new String[rowCount * k];

		for (int i = 0; i < rowCount; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < colCount; j++) {
				char ch = picture[i].charAt(j);
				for (int l = 0; l < k; l++) {
					sb.append(ch);
				}
			}
			String newRow = sb.toString();
			for (int l = 0; l < k; l++) {
				answer[i * k + l] = newRow;
			}
		}
		return answer;
	}
}
