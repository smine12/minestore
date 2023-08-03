package java01;

import java.util.Scanner;

public class Study03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열입력:>>> ");
		
		String str = sc.nextLine();

		char[] cArr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++){
			cArr[i] = str.charAt(i);
		}
		/*
		String str = sc.next();
		String[] arr = new String[str.length()];
		for(int i=0; i<str.length()-1; i++) {
			arr[i] = String.valueOf(str.charAt(i)); 
			//자바는 문자가 문자열로 변환이 자동으로 안됨.
			//그래서 문자열로 변환하려면 String.valueOf(문자) 이런식으로 써야함
		}
		*/
		sc.close();
	}
}