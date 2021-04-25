package Software_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A005930_MinMax {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\seosk\\Desktop\\A005930.csv"); 			// ���� ���� ��ġ ����
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f)); 			// BufferedReader Ŭ���� ����ؼ� k01_f���� �б�

		String k01_readtxt; 														// ������ ���� k01_readtxt ����
		int k01_min = Integer.MAX_VALUE; 											// �ְ� �ּҰ� ����
		int k01_max = Integer.MIN_VALUE;											// �ְ� �ִ밪 ����

		while ((k01_readtxt = k01_br.readLine()) != null) { 						// k01_br�� k01_readtxt�� ������ �ƹ��͵� ���� �ʴٸ�
			String[] k01_field = k01_readtxt.split(","); 							// ,�� �����ڷ� �Ͽ� ������ �迭 k01_field ����
			int k01_stockPrice;														// �ְ� ���� ���� k01_stockPrice ����

			if (k01_field[1].contains("2015")) { 									// k01_field[1] �׸� 2015�� ���Եȴٸ�
				k01_stockPrice = Integer.parseInt(k01_field[3]);					// k01_stockPrice�� ������ Ÿ������ ����ȯ�� k01_field[3] ����

				if (k01_min > k01_stockPrice) {							// �ּҰ� �������� k01_stockPrice�� �۴ٸ�
					k01_min = k01_stockPrice;							// �ּҰ� ������ k01_stockPrice ����
				} else if (k01_max < k01_stockPrice) {					// �ִ밪 �������� k01_stockPrice�� ũ�ٸ�
					k01_max = k01_stockPrice;							// �ִ밪 ������ k01_stockPrice ����
				}
			}
		}
		k01_br.close(); 												// BufferedReader Ŭ���� ����
		System.out.printf("�Ｚ���� �ְ� �ּҰ�: %d\n", k01_min);		// �Ｚ���� �ְ� �ּҰ�: k01_min ��� �� �ٹٲ�
		System.out.printf("�Ｚ���� �ְ� �ִ밪: %d", k01_max);			// �Ｚ���� �ְ� �ִ밪 : k01_max ���
	}	
}
