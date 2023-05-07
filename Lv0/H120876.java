package Lv0;

import java.util.ArrayList;
import java.util.List;

/*
선분 3개가 평행하게 놓여 있습니다.
세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때,
두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
 */
public class H120876 {
	public int solution(int[][] lines) {
		List<Integer> overLap = new ArrayList<>();
		int answer = 0;

		for(int i = 0; i <= 2; i++){
			int s = lines[i][0]>lines[i][1]?lines[i][1]:lines[i][0];
			int b = lines[i][0]>lines[i][1]?lines[i][0]:lines[i][1];
			for(int j = s; j < b; j++){
				if(overLap.contains(j)){
					overLap.remove(Integer.valueOf(j));
					answer++;
				} else overLap.add(j);
			}
		}
		return answer;
	}
}
