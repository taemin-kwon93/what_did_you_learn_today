package codeUpExample;

/*정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
단 0 <= a, b <= 2147483647, b는 0이 아니다.*/

import java.util.Scanner;

public class Main45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x, y;
		x = sc.nextLong();
		y = sc.nextLong();
		sc.close();

		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.printf("%.2f", (double)((double)x)/((double)y));
	}
}
