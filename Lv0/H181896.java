package Lv0;
/*
정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다.
 */
public class H181896 {
	public int solution(int[] num_list) {
		int answer = -1;
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] < 0) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}

