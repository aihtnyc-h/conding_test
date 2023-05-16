package LV1;
/*
코니는 영어 단어가 적힌 카드 뭉치 두 개를 선물로 받았습니다.
코니는 다음과 같은 규칙으로 카드에 적힌 단어들을 사용해 원하는 순서의 단어 배열을 만들 수 있는지 알고 싶습니다.

- 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
- 한 번 사용한 카드는 다시 사용할 수 없습니다.
- 카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
- 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.

예를 들어 첫 번째 카드 뭉치에 순서대로 ["i", "drink", "water"],
두 번째 카드 뭉치에 순서대로 ["want", "to"]가 적혀있을 때 ["i", "want", "to", "drink", "water"] 순서의 단어 배열을 만들려고 한다면 첫 번째 카드 뭉치에서 "i"를 사용한 후 두 번째 카드 뭉치에서 "want"와 "to"를 사용하고 첫 번째 카드뭉치에 "drink"와 "water"를 차례대로 사용하면 원하는 순서의 단어 배열을 만들 수 있습니다.

문자열로 이루어진 배열 `cards1`, `cards2`와 원하는 단어 배열 `goal`이 매개변수로 주어질 때,
 `cards1`과 `cards2`에 적힌 단어들로 `goal`를 만들 있다면 "Yes"를,
만들 수 없다면 "No"를 return하는 solution 함수를 완성해주세요.
 */
public class H159994 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		// 각 카드 뭉치에서 현재 선택할 수 있는 카드의 인덱스를 나타내는 포인터
		int index1 = 0;
		int index2 = 0;

		// 목표 문자열 배열의 각 원소에 대해
		for (String word : goal) {
			// 현재 원소가 카드 뭉치 1의 현재 카드와 일치하면 포인터를 한 칸 이동
			if (index1 < cards1.length && word.equals(cards1[index1])) {
				index1++;
			}
			// 현재 원소가 카드 뭉치 2의 현재 카드와 일치하면 포인터를 한 칸 이동
			else if (index2 < cards2.length && word.equals(cards2[index2])) {
				index2++;
			}
			// 현재 원소가 어느 카드 뭉치의 현재 카드와도 일치하지 않으면 "No" 반환
			else {
				return "No";
			}
		}

		// 모든 원소를 확인한 후에는 "Yes" 반환
		return "Yes";
	}
}
