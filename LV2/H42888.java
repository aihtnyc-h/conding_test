package LV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class H42888 {
    public String[] solution(String[] record) {
        Map<String, String> nicknameMap = new HashMap<>(); // 유저 아이디를 키로, 해당 유저의 최종 닉네임을 값으로 하는 맵을 생성한다.
        List<String[]> commandList = new ArrayList<>(); // 각 커맨드와 유저 아이디를 저장하는 리스트를 생성한다.

        for (String r : record) { // record 배열을 순회한다.
            String[] splitR = r.split(" "); // 공백을 기준으로 문자열을 분리한다.
            String command = splitR[0]; // 첫 번째 요소는 커맨드이다.
            String uid = splitR[1]; // 두 번째 요소는 유저 아이디이다.

            // Enter와 Change 커맨드 모두 닉네임을 변경하는 커맨드이다.
            if (command.equals("Enter") || command.equals("Change")) {
                String nickname = splitR[2]; // 세 번째 요소는 닉네임이다.
                nicknameMap.put(uid, nickname); // 유저 아이디를 키로, 닉네임을 값으로 해서 맵에 저장한다.
            }

            // Enter와 Leave 커맨드에 대한 정보를 리스트에 저장한다.
            if (command.equals("Enter") || command.equals("Leave")) {
                commandList.add(new String[] {command, uid}); // 커맨드와 유저 아이디를 배열에 담아 리스트에 추가한다.
            }
        }

        String[] answer = new String[commandList.size()]; // 결과를 저장할 문자열 배열을 생성합니다. 크기는 commandList의 크기와 같다.
        for (int i = 0; i < commandList.size(); i++) { // commandList를 순회한다.
            String command = commandList.get(i)[0]; // i번째 요소의 첫 번째 값을 커맨드로 가져온다.
            String uid = commandList.get(i)[1]; // i번째 요소의 두 번째 값을 유저 아이디로 가져온다.
            String nickname = nicknameMap.get(uid); // 유저 아이디를 키로 해서 닉네임 맵에서 닉네임을 가져온다.

            // 커맨드에 따라서 메시지를 생성하고, 결과 배열에 저장한다.
            if (command.equals("Enter")) {
                answer[i] = nickname + "님이 들어왔습니다.";
            } else if (command.equals("Leave")) {
                answer[i] = nickname + "님이 나갔습니다.";
            }
        }
        return answer; // 결과 배열을 반환한다.
    }
}