package Lv0;
/*
정수 배열 arr가 주어집니다.
arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다.
그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
 */
public class H181882 {
	public int[] solution(int[] arr) {
		// 배열의 길이만큼 반복문을 돌려 각 원소에 대한 조건에 따라 연산을 수행
		for (int i = 0; i < arr.length; i++) {
			// 원소가 50이상의 짝수인 경우, 원소를 2로 나눔
			if (arr[i] >= 50 && arr[i] % 2 == 0) {
				arr[i] /= 2;
			}
			// 원소가 50미만의 홀수인 경우, 원소에 2를 곱함
			else if (arr[i] < 50 && arr[i] %2 == 1) {
				arr[i] *= 2;
			}
			// 그 외의 경우에는 원소를 변경하지 않음
		}
		// 변경된 원소들로 이루어진 배열을 반환!
		return arr;
	}
}
