package Software_05;

public class gugudan_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k01_i = 1; k01_i < 10; k01_i += 3) {                                                                                                                 // 정수형 변수 k01_i가 10미만 범위에서 3씩 증가하는 동안(1, 4, 7)			
			System.out.printf("*********\t*********\t*********\n");                                                 						// 한 줄에 ************ 3번 출력 후 줄바꿈			
			System.out.printf("  구구단 %d단 \t  구구단 %d단 \t  구구단 %d단 \n", k01_i, k01_i + 1, k01_i + 2);        /* 한 줄에 k01_i가 1일 때 1단, 2단, 3단 출력 후 줄바꿈
		                                                                                       																											* k01_i 가 4일 때 4단, 5단, 6단 출력 후 줄바꿈 
																																																		* k01_i 가 7일 때 7단, 8단, 9단 출력 후 줄바꿈
																																																		*/			
			System.out.printf("*********\t*********\t*********\n");               					// 한 줄에 ************ 3번 출력 후 줄바꿈			
			for (int k01_j = 1; k01_j < 10; k01_j++) {                                                                            // 정수형 변수 k01_j가 1이상 10미만 범위에서 1씩 증가하는 동안				
				for (int k01_k = k01_i; k01_k < k01_i + 3; k01_k++) {                                                /* k01_i <= k01_k < k01_i + 3 범위에서 1씩 증가하는 동안
																																									* k01_i = 1일 때 1 <= k01_k < 4
																																									* k01_i = 4일 때 4 <= k01_k < 7
																																									* k01_i = 7일 때 7 <= k01_k < 10	
																																									*/				
					System.out.printf(" %d * %d = %d\t", k01_k, k01_j, k01_k * k01_j);			    // k01_i 범위마다 일정 간격 띄어서 총 3줄 출력 					
				}
				System.out.println(); 																										   // k01_j 출력될 때마다 줄바꿈
			}			
		}
	}
}
