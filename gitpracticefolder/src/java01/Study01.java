package java01;
import java.util.Scanner;

public class Study01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사 점수 입력 : ");
		int mTest = sc.nextInt();  //중간고사
		System.out.print("기말고사 점수 입력 : ");
		int lTest = sc.nextInt();  //기말고사
		System.out.print("과제 점수 입력 : ");
		int test = sc.nextInt();  //과제점수
		System.out.print("총 출석(20회) 횟수 입력 : ");
		int att = sc.nextInt();  //출석횟수
		
		//중간20%, 기말30%, 과제30%, 출석20%(20회)
		//70이상 Pass, 70미만or강의30%이상결석(6번) Fail
		if((mTest*0.2)+(lTest*0.3)+(test*0.3)+(att*5*0.2) >= 70) {//총 합산 70이상
			if((att*5) > 70) {//출석 14번 초과시 pass
				System.out.print("Pass");
			}else {
				System.out.print("Fail(출석률 70%미만)");
			}
		}else {//총 합산 70미만
			System.out.print("Fail");
		}
		
		sc.close();
	}
}