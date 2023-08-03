package teacher;

import java.util.Scanner;

public class Study03_t {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		배열을 선언
		int[] iArr01 = new int[10];
//			길이가 10
//		반복문을 이용하여 
//		배열에 넣은 후
//		순서대로  
		for (int i = 0; i < 10; ++i) {
			iArr01[i] = i + 1;
		}
//		값(부터 10까지)을 출력
		for (int i = 0; i < 10; ++i) {
//			System.out.println(iArr[i]);
		}
////////////////////////////////////////////////

		// 배열을 선언
		int[] iArr02 = new int[10];
		// 길이가 10
		// 반복문을 이용하여
		// 배열에 넣은 후
		// 역순대로
		for (int i = 9, j = 0; i >= 0; --i, j++) {
			iArr02[j] = i + 1;
		}

		int j = 0;
		for (int i = 9; i >= 0; --i) {
			iArr02[j] = i + 1;
			j++;
		}
		// 값(부터 10까지)을 출력
		for (int i = 0; i < 10; ++i) {
//			System.out.println(iArr[i]);
		}
////////////////////////////////////////////////
//		배열 선언
		int[] iArr03;
		int arrSize = 2;
//		System.out.print("입력:>>> ");
//		arrSize = sc.nextInt();
//		입력크기 배열 할당
		iArr03 = new int[arrSize];
//		1부터 입력 받은 값까지 배열에 
		for (int i = 0; i < arrSize; ++i) {
			iArr03[i] = i + 1;
		}
//		출력
		for (int i = 0; i < arrSize; ++i) {
//			System.out.println(iArr03[i]);
		}
		sc.close();

		////////////////////////////////////////////////
		// String배열을 선언
		String[] sArr = new String[5];
		// 초기화
		// “사과”, “귤“, “포도“, “복숭아”, “참외“
		sArr[0] = "사과";
		sArr[1] = "귤";
		sArr[2] = "포도";
		sArr[3] = "복숭아";
		sArr[4] = "참외";
		// 출력
		for (int i = 0; i < sArr.length; i++) {
			// 귤
			if (sArr[i].equals("귤")) {
				System.out.println(sArr[i]);
				break;
			} else {
				System.out.println("귤이 아닙니다.");
			}
		}
		////////////////////////////////////////////////
//		문자열을 입력 받아: sc.nextLine()
		System.out.print("문자열입력:>>> ");
		String str = sc.nextLine();
//		문자 하나하나를 배열에 넣고 : str.charAt(인덱스)
		char[] cArr = new char[str.length()];
		for(int i = 0; i < str.length(); i++)
		{
			cArr[i] = str.charAt(i);
		}
//		검색할 문자를 입력 받아 
		System.out.print("문자입력:>>> ");
		String cData = sc.nextLine();
		char cTarget = cData.charAt(0);
		int matchCnt = 0;
		for(int i = 0; i < cArr.length; i++)
		{
//			일치 문자열 갯수: 증감연산자
			if(cTarget == cArr[i]) { matchCnt++; }
		}
//		출력
		System.out.println("일치문자갯수:" + matchCnt);
	}
}