package LV1;

import java.util.Scanner;

public class H12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i <= b; i++) {      // 행 개수
            for (int j = 0; j <= a; j++) {  // 열 개수
                System.out.print("*");
            }
            System.out.println();     // 하나의 열이 끝나면 줄 바꿈
        }
    }
}