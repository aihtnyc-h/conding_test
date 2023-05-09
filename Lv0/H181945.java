package Lv0;

import java.util.Scanner;

public class H181945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		rotateString(a);
	}

	public static void rotateString(String str) {
		int length = str.length();
		for (int i = 0; i < length; i++) {
			System.out.println(str.charAt(i));
		}
	}
}
