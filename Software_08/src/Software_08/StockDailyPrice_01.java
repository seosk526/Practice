package Software_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StockDailyPrice_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\������\\Desktop\\day_data\\THTSKS010H00.dat");		// ���� ���� ��ġ ����
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));					// BufferedReader Ŭ���� ����ؼ� f���� �б�
				
		String k01_readtxt;													// ������ ���� readtxt ����
		int k01_LineCnt = 0;												// �� ��°���� ����ϴ� k01_LineCnt ���� ����
		int k01_n = -1;														// ���� ���� �ľ�, ������ ���� k01_n �ʱⰪ -1�� ����
		StringBuffer k01_s = new StringBuffer();							//��Ʈ�� ���� ����
		while (true) {														// ���ѹݺ�
			char [] k01_ch = new char [1000];								// char �迭 ����
			k01_n = k01_br.read(k01_ch);									// k01_n�� �迭 k01_ch�� �ְ� �б� 
			if (k01_n == -1) break;											// k01_n == -1 �϶� �ݺ��� ����
			for (int k01_i = 0; k01_i < k01_n; k01_i++) {					// 0 <= k01_i < k01_n���� k01_i�� 1�� ������ ��
				if (k01_ch[k01_i] == '\n') {								// ����
					System.out.printf("[%s]****\n", k01_s.toString());		// [s.toString()]**** ��� �� �ٹٲ�
					k01_s.delete(0, k01_s.length());						// 0���� s���� ������ ����
				} else {													// ������ �ƴ� ���
					k01_s.append(k01_ch[k01_i]);							// �����̱�
				}
			}
		}
		System.out.printf("[%s]***\n", k01_s.toString());					// [s.toString()]**** ��� �� �ٹٲ�
		k01_br.close();														// BufferedReader Ŭ���� ����		
	}
}