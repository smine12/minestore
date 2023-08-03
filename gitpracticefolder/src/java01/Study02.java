package java01;

import java.util.Scanner;

public class Study02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("비밀번호 네자리 입력 : ");
			int password = sc.nextInt();

			int pw1 = (int) (password / 1000); // 첫째자리
			int pw2 = (int) ((password % 1000) / 100); // 둘째자리
			int pw3 = (int) (((password % 1000) % 100) / 10); // 셋째자리
			int pw4 = (int) (((password % 1000) % 100) % 10); // 넷째자리

			if (pw1 == 0) {
				System.out.println("첫자리는 0이 올 수 없습니다.");
			} else {
				int[] pwArr = new int[4];
				pwArr[0] = pw1;
				pwArr[1] = pw2;
				pwArr[2] = pw3;
				pwArr[3] = pw4;

				if (pwArr[0] == pwArr[1]) {
					System.out.println("1번째 자리와 2번째 자리 번호가 같습니다. 같은 번호는 불가");
				} else if (pwArr[0] == pwArr[2]) {
					System.out.println("1번째 자리와 3번째 자리 번호가 같습니다. 같은 번호는 불가");
				} else if (pwArr[0] == pwArr[3]) {
					System.out.println("1번째 자리와 4번째 자리 번호가 같습니다. 같은 번호는 불가");
				} else if (pwArr[1] == pwArr[2]) {
					System.out.println("2번째 자리와 3번째 자리 번호가 같습니다. 같은 번호는 불가");
				} else {
					System.out.println("비밀번호 생성 성공!");
					break;
				}
			}
		}
		sc.close();
	}
}