package Software_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StockDailyPrice_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\������\\Desktop\\day_data\\THTSKS010H00.dat");		// ���� ���� ��ġ ����
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));					// BufferedReader Ŭ���� ����ؼ� f���� �б�
		
		File k01_f1 = new File("C:\\Users\\������\\Desktop\\StockDailyPrice.csv");			// ���� ���� ��ġ ����
		BufferedWriter k01_bw1 = new BufferedWriter(new FileWriter(k01_f1));				// BufferedWriter Ŭ���� ����ؼ� f1���� ����
				
		String k01_readtxt;																	// ������ ���� k01_readtxt ����
		int k01_cnt = 0;																	// ������ ���� k01_cnt ����
		int k01_wcnt = 0;																	// ������ ���� k01_wcnt ����
		while ((k01_readtxt = k01_br.readLine()) != null) {									// br�� k01_readtxt�� ������ �ƹ��͵� ���� �ʴٸ�
			StringBuffer k01_s = new StringBuffer();										//��Ʈ�� ���� ����
			String [] k01_field = k01_readtxt.split("%_%");									// %_% �����ڷ� �Ͽ� ������ �迭 k01_field ����
			
			if (k01_field.length > 2&&k01_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				k01_s.append(k01_field[0].replace("^", "").trim());							// �迭 field ���̰� 2�̻��̸鼭 ^�� �������� �ٲ� �ѱ��ڰ� A�� ��, A�� ��Ƴ��� csv�� ����
				for (int k01_j = 1; k01_j < k01_field.length; k01_j++) {					// 1 <= k01_j < 01_field �������� 1�� �����ϴ� ����
					k01_s.append("," + k01_field[k01_j].replace("^", "").trim());			// �����
				}
				k01_bw1.write(k01_s.toString());									// k01_s.toString ���
				k01_bw1.newLine();													// �ٹٲ�					
				k01_wcnt++;															// k01_wcnt 1�� ����
			}
			k01_cnt++;																// k01_cnt 1�� ����
		}	
		k01_br.close();																// BufferedReader Ŭ���� ����
		k01_bw1.close();															// BufferedWriter Ŭ���� ����
		System.out.printf("Program End[%d][%d]records\n", k01_cnt, k01_wcnt);		// Program End [k01_cnt][k01_wcnt]records ��� �� �ٹٲ�
	}
}