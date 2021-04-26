package Software_08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CalDistance_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\������\\Desktop\\������������������.txt");			// ���� ���� ��ġ ����
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));					// BufferedReader Ŭ���� ����ؼ� f���� �б�
		String k01_readtxt;																	// ������ ���� k01_readtxt ����
		
		if ((k01_readtxt = k01_br.readLine()) == null) {									// k01_br�� k01_readtxt�� ������ �ƹ��͵� ���ٸ�(�� ���� ���� �о�� �ʵ�� �� �� ����)
			System.out.printf("�� �����Դϴ�.\n");											// �� �����Դϴ�. ��� �� �ٹٲ�
			return;																			// return�� ȣ���Ͽ� �ش� �żҵ� ��ħ
		}
		String [] k01_field_name = k01_readtxt.split("\t");									// k01_readtxt�� \t �������� �ڸ� �� k01_field_name �迭�� ����
		double k01_lat = 37.3650509;														// �츮�� ����
		double k01_lng = 127.1203713;														// �츮�� �浵
		double k01_min = Double.MAX_VALUE;													// ������������ �Ÿ� �ּҰ� ����
		double k01_max = Double.MIN_VALUE;													// ������������ �Ÿ� �ִ밪 ����
		String k01_short_Dist = null;														// �ִܰŸ� �ּ� ���� k01_short_Dist
		String k01_long_Dist = null;														// �ִܰŸ� �ּ� ���� k01_long_Dist		
		
		while ((k01_readtxt = k01_br.readLine()) != null) {											// k01_br�� k01_readtxt�� ������ �ƹ��͵� ���� �ʴٸ�
			String [] k01_field = k01_readtxt.split("\t");											// k01_readtxt�� \t �������� �ڸ� �� k01_field �迭�� ����			
			if (k01_field[2].isEmpty() || k01_field[3].isEmpty()) {									// ����, �浵�� ������ ���
				continue;																			// �ش� ������ �κ� �����ϰ� �ݺ��� ����
			}
			double k01_dist = Math.sqrt(Math.pow(Double.parseDouble(k01_field[3]) - k01_lat, 2)
					+ Math.pow(Double.parseDouble(k01_field[2]) - k01_lng, 2));						// ��Ÿ��� ������ �Ÿ� ���� �� �ش� �� k01_dist�� ����
			for (int k01_i = 0; k01_i < k01_readtxt.length(); k01_i++) {							// 0 <= k01_i < k01_readtxt ������ �������� 1�� �����ϴ� ����
				if (k01_min > k01_dist) {															// �ּҰ� �������� ������������ �Ÿ��� �� �۴ٸ�
					k01_min = k01_dist;																// �ش簪�� �ּҰ� ������ ����
					if (k01_min == k01_dist) {														// ������ �� 
						k01_short_Dist = k01_field[6];												// �����������ּ� ��Ÿ���� �ε����� k01_short_Dist ������ ����
					}
				} else if (k01_max < k01_dist) {													// �ִ밪 �������� ������������ �Ÿ��� �� ũ�ٸ�
					k01_max = k01_dist;																// �ش簪�� �ִ밪 ������ ����
					if (k01_max == k01_dist) {														// ������ ��
						k01_long_Dist = k01_field[6];												// �����������ּ� ��Ÿ���� �ε����� k01_short_Dist ������ ����
					}
				}
			}
		}
		System.out.printf("�츮 ���� ���� ����� ���������� : %s", k01_short_Dist);					// �츮���� ���� ����� �� : k01_short_Dist ���
		System.out.printf(", �Ÿ����� : %f\n", k01_min);											// , �Ÿ����� : k01_min ��� �� �ٹٲ�		
		System.out.printf("�츮 ���� ���� �� ���������� : %s", k01_long_Dist);						// �츮�� ���� �� �� : k01_short_Dist ���
		System.out.printf(", �Ÿ����� : %f\n", k01_max);											// , �Ÿ����� : k01_max ��� �� �ٹٲ�		
		k01_br.close();																				// BufferedReader Ŭ���� ����
	}
}
