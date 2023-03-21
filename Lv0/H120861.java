package Lv0;

public class H120861 {
	public static int[] solution(String[] keyinput, int[] board) {
		int[] answer = {0, 0};

		for(int i = 0; i < keyinput.length; i++) {
			if(keyinput[i].equals("left")) {
				answer[0]--;
				if(answer[0] < -(int)(board[0] / 2))
					answer[0] = -(int)(board[0] / 2);
			} else if (keyinput[i].equals("right")) {
				answer[0]++;
				if(answer[0] > (int)(board[0] / 2))
					answer[0] = (int)(board[0] / 2);
			} else if (keyinput[i].equals("up")) {
				answer[1]++;
				if(answer[1] > (int)(board[1] / 2))
					answer[1] = (int)(board[1] / 2);
			} else {
				answer[1]--;
				if(answer[1] < -(int)(board[1] / 2))
					answer[1] = -(int)(board[1] / 2);
			}
		}

		return answer;
	}
	public static void main(String[] args){
		String[] keyinput = {"left", "right", "up", "right", "right"};
		int[] board = {11, 11};
		System.out.println(solution(keyinput, board));
	}
}
