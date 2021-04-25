package Software_05;

public class gugudan_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k01_i = 1; k01_i < 4; k01_i++) {                                                                                                                     // 정수형 변수 k01_i가 4미만 범위에서 1씩 증가하는 동안(1, 2, 3)			
			System.out.printf("*********\t*********\t*********\n");     															      // 한 줄에 ************ 3번 출력 후 줄바꿈		
			System.out.printf("  구구단 %d단 \t  구구단 %d단 \t  구구단 %d단 \n", k01_i, k01_i + 3, k01_i + 6);	  /* 한 줄에 k01_i가 1일 때 1단, 4단, 7단 출력 후 줄바꿈			
																																																	  * k01_i 가 2일 때 2단, 5단, 8단 출력 후 줄바꿈
																																																	  * k01_i 가 3일 때 3단, 6단, 9단 출력 후 줄바꿈
																																																	  */		
			System.out.printf("*********\t*********\t*********\n");     							  // 한 줄에 ************ 3번 출력 후 줄바꿈	
			for (int k01_j = 1; k01_j < 10; k01_j++) { 																		  // 정수형 변수 k01_j가 1이상 10미만 범위에서 1씩 증가하는 동안		
				for (int k01_k = k01_i; k01_k < k01_i + 7; k01_k += 3) { 		                                  /* k01_i <= k01_k < k01_i + 7 범위에서 3씩 증가하는 동안
																																								 * k01_i = 1일 때 k01_k = 1, 4, 7
																																								 * k01_i = 2일 때 k01_k = 2, 5, 8
																																								 * k01_i = 3일 때 k01_k = 3, 6, 9
																																								 */			
					System.out.printf(" %d * %d = %d\t", k01_k, k01_j, k01_k * k01_j);			  // k01_i 범위마다 일정 간격 띄어서 총 3줄 출력
				}
				System.out.println(); 																								         // k01_j 출력될 때마다 줄바꿈
			}		
		}
	}
}