package Software_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class receipt01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_iPrice = 33000;  													// ���� k01_iPrice: �Һ��ڰ���
		int k01_netPrice = getNetPrice(k01_iPrice);								// ���� k01_netPrice : ��������
		int k01_tax = k01_iPrice - k01_netPrice;  								// ���� k01_tax: �ΰ���
		DecimalFormat k01_df = new DecimalFormat("###,###,###,###,###");		// DecimalFormat Ŭ���� Ȱ���Ͽ� �ݾ׿� , ����

		Date k01_today = new Date();											// ����ð� �θ��� Date Ŭ���� ����
		SimpleDateFormat k01_date = new SimpleDateFormat("yyyy/MM/dd");			// SimpleDateFormat �ν��Ͻ� �����Ͽ� ��/��/�� ����
		SimpleDateFormat k01_time = new SimpleDateFormat("HH:mm:ss");			// SimpleDateFormat �ν��Ͻ� �����Ͽ� ��:��:�� ����
				 
		System.out.printf("�ſ����\n");                                        								// �ſ���� ��� �� �ٹٲ�
		System.out.printf("�ܸ��� : %-13s ��ǥ��ȣ : %s\n", "2N68665898", "041218");							// �ܸ��� : 2N68665898 ��� + ĭ ���� + ��ǥ��ȣ : 041218 ��� �� �ٹٲ�
		System.out.printf("������ : %s\n", "�Ѿ��ġ�");														// ������ : �Ѿ��ġ� ��� �� �ٹٲ�
		System.out.printf("��  �� : %s", "��� ������ �д籸 Ȳ�����351 .\n���� 10 1��\n");					// ��  �� : ��� ������ �д籸 Ȳ�����351���� 10 1�� ��� �� �ٹٲ�
		System.out.printf("��ǥ�� : %s\n", "��â��");															// ��ǥ�� : ��â�� ��� �� �ٹٲ�
		System.out.printf("����� : %-18s TEL : %s\n", "752-53-00558", "7055695");								// ����� : 752-53-00558 ��� + ĭ ���� + TEL : 7055695 ��� �� �ٹٲ�
		System.out.printf("-----------------------------------------\n");										// ---------------------------- ��� �� �ٹٲ�
		System.out.printf("��  ��%32s ��\n", k01_df.format(k01_netPrice));										// ���� ��� ���� ��� ���ް���
		System.out.printf("�ΰ���%32s ��\n", k01_df.format(k01_tax));											// ���� ��� ���� ��� �ΰ���
		System.out.printf("��  ��%32s ��\n", k01_df.format(k01_iPrice));										// ���� ��� ���� ��� �� �ݾ�
		System.out.printf("-----------------------------------------\n");										// ---------------------------- ��� �� �ٹٲ�
		System.out.printf("�츮ī��\n");																		// �츮ī�� ��� �� �ٹٲ�
		System.out.printf("ī���ȣ : %s%5s\n", "5387-20**-****-4613(S)", "�Ͻú�");							// ī���ȣ : 5387-20**-****-4613(S) ��� + ĭ ���� + �Ͻú� ��� �� �ٹٲ�
		System.out.println("�ŷ��Ͻ� : " + k01_date.format(k01_today) + "  " + k01_time.format(k01_today));		// �ŷ��Ͻ� : SimpleDateFormat ����k01_date, k01_time ��� �� �ٹٲ�
		System.out.printf("���ι�ȣ : %s\n", "70404427");														// ���ι�ȣ : 70404427 ��� �� �ٹٲ�
		System.out.printf("�ŷ���ȣ : %s\n", "357734873739");													// �ŷ���ȣ : 357734873739 ��� �� �ٹٲ�
		System.out.printf("���� : %s %10s%s\n", "��ī���", "���� : ", "720068568");							// ���� : ��ī��� ��� + ĭ ���� + ����: 720068568 ��� �� �ٹٲ�
		System.out.printf("�˸� : %s\n", "EDC����ǥ");															// �˸�  :  EDC����ǥ ��� �� �ٹٲ�
		System.out.printf("���� : %s\n", "TEL)1544-4700");														// ���� : TEL)1544-4700 ��� �� �ٹٲ�
		System.out.printf("-----------------------------------------\n");										// ---------------------------- ��� �� �ٹٲ�
		System.out.printf("%24s\n", "* �����մϴ� *");															// ĭ ���� + *  �����մϴ�  * ��� �� �ٹٲ�
		System.out.printf("%39s\n", "ǥ��V2. 08_20200212");														// ĭ ���� + ǥ��V2.08_20200212 ��� �� �ٹٲ�
	}
	
	public static int getNetPrice(int k01_iPrice) {
		double k01_taxRate = 10.0 / 11.0;										// ���� 10%, �ε��Ҽ��� ���� ���� -> �Һ��ڰ��� * 10.0 / 11.0 
		double k01_netprice = k01_iPrice * k01_taxRate;							// �������� = �Һ��ڰ��� / (1 + ����)
		return (int) k01_netprice; 												// ���������� �Һ��ڰ��� ��ȯ
	}
}