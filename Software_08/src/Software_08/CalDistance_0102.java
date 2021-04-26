package Software_08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CalDistance_0102 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\������\\Desktop\\���������������ǥ�ص�����.txt");				// ���� ���� ��ġ ����
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));								// BufferedReader Ŭ���� ����ؼ� f���� �б�
		String k01_readtxt;																				// ������ ���� readtxt ����
		 
		if ((k01_readtxt = k01_br.readLine()) == null) {												// br�� readtxt�� ������ �ƹ��͵� ���ٸ�(�� ���� ���� �о�� �ʵ�� �� �� ����)
			System.out.printf("�� �����Դϴ�.\n");														// �� �����Դϴ�. ��� �� �ٹٲ�
			return;																						// return�� ȣ���Ͽ� �ش� �żҵ� ��ħ
		}
		String [] k01_field_name = k01_readtxt.split("\t");												// k01_readtxt�� \t �������� �ڸ� �� k01_field_name �迭�� ����
		
		double k01_lat = 37.3860521;																	// �д������ ����
		double k01_lng = 127.1214038;																	// �д������ �浵
		double k01_min = Double.MAX_VALUE;																// ������������ �Ÿ� �ּҰ� ����
		double k01_max = Double.MIN_VALUE;																// ������������ �Ÿ� �ִ밪 ����
		String k01_short_Dist = null;																	// �ִܰŸ� �ּ� ���� k01_short_Dist
		String k01_long_Dist = null;																	// �ִܰŸ� �ּ� ���� k01_long_Dist		
		
		int k01_LineCnt = 0;																			// �� ��°���� ����ϴ� k01_LineCnt ���� ����
		while((k01_readtxt = k01_br.readLine()) != null) {												// br�� readtxt�� ������ �ƹ��͵� ���� �ʴٸ�
			String [] k01_field = k01_readtxt.split("\t");												// k01_readtxt�� \t �������� �ڸ� �� k01_field �迭�� ����					
			System.out.printf("**[%d��° �׸�]************************************\n", k01_LineCnt);	// LineCnt��° �׸� ��� �� �ٹٲ�
			System.out.printf(" %s : %s\n", k01_field_name[9], k01_field[9]);							// 10��° �׸�: �����ּ� ��� �� �ٹٲ�
			System.out.printf(" %s : %s\n", k01_field_name[12], k01_field[12]);							// 13��° �׸�: ���� ��� �� �ٹٲ�
			System.out.printf(" %s : %s\n", k01_field_name[13], k01_field[13]);							// 14��° �׸�: �浵 ��� �� �ٹٲ�
			if (k01_field[12].isEmpty() || k01_field[13].isEmpty()) {									// ����, �浵�� ������ ���
				continue;																				// �ش� ������ �κ� �����ϰ� �ݺ��� ����
			}

			double k01_dist = Math.sqrt(Math.pow(Double.parseDouble(k01_field[12]) - k01_lat, 2)		// ��Ÿ��� ������ �Ÿ� ���� �� �ش� �� k01_dist�� ����
					+ Math.pow(Double.parseDouble(k01_field[13]) - k01_lng, 2));
			System.out.printf(" ���������� �Ÿ� : %f\n", k01_dist);										// ���������� �Ÿ� : k01_dist ��� �� �ٹٲ�
			System.out.printf("****************************************************\n"); 				// ********** ��� �� �ٹٲ�
			k01_LineCnt++;																				// �ݺ��� �� ���� �������� k01_LineCnt 1�� ����
			for (int k01_i = 0; k01_i < k01_readtxt.length(); k01_i++) {			// 0 <= k01_i < k01_readtxt ������ �������� 1�� �����ϴ� ����
				if (k01_min > k01_dist) {											// �ּҰ� �������� ������������ �Ÿ��� �� �۴ٸ�
					k01_min = k01_dist;												// �ش簪�� �ּҰ� ������ ����
					if (k01_min == k01_dist) {										// ������ �� 
						k01_short_Dist = k01_field[8];								// ���������θ��ּ� ��Ÿ���� �ε����� k01_short_Dist ������ ����
					}
				} else if (k01_max < k01_dist) {									// �ִ밪 �������� ������������ �Ÿ��� �� ũ�ٸ�
					k01_max = k01_dist;												// �ش簪�� �ִ밪 ������ ����
					if (k01_max == k01_dist) {										// ������ ��
						k01_long_Dist = k01_field[8];								// ���������θ��ּ� ��Ÿ���� �ε����� k01_long_Dist ������ ����
					}
				}				
			}
		}
		System.out.printf("�д�������� ���� ����� �� : %s", k01_short_Dist);		// �д�������� ���� ����� �� : k01_short_Dist ���
		System.out.printf(", �Ÿ����� : %f\n", k01_min);							// , �Ÿ����� : k01_min ��� �� �ٹٲ�
		System.out.printf("�д�������� ���� �� �� : %s", k01_long_Dist);			// �д�������� ���� �� �� : k01_short_Dist ���
		System.out.printf(", �Ÿ����� : %f\n", k01_max);							// , �Ÿ����� : k01_max ��� �� �ٹٲ�		
		k01_br.close();																// BufferedReader Ŭ���� ����
	}
}