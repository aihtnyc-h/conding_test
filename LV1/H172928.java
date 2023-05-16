package LV1;
/*
지나다니는 길을 'O', 장애물을 'X'로 나타낸 직사각형 격자 모양의 공원에서 로봇 강아지가 산책을 하려합니다.
산책은 로봇 강아지에 미리 입력된 명령에 따라 진행하며, 명령은 다음과 같은 형식으로 주어집니다.

["방향 거리", "방향 거리" … ]
예를 들어 "E 5"는 로봇 강아지가 현재 위치에서 동쪽으로 5칸 이동했다는 의미입니다.
로봇 강아지는 명령을 수행하기 전에 다음 두 가지를 먼저 확인합니다.

주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
위 두 가지중 어느 하나라도 해당된다면, 로봇 강아지는 해당 명령을 무시하고 다음 명령을 수행합니다.
공원의 가로 길이가 W, 세로 길이가 H라고 할 때, 공원의 좌측 상단의 좌표는 (0, 0), 우측 하단의 좌표는 (H - 1, W - 1) 입니다.

공원을 나타내는 문자열 배열 park, 로봇 강아지가 수행할 명령이 담긴 문자열 배열 routes가 매개변수로 주어질 때,
로봇 강아지가 모든 명령을 수행 후 놓인 위치를 [세로 방향 좌표, 가로 방향 좌표] 순으로 배열에 담아 return 하도록 solution 함수를 완성해주세요.
 */
import static java.nio.file.Files.*;

import java.util.*;

public class H172928 {
	public int[] solution(String[] park, String[] routes) {
		// 먼저 공원의 높이와 너비를 구합니다.
		int height = park.length;
		int width = park[0].length();

		// 시작점을 저장할 2차원 배열을 생성합니다.
		int[][] startPoint = new int[1][2];

		// 공원의 모든 부분을 탐색하여 시작점 'S'의 위치를 찾습니다.
		for(int i=0; i<park.length; i++){
			for(int j=0; j<park[i].length(); j++){
				if(park[i].charAt(j) == 'S'){
					startPoint[0][0] = i;
					startPoint[0][1] = j;
				}
			}
		}

		// 이동 경로에 따라 이동합니다.
		for(int i=0; i<routes.length; i++){
			// 이동 방향과 이동 거리를 각각 direction과 move에 저장합니다.
			String direction = ""+routes[i].charAt(0);
			int move = Character.getNumericValue(routes[i].charAt(2));

			// 방향이 'E'일 경우
			if(direction.equals("E") && startPoint[0][1]+move < width){
				// 이동 경로에 장애물이 없다면 이동합니다.
				if(!park[startPoint[0][0]].substring(startPoint[0][1], startPoint[0][1]+move+1).contains("X")) {
					startPoint[0][1] += move;
				}
			}
			// 방향이 'W'일 경우
			else if(direction.equals("W") && startPoint[0][1]-move>=0){
				// 이동 경로에 장애물이 없다면 이동합니다.
				if(!park[startPoint[0][0]].substring(startPoint[0][1]-move, startPoint[0][1]+1).contains("X")){
					startPoint[0][1] -= move;
				}
			}
			// 방향이 'S'일 경우
			else if(direction.equals("S") && startPoint[0][0]+move<height){
				// 이동 경로에 장애물이 없는지 확인합니다.
				boolean block = true;
				for(int b=startPoint[0][0]; b<=startPoint[0][0]+move; b++){
					if(park[b].charAt(startPoint[0][1])=='X'){
						block =false;
					}
				}
				// 이동 경로에 장애물이 없다면 이동합니다.
				if(block) startPoint[0][0] += move;
			}
			// 방향이 'N'일 경우
			else if(direction.equals("N") && startPoint[0][0]-move >=0){
				// 이동 경로에 장애물이 없는지 확인합니다.
				boolean block = true;
				for(int b=startPoint[0][0]; b>=startPoint[0][0]-move; b--){
					if(park[b].charAt(startPoint[0][1])=='X'){
						block =false;
					}
				}
				// 이동 경로에 장애물이 없다면 이동합니다.
				if(block) startPoint[0][0] -= move;
			}
		}
		// 마지막으로 도착한 위치를 반환합니다.
		return new int[]{startPoint[0][0], startPoint[0][1]};
	}
}