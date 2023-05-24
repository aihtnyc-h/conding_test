package LV2;

public class H12914 {
	public int solution(int n) {
		// waysToReach 배열은 각 위치에 도달할 수 있는 방법의 수를 저장합니다.
		int[] waysToReach = new int[n+1];

		// 0번째 위치와 1번째 위치에 도달하는 방법은 각각 1가지입니다.
		waysToReach[0] = 1;
		waysToReach[1] = 1;

		// 2번째 위치부터는 각 위치에 도달하는 방법의 수는 이전 두 위치에 도달하는 방법의 수의 합이 됩니다.
		for (int i = 2; i <= n; i++) {
			waysToReach[i] = (waysToReach[i-1] + waysToReach[i-2]) % 1234567;
		}

		// n번째 위치에 도달하는 방법의 수를 반환합니다.
		return waysToReach[n];
	}
}
