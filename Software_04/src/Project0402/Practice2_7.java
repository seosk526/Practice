package Project0402;

public class Practice2_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] k01_iLMD = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//정수형 배열 k01_iLMD을 각 월의 마지막 일자로 선언
		for (int i = 1; i < 13; i++) {         //i가 1부터 12까지 12번 반복되는 동안
			System.out.printf(" %d월 =>", i);   //"i월 =>" 출력
			for (int j = 1; j < 32; j++) {     //j가 1부터 31까지 31번 반복되는 동안 
				System.out.printf(" %d", j);   //"j" 출력
				if (k01_iLMD[i - 1] == j) break;
				//k01_iLMD[] 배열은 0번째부터 시작되므로 i-1로 지정
				//k01_iLMD[] 값과 j 마지막 일자가 같을 경우 for문 종료
				System.out.printf(",");
				//if문이 충족되기 전까지는 , 찍힌 상태로 출력
			}
			System.out.printf("\n");   //줄바꿈 출력
		}
	}	
}