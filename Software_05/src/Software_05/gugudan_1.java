package Software_05;

public class gugudan_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k01_i = 1; k01_i < 10; k01_i += 3) {                                                                                                                 // ������ ���� k01_i�� 10�̸� �������� 3�� �����ϴ� ����(1, 4, 7)			
			System.out.printf("*********\t*********\t*********\n");                                                 						// �� �ٿ� ************ 3�� ��� �� �ٹٲ�			
			System.out.printf("  ������ %d�� \t  ������ %d�� \t  ������ %d�� \n", k01_i, k01_i + 1, k01_i + 2);        /* �� �ٿ� k01_i�� 1�� �� 1��, 2��, 3�� ��� �� �ٹٲ�
		                                                                                       																											* k01_i �� 4�� �� 4��, 5��, 6�� ��� �� �ٹٲ� 
																																																		* k01_i �� 7�� �� 7��, 8��, 9�� ��� �� �ٹٲ�
																																																		*/			
			System.out.printf("*********\t*********\t*********\n");               					// �� �ٿ� ************ 3�� ��� �� �ٹٲ�			
			for (int k01_j = 1; k01_j < 10; k01_j++) {                                                                            // ������ ���� k01_j�� 1�̻� 10�̸� �������� 1�� �����ϴ� ����				
				for (int k01_k = k01_i; k01_k < k01_i + 3; k01_k++) {                                                /* k01_i <= k01_k < k01_i + 3 �������� 1�� �����ϴ� ����
																																									* k01_i = 1�� �� 1 <= k01_k < 4
																																									* k01_i = 4�� �� 4 <= k01_k < 7
																																									* k01_i = 7�� �� 7 <= k01_k < 10	
																																									*/				
					System.out.printf(" %d * %d = %d\t", k01_k, k01_j, k01_k * k01_j);			    // k01_i �������� ���� ���� �� �� 3�� ��� 					
				}
				System.out.println(); 																										   // k01_j ��µ� ������ �ٹٲ�
			}			
		}
	}
}