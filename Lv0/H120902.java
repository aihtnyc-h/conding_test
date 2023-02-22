package Lv0;

public class H120902 {
    public static int solution(String my_string) {
        int answer = 0;
        String[] ans = my_string.trim().split(" ");
        answer = Integer.parseInt(ans[0]);
        for(int i = 1; i < ans.length-1; i++){
            if(ans[i].equals("+")){
                answer +=  Integer.parseInt(ans[i+1]);
            }else if(ans[i].equals("-")){
                answer -= Integer.parseInt(ans[i+1]);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        String my_string = "3 + 4";
        System.out.println(solution(my_string));
    }
}
