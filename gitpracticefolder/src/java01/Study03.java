package java01;

public class Study03 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=1;i<=10;i++) {
			arr[i-1] = i;
			System.out.print((arr[i-1])+" ");
		}
		//System.out.println(Arrays.toString(arr)); //배열 출력
		//System.out.println(arr); =>배열의 주소값을 가져옴.
	}
}