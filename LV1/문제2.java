package LV1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 문제2 {
	public int[] solution(String today, String[] terms, String[] privacies) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		LocalDate todayDate = LocalDate.parse(today, formatter);

		Map<String, Integer> termPeriod = new HashMap<>();
		for (String term : terms) {
			String[] termInfo = term.split(" ");
			termPeriod.put(termInfo[0], Integer.parseInt(termInfo[1]));
		}

		List<Integer> expiredInfo = new ArrayList<>();
		for (int i = 0; i < privacies.length; i++) {
			String[] privacyInfo = privacies[i].split(" ");
			LocalDate collectionDate = LocalDate.parse(privacyInfo[0], formatter);
			String termType = privacyInfo[1];

			LocalDate expirationDate = collectionDate.plusMonths(termPeriod.get(termType));

			if (expirationDate.isBefore(todayDate) || expirationDate.isEqual(todayDate)) {
				expiredInfo.add(i + 1);
			}
		}

		int[] answer = new int[expiredInfo.size()];
		for (int i = 0; i < expiredInfo.size(); i++) {
			answer[i] = expiredInfo.get(i);
		}

		return answer;
	}
}

/*
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayDate = LocalDate.parse(today, formatter);

        Map<String, Integer> termPeriod = new HashMap<>();
        for (String term : terms) {
            String[] termInfo = term.split(" ");
            termPeriod.put(termInfo[0], Integer.parseInt(termInfo[1]));
        }

        int expiredCount = 0;
        int[] expiredInfo = new int[privacies.length];
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyInfo = privacies[i].split(" ");
            LocalDate collectionDate = LocalDate.parse(privacyInfo[0], formatter);
            String termType = privacyInfo[1];

            LocalDate expirationDate = collectionDate.plusMonths(termPeriod.get(termType));

            if (expirationDate.isBefore(todayDate) || expirationDate.isEqual(todayDate)) {
                expiredInfo[expiredCount++] = i + 1;
            }
        }

        int[] answer = new int[expiredCount];
        System.arraycopy(expiredInfo, 0, answer, 0, expiredCount);

        return answer;
    }
}
 */