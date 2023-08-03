package teacher;
import java.util.Scanner;

public class Study02_t {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean matchFlag = false;
		
		System.out.print("생성하고자하는 비밀번호입력>>> ");
		String iPassInputValue = sc.nextLine();		

		//아스키코드 (48 = 0, 57 = 9)
		//charAt() : String으로 저장된 문자열 중에서 한글자만 선택해서 char타입으로 변환
		//charAt(0) : 문자열에서 0번째 문자를 char타입으로 변환
		if( ((iPassInputValue.charAt(0)) < 48) || ((iPassInputValue.charAt(0)) > 57) ) {
			System.out.println("비밀번호 첫자리가 1~9사이의 값이 아닙니다.");
		} else {
			if(iPassInputValue.length() == 4) {				
				for(int i = 1; i < iPassInputValue.length(); i++) {
					for(int j = i-1; j >= 0; j--) {
						if( iPassInputValue.charAt(i) == iPassInputValue.charAt(j) ) {	
							matchFlag = true;
							break;
						}		
					} if(matchFlag) {
						System.out.println("일치하는 값이 있습니다.");
						break;
					}
				}
			} else {
				System.out.println("비밀번호가 정해진 자리수(4)에 부합하지 않습니다.");
			}
		}
		sc.close();
	}
}