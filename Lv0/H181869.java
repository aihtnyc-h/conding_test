package Lv0;
/*
단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
공백으로 나누기 -> split
 */
public class H181869 {
	public String[] solution(String my_string) {
		String[] answer = my_string.split(" ");
		return answer;
	}
}
/*
split : 공백으로 구분된 단어들을 순서대로 문자열 배열로 변환하여 반환!
 */