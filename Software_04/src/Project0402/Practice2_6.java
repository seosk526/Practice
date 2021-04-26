package Project0402;

public class Practice2_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k01_i = 1; k01_i < 13; k01_i++) {
			//1 <= k01_i < 13 총 12번 반복되는 동안(총 12월)
			System.out.printf(" %d월 =>",k01_i);
			//"k01_i월" 출력
			LOOP:for (int k01_j = 1; k01_j < 32; k01_j++) {
				//1 <= k01_j <32 총 31번 반복되는 동안(총 31일)
				System.out.printf("%d", k01_j);
				//"k01_j" 출력
				switch (k01_i) {   //switch ( )안 for문이 참일 때, 
				case 4: case 6: case 7: case 9: case 11:   //k01_i가 4, 6, 7, 9, 11인 경우에
					if ( k01_j == 30) break LOOP;          //k01_j가 30일에서 LOOP 종료
					break;
				case 1: case 3: case 5: case 8: case 10: case 12:   
					//k01_i가 4, 6, 7, 9, 11인 경우에
						if ( k01_j == 31) break LOOP;          //k01_j가 30일에서 LOOP 종료
						break;
				case 2:                                    //k01_i가 2인 경우에
					if ( k01_j == 28) break LOOP;          //k01_j가 28일에서 LOOP 종료
					break;				
				}			
				System.out.printf(",");                    //break가 되기 전까지 모든 k01_j에 , 출력
			}
			System.out.printf("\n");                       //for문 종료될 때마다 줄바꿈 출력
		}
	}
}
