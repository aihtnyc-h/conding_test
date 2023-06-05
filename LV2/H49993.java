package LV2;

public class H49993 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0; // 가능한 스킬트리의 개수

        // 각 스킬트리에 대해 반복문 실행
        for (String skillTree : skill_trees) {
            int learningIdx = 0; // 배울 차례인 스킬의 인덱스
            boolean isPossible = true; // 스킬트리가 가능한지 나타내는 변수

            // 스킬트리의 각 스킬에 대해 반복문 실행
            for (char curSkill : skillTree.toCharArray()) {
                int skillIdx = skill.indexOf(curSkill); // 현재 스킬의 선행 스킬 내 인덱스
                if (skillIdx == -1) continue; // 현재 스킬이 선행 스킬에 없는 경우, 무시하고 다음 스킬로 넘어감
                if (skillIdx == learningIdx) learningIdx++; // 현재 스킬이 배울 차례인 스킬인 경우, 다음 스킬로 이동
                else { // 현재 스킬이 배울 차례가 아닌 스킬인 경우, 스킬트리가 불가능하다고 판단하고 반복문 종료
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) answer++; // 스킬트리가 가능하다면, 가능한 스킬트리 개수 증가
        }

        return answer; // 가능한 스킬트리 개수 반환
    }
}