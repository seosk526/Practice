package Project0402;

public class Practice2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k01_i = 1; k01_i < 13; k01_i++) {
			//1 <= k01_i < 13 총 12번 반복되는 동안(총 12월)
			System.out.printf(" %d월 =>", k01_i);   //"k01_i월" 출력			
			for (int k01_j = 1; k01_j < 32; k01_j++) {
				//1 <= k01_j <32 총 31번 반복되는 동안(총 31일)
				System.out.printf(" %d", k01_j);   //"k01_j" 출력					
				if (k01_i == 1 && k01_j == 31) break;
				//k01_i가 1이고 k01_j가 31일 때, for문 종료
				if (k01_i == 2 && k01_j == 28) break;   
				//k01_i가 2이고 k01_j가 28일 때, for문 종료
				if (k01_i == 3 && k01_j == 31) break;   
				//k01_i가 3이고 k01_j가 31일 때, for문 종료
				if (k01_i == 4 && k01_j == 30) break;
				//k01_i가 4이고 k01_j가 30일 때, for문 종료
				if (k01_i == 5 && k01_j == 31) break;
				//k01_i가 5이고 k01_j가 31일 때, for문 종료
				if (k01_i == 6 && k01_j == 30) break;
				//k01_i가 6이고 k01_j가 30일 때, for문 종료
				if (k01_i == 7 && k01_j == 31) break; 
				//k01_i가 7이고 k01_j가 31일 때, for문 종료
				if (k01_i == 8 && k01_j == 31) break; 
				//k01_i가 8이고 k01_j가 31일 때, for문 종료
				if (k01_i == 9 && k01_j == 30) break;   
				//k01_i가 9이고 k01_j가 30일 때, for문 종료
				if (k01_i == 10 && k01_j == 31) break; 
				//k01_i가 10이고 k01_j가 31일 때, for문 종료
				if (k01_i == 11 && k01_j == 30) break;   
				//k01_i가 11이고 k01_j가 30일 때, for문 종료
				if (k01_i == 12 && k01_j == 31) break;   
				//k01_i가 12이고 k01_j가 31일 때, for문 종료
				System.out.printf(",");
				//break가 되기 전까지 모든 k01_j에 , 출력
			}			
			System.out.printf("\n");   //for문 한번씩 돌고나서 줄바꿈 출력
		}
	}
}