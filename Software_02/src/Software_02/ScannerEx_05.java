package Software_02;

import java.util.Scanner;									// ava.util.Scanner import

public class ScannerEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k01_sc = new Scanner(System.in);			// Scanner Ŭ���� ����
		
		System.out.println("�� �ڸ� ������ �ϳ� �Է����ּ���.>");
		// �� �ڸ� ������ �ϳ� �Է����ּ���.> ��� �� �ٹٲ�
		
		String k01_input = k01_sc.nextLine();				// ���ڿ� k01_input ��ĳ�ʷ� ���� �Է�
		int k01_num = Integer.parseInt(k01_input);			// k01_input ������ ���� k01_num���� ����ȯ
		
		System.out.println("�Է³��� :" + k01_input);		// �Է³��� : k01_input ��� �� �ٹٲ�
		System.out.printf("num = %d\n", k01_num);			// num = k01_num ��� �� �ٹٲ�
	}
}
