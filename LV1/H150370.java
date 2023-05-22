package LV1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class H150370 {
	public int[] solution(String today, String[] terms, String[] privacies) {
		Map<String, Integer> termMap = new HashMap<>();
		for(String term : terms) {
			// 각 약관 문자열을 공백을 기준으로 나눈다.
			String[] splitTerm = term.split(" ");
			// 나눈 문자열에서 첫 번째는 약관 종류, 두 번째는 유효기간이므로 이를 맵에 저장한다.
			termMap.put(splitTerm[0], Integer.parseInt(splitTerm[1]));
		}

		// 파기해야 할 개인정보의 번호를 저장할 리스트를 생성한다.
		List<Integer> discardList = new ArrayList<>();
		// 날짜 형식을 지정하기 위한 포맷터를 생성한다.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		// 오늘의 날짜를 LocalDate 형식으로 변환한다.
		LocalDate todaysDate = LocalDate.parse(today, formatter);

		for(int i=0; i<privacies.length; i++) {
			// 개인정보 문자열을 공백을 기준으로 나눈다.
			String[] splitPrivacy = privacies[i].split(" ");
			// 나눈 문자열에서 첫 번째는 수집 일자, 두 번째는 약관 종류이다.
			// 수집 일자를 LocalDate 형식으로 변환한다.
			LocalDate collectionDate = LocalDate.parse(splitPrivacy[0], formatter);
			// 약관 종류에 해당하는 유효기간을 맵에서 가져온다.
			int termMonth = termMap.get(splitPrivacy[1]);
			// 수집일자에 유효기간을 더해 파기 일자를 계산
			LocalDate discardDate = collectionDate.plusMonths(termMonth);

			// 파기 일자가 오늘 날짜 이전이거나 같다면 리스트에 추가
			if(discardDate.isBefore(todaysDate) || discardDate.isEqual(todaysDate)){
				discardList.add(i+1);
			}
		}

		// 리스트를 정수 배열로 변환하여 반환
		return discardList.stream().mapToInt(Integer::intValue).toArray();
	}
}
