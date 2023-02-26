package Lv0;

public class H120904 {
    public static int solution(int num, int k) {
        for(int i=0;i<(num+"").length();i++){
            if((num+"").charAt(i)==(char)(k+48)) return i+1;
        }
        return -1;
    }
    public static void main(String[] args){
        int num = 29183;
        int k = 1;
        System.out.println(solution(num, k));
    }
}
