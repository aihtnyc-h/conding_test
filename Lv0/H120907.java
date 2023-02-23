package Lv0;

public class H120907 {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            if (arr[1].equals("+")) {
                if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (arr[1].equals("-")) {
                if (Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(solution(quiz));
    }
}
