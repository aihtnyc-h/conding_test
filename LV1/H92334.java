package LV1;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/92334
 */
import java.util.HashMap;
import java.util.HashSet;

public class H92334 {
	public int[] solution(String[] id_list, String[] report, int k) {
		HashMap<String, Integer> report_count = new HashMap<>();
		HashMap<String, HashSet<String>> report_list = new HashMap<>();

		for (String info : report) {
			String[] split_info = info.split(" ");
			String reporter = split_info[0];
			String reported = split_info[1];

			report_list.putIfAbsent(reporter, new HashSet<>());
			report_list.get(reporter).add(reported);
		}

		for (String reporter : report_list.keySet()) {
			for (String reported : report_list.get(reporter)) {
				report_count.put(reported, report_count.getOrDefault(reported, 0) + 1);
			}
		}

		int[] answer = new int[id_list.length];
		for (int i = 0; i < id_list.length; i++) {
			String user = id_list[i];
			if (report_list.containsKey(user)) {
				for (String report_user : report_list.get(user)) {
					if (report_count.getOrDefault(report_user, 0) >= k) {
						answer[i]++;
					}
				}
			}
		}

		return answer;
	}
}

