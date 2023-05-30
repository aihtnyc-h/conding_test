package LV1;

public class H67256 {
    public String solution(int[] numbers, String hand) {
        String answer = ""; // 결과값을 저장할 변수 초기화
        int leftHand = 10; // 왼손의 초기 위치는 * 이므로 10으로 설정
        int rightHand = 12; // 오른손의 초기 위치는 # 이므로 12로 설정
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) { // 숫자가 1, 4, 7 중 하나라면 왼손으로 누름
                answer += "L";
                leftHand = number; // 왼손의 위치 업데이트
            } else if (number == 3 || number == 6 || number == 9) { // 숫자가 3, 6, 9 중 하나라면 오른손으로 누름
                answer += "R";
                rightHand = number; // 오른손의 위치 업데이트
            } else { // 숫자가 2, 5, 8, 0 중 하나라면 가까운 손으로 누름
                int leftDistance = getDistance(leftHand, number); // 왼손과 해당 숫자와의 거리 계산
                int rightDistance = getDistance(rightHand, number); // 오른손과 해당 숫자와의 거리 계산
                if (leftDistance > rightDistance || (leftDistance == rightDistance && hand.equals("right"))) {
                    // 왼손의 거리가 더 크거나, 두 손의 거리가 같고 사용자가 오른손잡이인 경우 오른손으로 누름
                    answer += "R";
                    rightHand = number; // 오른손의 위치 업데이트
                } else {
                    // 그 외의 경우(왼손의 거리가 더 짧거나, 두 손의 거리가 같고 사용자가 왼손잡이인 경우) 왼손으로 누름
                    answer += "L";
                    leftHand = number; // 왼손의 위치 업데이트
                }
            }
        }
        return answer;
    }

    public int getDistance(int hand, int number) {
        // 현재 손의 위치가 0 (* 위치)인 경우 11로, 누르려는 숫자가 0인 경우 11로 설정
        if (hand == 0) hand = 11;
        if (number == 0) number = 11;
        // 손의 위치와 누르려는 숫자의 위치를 키패드의 행과 열에 대응하도록 변환
        int handX = (hand - 1) / 3;
        int handY = (hand - 1) % 3;
        int numberX = (number - 1) / 3;
        int numberY = (number - 1) % 3;
        // 두 위치 사이의 맨해튼 거리 계산
        return Math.abs(handX - numberX) + Math.abs(handY - numberY);
    }
}