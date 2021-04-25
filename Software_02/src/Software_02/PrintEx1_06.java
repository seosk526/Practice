package Software_02;

public class PrintEx1_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte k01_b = 1;							// 클래스 변수 k01_b 초기값 1로 선언
		short k01_s = 2;						// 정수형 변수 k01_s 초가값 2로 선언
		char k01_c = 'A';						// 문자형 변수 k01_c 초기값 'A'로 선언
		
		int k01_finger = 10;					// 정수형 변수 k01_finger 초기값 10으로 선언
		long k01_big = 100000000000L;			// 정수형 변수 k01_big 초기값 100000000000L으로 선언
		long k01_hex = 0xFFFFFFFFFFFFFFFFL;		// 정수형 변수 k01_hex 초기값 0xFFFFFFFFFFFFFFFFL으로 선언
		
		int k01_octNum = 010;					// 정수형 변수 k01_octNum 선언(8진수로 10, 10진수로 8)
		int k01_hexNum = 0x10;					// 정수형 변수 k01_hexNum 선언(16진수로 10, 10진수로 16)
		int k01_binNum = 0b10;					// 정수형 변수 k01_binNum 선언(2진수로 10, 10진수로 2)
		
		System.out.printf("k01_b=%d\n", k01_b);														// k01_b=1 출력
		System.out.printf("k01_s=%d\n", k01_s);														// k01_s=2 출력
		System.out.printf("k01_c=%c, %d \n", k01_c, (int)k01_c);									// k01_c=A, A의 아스키코드 65 출력
		System.out.printf("k01_finger=[%5d]\n", k01_finger);										// k01_finger=[공백5칸+10] 출력
		System.out.printf("k01_finger=[%-5d]\n", k01_finger);										// k01_finger=[10+공백5칸] 출력
		System.out.printf("k01_finger=[%05d]\n", k01_finger);										// k01_finger=[5자리 중 10 제외한 공백만큼 0갯수+10] 출력
		System.out.printf("k01_big=%d\n", k01_big);													// k01_big=100000000000 출력	
		System.out.printf("k01_hex=%#x\n", k01_hex);												// k01_hex=0xffffffffffffffff 출력 #은 접두사(16진수 0x, 8진수 0)
		System.out.printf("k01_octNum=%o, %d\n", k01_octNum, k01_octNum);							// k01_octNum=8진수, 10진수 값 출력
		System.out.printf("k01_hexNum=%x, %d\n", k01_hexNum, k01_hexNum);							// k01_hexNum=16진수, 10진수 값 출력
		System.out.printf("k01_binNum=%s, %d\n", Integer.toBinaryString(k01_binNum), k01_binNum);	// k01_binNum=2진수, 10진수 값 출력
	}
}
