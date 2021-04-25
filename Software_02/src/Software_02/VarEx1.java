package Software_02;

public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_year = 0;					// 정수형 변수 k01_year 초기값 0으로 선언
		int k01_age = 14;					// 정수형 변수 k01_age 초기값 0으로 선언
		
		System.out.println(k01_year);		// k01_year 출력 후 줄바꿈
		System.out.println(k01_age);		// k01_age 출력 후 줄바꿈
		
		k01_year = k01_age + 2000;			// k01_year 변수 = k01_age + 2000 값으로 변경(2014)
		k01_age = k01_age + 1;				// k01_age 변수 = k01_age + 1 값으로 변경(15)
		
		System.out.println(k01_year);		// k01_year 출력 후 줄바꿈
		System.out.println(k01_age);		// k01_age 출력 후 줄바꿈
	}
}
