package teacher;
import java.util.Scanner;

public class Stydy01_t {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("중간>>> ");
		int middleTerm = sc.nextInt();
		System.out.print("기말>>> ");
		int finalTerm = sc.nextInt();
		System.out.print("과제>>> ");
		int report = sc.nextInt();
		System.out.print("출석횟수>>> ");
		int attendCnt = sc.nextInt();
		
		int conMiddleTerm = (int)(middleTerm * 0.2);
		int conFinalTerm = (int)(finalTerm * 0.3);
		int conReport = (int)(report * 0.3);
		int conAttendCnt = (int)((attendCnt/20) * 0.2);
		
		int totalScore = conMiddleTerm + conFinalTerm + conReport + conAttendCnt;
		
		if( (totalScore >= 70) && (conAttendCnt > 30) ) System.out.println("Pass");
		else System.out.println("Fail");
		
		sc.close();
	}
}