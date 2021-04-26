package Project0402;

public class Practice01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_il;      //정수형 변수 k01_il 선언
		double k01_iD;   //실수형 변수 k01_iD 선언
		
		k01_il = 10 / 3;     //정수형 10을 정수형 3으로 나눈 값으로 그대로 정수형 변수 유지
		k01_iD = 10 / 3.0;   //정수형 10을 실수형 3.0으로 나눈 값으로 그대로 실수형 변수 유지
		
		if (k01_il == k01_iD) {             //변수 k01_il과 k01_iD이 같다면
			System.out.printf("equal\n");   //equal 출력 후 줄바꿈
		} else {
			System.out.printf("Not equal[%f][%f]\n", (double)k01_il, k01_iD);
			//같지 않다면 Not equal 출력 후 줄바꿈
			//k01_il는 정수형으로 결과값도 정수형, k01_iD는 실수형으로 결과값도 실수형 따라서 값이 다름
		}
		
		if (k01_il == 3.333333) {           //변수 k01_il과 3.333333이 같다면
			System.out.printf("equal\n");   //equal 출력 후 줄바꿈
		} else {
			System.out.printf("Not equal[3.333333][%f]\n", k01_iD);
			//같지 않다면 Not equal[3.333333] 출력 후 줄바꿈
			//k01_il는 정수형으로 결과값도 정수형이기 때문에 실수형 3.333333과 값이 다름
		}
		
		k01_iD = (int)k01_iD;   ///실수형 변수 k01_iD 정수형으로 형변환
		if (k01_il == k01_iD) {
			System.out.printf("equal\n");   //equal 출력 후 줄바꿈
		} else {
			System.out.printf("Not equal[%f][%f]\n", (double)k01_il, k01_iD);
			//변수 k01_iD를 정수형으로 형변환하였기 때문에 두 변수의 값이 같음
			//출력시 변수 k01_il는 정수형 결과가 나온 상태에서 실수형으로 형변환된 것으로 결과값 동일
		}
		
		System.out.printf("int로 인쇄[%d][%f]\n", k01_il, k01_iD);
		//%d(정수형), %f(실수형)으로 출력
		System.out.printf("double로 인쇄 [%f][%f]\n", (double)k01_il, k01_iD);
		//두 변수 모두 %f(실수형)으로 출력=>정수형 변수 k01_il (double)로 형변환하여 출력
		
		char k01_a = 'c';     //문자형 변수 k01_a 값 c로 초기값 설정
		if (k01_a == 'b') System.out.print("k01_a는 b이다\n");      
		//변수 k01_a가 b와 같으면 "k01_a는 b이다" 출력 후 줄바꿈
		if (k01_a == 'c') System.out.print("k01_a는 c이다\n");      
		//변수 k01_a가 b와 같으면 "k01_a는 c이다" 출력 후 줄바꿈
		if (k01_a == 'd') System.out.print("k01_a는 d이다\n");      
		//변수 k01_a가 b와 같으면 "k01_a는 d이다" 출력 후 줄바꿈
		
		String k01_aa = "abcd";   //문장형 변수 k01_aa 값 abcd로 초기값 설정
		if (k01_aa.equals("abcd")) System.out.printf("k01_aa는 abcd이다\n");
		//k01_aa이 문장 abcd와 같으면 "k01_aa는 abcd이다" 출력 후 줄바꿈
		else System.out.printf("k01_aa는 abcd가 아니다\n");
		//k01_aa이 문장 abcd와 다르면 "k01_aa는 abcd가 아니다" 출력 후 줄바꿈
		
		boolean k01_bb = true;   //boolean 변수 k01_bb 초기값 true로 설정
		if (!!k01_bb) System.out.printf("k01_bb가 아니고 아니면 참이다\n");
		//if ( ) 조건: k01_bb가 이중부정이므로 참->거짓->참이 됨
		//k01_bb가 참이면 "k01_bb가 아니고 아니면 참이다" 출력 후 줄바꿈
		else System.out.printf("k01_bb가 아니고 아니면 거짓이다\n");
		//k01_bb가 참이면 "k01_bb가 아니고 아니면 거짓이다" 출력 후 줄바꿈
	}	
}
