package java01;

import java.util.Scanner;

public class Study04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = { "월", "화", "수", "목", "금", "토", "일" };

		while (true) {
			System.out.print("0~6사이의 숫자를 하나 입력하세요 : ");
			int num = sc.nextInt();

			if (0 <= num && num <= 6) {
				System.out.println(str[num]);
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
		sc.close();
	}
}