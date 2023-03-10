package Lv0;

public class H120860 {
    public int solution(int[][] dots) {
        int x1 = 0; int y1 = 0;

        for(int i = 1; i < 4; i++) {
            if((dots[0][0] != dots[i][0]) && (dots[0][1] != dots[i][1])) {
                x1 = dots[i][0];
                y1 = dots[i][1];
                break;
            }
        }

        int xdistance = (int)Math.sqrt((int)(Math.pow(dots[0][0] - x1, 2)));
        int ydistance = (int)Math.sqrt((int)(Math.pow(dots[0][1] - y1, 2)));
        int area = xdistance * ydistance;

        return area;
    }
//    public static void main(String[] args){
//        int[][] dots = [1, 1], [2, 1], [2, 2], [1, 2];
//    }
}
