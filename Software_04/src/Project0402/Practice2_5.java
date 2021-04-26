package Project0402;

public class Practice2_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k01_i = 1; k01_i < 13; k01_i++) {
			//1 <= k01_i < 13 총 12번 반복되는 동안(총 12월)
			System.out.printf(" %d월 =>",k01_i);
			//"k01_i월" 출력
			for (int k01_j = 1; k01_j < 32; k01_j++) {
				//1 <= k01_j <32 총 31번 반복되는 동안(총 31일)
				System.out.printf("%d", k01_j);
				//"k01_j" 출력 => 맨마지막 일자는 ,없이 출력할 예정
				if (k01_i == 1 || k01_i == 3 || k01_i == 5 || k01_i == 8 || k01_i == 10 || k01_i == 12) {
					//k01_i가 1, 3, 5, 8, 10, 12월이면서
					if (k01_j == 31) break;   //k01_j가 31일인 경우 for문 종료					
				}
				if (k01_i == 4 || k01_i == 6 || k01_i == 9 || k01_i == 7 || k01_i == 11) {
					//k01_i가 4, 6, 9, 7, 11월이면서
					if (k01_j == 30) break;   //k01_j가 30일인 경우 for문 종료					
				}
				if (k01_i == 2) {             //k01_i가 2월이면서
					if (k01_j == 28) break;   //k01_j가 28일인 경우 for문 종료	
				}
				System.out.printf(",");   //break가 되기 전까지 모든 k01_j에 , 출력
			}
			System.out.printf("\n");      //for문 종료될 때마다 줄바꿈 출력
		}
	}
}
