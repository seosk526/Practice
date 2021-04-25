package Software_02;

import java.util.Scanner;									// ava.util.Scanner import

public class ScannerEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k01_sc = new Scanner(System.in);			// Scanner 클래스 선언
		
		System.out.println("두 자리 정수를 하나 입력해주세요.>");
		// 두 자리 정수를 하나 입력해주세요.> 출력 후 줄바꿈
		
		String k01_input = k01_sc.nextLine();				// 문자열 k01_input 스캐너로 직접 입력
		int k01_num = Integer.parseInt(k01_input);			// k01_input 정수형 변수 k01_num으로 형변환
		
		System.out.println("입력내용 :" + k01_input);		// 입력내용 : k01_input 출력 후 줄바꿈
		System.out.printf("num = %d\n", k01_num);			// num = k01_num 출력 후 줄바꿈
	}
}
