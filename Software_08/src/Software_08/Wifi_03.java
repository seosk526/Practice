package Software_08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Wifi_03 {

	public static void main(String[] args) throws IOException {										// try catch Ȱ������ �ʾұ� ������ �żҵ忡 ����ó������ ���� 
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\seosk\\Desktop\\���������������ǥ�ص�����.csv");				// ���� ���� ��ġ ����
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));								// BufferedReader Ŭ���� ����ؼ� f���� �б�
		
		String k01_readtxt;																				// ������ ���� readtxt ����
		if ((k01_readtxt = k01_br.readLine()) == null) {												// br�� readtxt�� ������ �ƹ��͵� ���ٸ�(�� ���� ���� �о�� �ʵ�� �� �� ����)
			System.out.printf("�� �����Դϴ�.\n");														// �� �����Դϴ�. ��� �� �ٹٲ�
		}
		String [] k01_field_name = k01_readtxt.split(",");												// readtxt�� ,�� ������ �� field_name �迭�� ����
		int k01_LineCnt = 0;																			// ��ȣ ��Ÿ�� ������ ���� LineCnt ����
		while ((k01_readtxt = k01_br.readLine()) != null) {												// br�� readtxt�� ������ �ƹ��͵� ���� �ʴٸ�
			String [] k01_field = k01_readtxt.split(",");												// readtxt�� ,�� ������ �� field �迭�� ����
			System.out.printf("**[%d��° �׸�]************************************\n", k01_LineCnt);	// LineCnt��° �׸� ��� �� �ٹٲ�
			for (int k01_j = 0; k01_j < k01_field_name.length; k01_j++) {								// 0 <= k01_j < field_name ����(field ���̵� ����) �������� 1�� �����ϴ� ����
				System.out.printf(" %s : %s\n", k01_field_name[k01_j], k01_field[k01_j]);				// k01_field_name : k01_field ��� �� �ٹٲ�
			}
			System.out.printf("****************************************************\n");				// ********** ��� �� �ٹٲ�
			if (k01_LineCnt == 100) break;																// LineCnt�� 100�� �Ǹ� for�� ����
			k01_LineCnt++;																				// LineCnt 1�� ����
		}
		k01_br.close();																					// BufferedReader Ŭ���� ����
	}
}