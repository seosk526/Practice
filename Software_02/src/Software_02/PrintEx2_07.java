package Software_02;

public class PrintEx2_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k01_url = "www.codechobo.com";	// 실수형 변수 k01_url 값 선언
		
		float k01_f1 = .10f;					// 실수형 변수 k01_f1 초기값 0.10f로 선언(0.100000)
		float k01_f2 = 1e1f;					// 실수형 변수 k01_f1 초기값 1e1f로 선언(10.000000)
		float k01_f3 = 3.14e2f;					// 실수형 변수 k01_f3 초기값 3.14e2f로 선언(314.000000)
		double k01_d = 1.23456789;
		// %e: 지수형태, %g: 값을 간략하게 표현할 때
		System.out.printf("k01_f1=%f, %e, %g\n", k01_f1, k01_f1, k01_f1);	// k01_f1=0.100000, 1.000000e-01, 0.100000 출력 
		System.out.printf("k01_f2=%f, %e, %g\n", k01_f2, k01_f2, k01_f2);	// k01_f2=10.000000, 1.000000e+01, 10.0000 출력
		System.out.printf("k01_f3=%f, %e, %g\n", k01_f3, k01_f3, k01_f3);	// k01_f3=314.000000, 3.140000e+02, 314.000 출력
		
		System.out.printf("k01_d=%f\n", k01_d);				// float형의 단위까지만 k01_d 값 출력
		System.out.printf("k01_d=%14.10f\n", k01_d);		// 전체 14자리 중 소수점 10자리까지 k01_d 값 출력
		
		System.out.printf("[12345678901234567890]\n");		// [12345678901234567890] 출력
		System.out.printf("[%s]\n", k01_url);				// [www.codechobo.com] 출력
		System.out.printf("[%20s]\n", k01_url);				// [20-글자수만큼 공백+www.codechobo.com] 출력
		System.out.printf("[%-20s]\n", k01_url);			// [codechobo+20-글자수만큼 공백] 출력
		System.out.printf("[%.8s]\n", k01_url);				// 왼쪽에서 8글자만 출력
	}
}
