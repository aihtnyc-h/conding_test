package Lv0;

public class H120878 {
	public static int solution(int a, int b) {
		int bottom = b / gcd(a, b);
		while (bottom != 1) {
			if (bottom % 2 == 0) bottom /= 2;
			else if (bottom % 5 == 0) bottom /= 5;
			else return 2;
		}
		return 1;
	}

	static int gcd(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}

		if (b == 0) return a;
		return gcd(b, (a % b));
	}
	public static void main(String[] args){
		int a = 7;
		int b = 20;
		System.out.println(solution(a, b));
	}
}
