package Software_08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWrite_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {																	// try catch Ȱ���ؼ� ���� ���� (�Ǵ� �żҵ�� throw IOException ��� ���� ������ �� ����)
			File k01_f = new File("C:\\Users\\seosk\\Desktop\\Mytest.txt");		// ���� ���� ��ġ ����
			FileWriter k01_fw = new FileWriter(k01_f);							// �ؽ�Ʈ �����͸� ���Ͽ� �����ϱ� ���� FileWriter Ŭ���� ����			
			k01_fw.write("�ȳ� ����\n");										// �ȳ� ���� �Է� �� �ٹٲ�
			k01_fw.write("hello ���\n");										// hello ��� �Է� �� �ٹٲ�
			
			k01_fw.close();														// FileWriter Ŭ���� ����
			
			FileReader k01_fr = new FileReader(k01_f);				// ���� �б� ���� FileReader Ŭ���� ����
			
			int k01_n = -1;											// ������ ���� k01_n �ʱⰪ -1�� ����
			char [] k01_ch;											// ������ �迭 k01_ch ����
			
			while (true) {											// �ݺ��� ����
				k01_ch = new char[100];								// k01_ch �迭 [100]���� ����
				k01_n = k01_fr.read(k01_ch);						// k01_n�� �迭 k01_ch�� �ְ� �б�
				if (k01_n == -1) break;								// k01_n == -1 �϶� �ݺ��� ����
				
				for (int k01_i = 0; k01_i < k01_n; k01_i++) {		// 0 <= k01_i < k01_n���� k01_i�� 1�� ������ ��
					System.out.printf("%c", k01_ch[k01_i]);			// k01_ch[k01_i] ���
				}
			}
			k01_fr.close();											// FileReader Ŭ���� ����
			System.out.printf("\n FILE READ END");					// FILE READ END ���
		} catch (Exception e) {										// Exception ������ �߻��ϸ�
			System.out.printf("�� ����[%s]\n", e);					// �� ����e ���
		}
	}
}
