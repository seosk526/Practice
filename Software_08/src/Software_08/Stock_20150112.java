package Software_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Stock_20150112 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\seosk\\Desktop\\StockDailyPrice.csv");			// ���� ���� ��ġ ����
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));					// BufferedReader Ŭ���� ����ؼ� k01_f���� �б�
		
		File k01_f1 = new File("C:\\Users\\seosk\\Desktop\\20150112.csv");					// ���� ���� ��ġ ����
		BufferedWriter k01_bw = new BufferedWriter(new FileWriter(k01_f1));					// BufferedWriter Ŭ���� ����ؼ� k01_f1���� ����
		
		String k01_readtxt;														// ������ ���� k01_readtxt ����
		int k01_cnt = 0;														// ������ ���� k01_cnt ����	
		
		while ((k01_readtxt = k01_br.readLine()) != null) {						// k01_br�� k01_readtxt�� ������ �ƹ��͵� ���� �ʴٸ�
			StringBuffer k01_s = new StringBuffer();							//��Ʈ�� ���� ����
			String [] k01_field = k01_readtxt.split(",");						// ,�� �����ڷ� �Ͽ� ������ �迭 k01_field ����
			
			if (k01_field[1].equals("20150112")) {								// k01_field[1] �׸��� 20150112�̶��
				k01_s.append(k01_field[0].trim());								// k01_field[0]���� ������� ��� �׸� �����
				for (int k01_j = 1; k01_j < k01_field.length; k01_j++) {		// 1 <= k01_j < 01_field �������� 1�� �����ϴ� ����
					k01_s.append("," + k01_field[k01_j].trim());				// �����
				}
				k01_bw.write(k01_s.toString());									// k01_s.toString ���
				k01_bw.newLine();												// �ٹٲ�			
				k01_cnt++;														// k01_cnt 1�� ����				
			}
		}
		k01_br.close();												// BufferedReader Ŭ���� ����
		k01_bw.close();												// BufferedWriter Ŭ���� ����
		System.out.printf("20150112 [%d] records\n", k01_cnt);		// 20150112 [k01_cnt]records ��� �� �ٹٲ�			
	}
}
