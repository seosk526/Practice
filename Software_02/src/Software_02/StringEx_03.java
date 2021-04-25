package Software_02;

public class StringEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k01_name = "Ja" + "va";			// 문자열 k01_name 값 "Ja" + "va"로 선언
		String k01_str = k01_name + "8.0";		// 문자열 k01_str 값 "k01_name" + "8.0"으로 선언
		
		System.out.println(k01_name);		// k01_name 출력 후 줄바꿈
		System.out.println(k01_str);		// k01_str 출력 후 줄바꿈
		System.out.println(7 + " ");		// 7+공백 1칸 출력 후 줄바꿈
		System.out.println(" " + 7);		// 공백 1칸+7 출력 후 줄바꿈
		System.out.println(7 + "");			// 정수형 7 출력 후 문자열로 변환 및 줄바꿈
		System.out.println("" + 7);			// 문자열 7 출력 후 줄바꿈
		System.out.println("" + "");		// null값 출력
		System.out.println(7 + 7 + "");		// 정수형 14 출력 후 줄바꿈
		System.out.println("" + 7 + 7);		// 문자열 77 출력 후 줄바꿈
	}
}
