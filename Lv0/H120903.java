package Lv0;

public class H120903 {
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i=0; i<s1.length; i++)
        {
            for(int j=0; j<s2.length; j++)
            {
                if(s1[i].equals(s2[j])) answer ++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2= new String[]{"com", "b", "d", "p", "c"};
        System.out.println(solution(s1, s2));
    }
}
