package LV1;

public class H133499 {
    public int solution(String[] babbling) {
        // 발음 가능한 단어의 개수를 저장할 변수를 0으로 초기화한다.
        int answer = 0;

        // babbling 배열의 각 단어에 대해 검사를 진행한다.
        for (String s : babbling) {
            // 먼저, 연속된 같은 발음("ayaaya", "yeye", "woowoo", "mama")이 있는지 검사하고
            // 그것들을 공백으로 바꾸어 제거한다.
            s = s.replaceAll("ayaaya|yeye|woowoo|mama", " ");

            // 그 다음, 유효한 발음("aya", "ye", "woo", "ma")이 있는지 검사하고
            // 그것들을 제거한다. 이제 s 문자열에는 유효하지 않은 발음만 남아있게 된다.
            s = s.replaceAll("aya|ye|woo|ma", "");

            // s 문자열이 비어 있다면, 원래의 단어는 유효한 발음만으로 이루어져 있고
            // 같은 발음이 연속해서 나타나지 않았다는 것을 의미한다.
            // 따라서 발음 가능한 단어의 개수를 1 증가시킨다.
            if (s.equals(""))
                answer++;
        }

        // 마지막으로, 발음 가능한 단어의 개수를 반환한다.
        return answer;
    }
}