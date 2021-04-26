package Project0402;

public class Practice2_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_iVal;   //정수형 변수 k01_iVal 선언
		for (int i = 0; i < 300; i++) {   //i가 0에서 299까지 300번 반복되는 동안
			k01_iVal = 5 * i;   //k01_iVal는 5씩 증가된 값으로 선정
			if (k01_iVal >= 0 && k01_iVal < 10) System.out.printf("일 %d\n", k01_iVal);
			//0 <= k01_iVal < 10 일 때 "일 k01_iVal"출력 후 줄바꿈 
			else if (k01_iVal >= 10 && k01_iVal < 100) System.out.printf("십 %d\n", k01_iVal);
			//10 <= k01_iVal < 100 일 때 "십 k01_iVal"출력 후 줄바꿈 
			else if (k01_iVal >= 100 && k01_iVal < 1000) System.out.printf("백 %d\n", k01_iVal);
			//100 <= k01_iVal < 1000 일 때 "백 k01_iVal"출력 후 줄바꿈  
			else System.out.printf("천 %d\n", k01_iVal);
			//k01_iVal 1000 이상일 때 "천 k01_iVal"출력 후 줄바꿈 
		}
	}
}
