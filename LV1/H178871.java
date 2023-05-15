package LV1;

import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Node;

/*
얀에서는 매년 달리기 경주가 열립니다.
해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다.
예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때,
해설진이 "soe"선수를 불렀다면 2등인 "soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다.
즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.

선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와
해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때,
경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를 완성해주세요.


 */
public class H178871 {
	public String[] solution(String[] players, String[] callings) {
		// 각 선수의 현재 위치를 저장하기 위한 맵을 초기화합니다.
		HashMap<String, Integer> playerToPosition = new HashMap<>();
		// 선수들의 현재 순서를 저장하기 위한 리스트를 초기화합니다.
		ArrayList<String> list = new ArrayList<>();

		// 맵과 리스트를 선수들의 초기 순서로 채웁니다.
		for(int i=0; i<players.length; i++) {
			playerToPosition.put(players[i], i);
			list.add(players[i]);
		}

		// 각 호출을 처리합니다.
		for(String calling : callings) {
			// 호출한 선수가 맵에 존재하는지 확인합니다.
			if (playerToPosition.containsKey(calling)) {
				// 호출한 선수의 현재 위치를 가져옵니다.
				int idx = playerToPosition.get(calling);
				// 호출한 선수를 현재 위치에서 제거합니다.
				list.remove(idx);
				// 호출한 선수를 이전 선수 앞에 삽입합니다.
				list.add(idx-1, calling);

				// 맵에서 호출한 선수와 이전 선수의 위치를 업데이트합니다.
				playerToPosition.put(calling, idx-1);
				playerToPosition.put(list.get(idx), idx);
			}
		}

		// 최종 선수 순서를 반환합니다.
		return list.toArray(new String[0]);
	}
}