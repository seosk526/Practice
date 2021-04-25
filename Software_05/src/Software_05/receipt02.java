package Software_05;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class receipt02 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String k01_itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";		// ��ǰ1 ��ǰ�� ����
		String k01_itemcode1 = "1031615";									// ��ǰ1 �ڵ��ȣ ����
		int k01_price1 = 3000000;												// ��ǰ1 ���� ����
		int k01_amount1 = 1;												// ��ǰ 1 ���� ����
		
		String k01_itemname2 = "�����̵�ĸ���(������)(100ȣ)";				// ��ǰ2 ��ǰ�� ����
		String k01_itemcode2 = "11008152";									// ��ǰ2 �ڵ��ȣ ����
		int k01_price2 = 1000000;												// ��ǰ2 ���� ����
		int k01_amount2 = 1;												// ��ǰ2 ���� ����
		
		String k01_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";		// ��ǰ3 ��ǰ�� ����
		String k01_itemcode3 = "1020800";									// ��ǰ3 �ڵ��ȣ ����
		int k01_price3 = 1000000;												// ��ǰ3 ���� ����
		int k01_amount3 = 99;												// ��ǰ3 ���� ����
		
		DecimalFormat k01_df = new DecimalFormat("###,###,###,###,###");			// DecimalFormat Ŭ���� Ȱ���Ͽ� ���ڿ� , ���
		Date k01_today = new Date(); 												// ����ð� �θ��� Date Ŭ���� ����
		SimpleDateFormat k01_date = new SimpleDateFormat("yyyy.MM.dd"); 			// SimpleDateFormat �ν��Ͻ� �����Ͽ� ��/��/�� ����
		SimpleDateFormat k01_time = new SimpleDateFormat("HH:mm:ss"); 				// SimpleDateFormat �ν��Ͻ� �����Ͽ� ��:��:�� ����
		Calendar cal = Calendar.getInstance();										// ���� �ð�
		cal.add(Calendar.DAY_OF_MONTH, +14);										// 14�� �ķ� ����
		Date k01_refundDate = cal.getTime();										// 14�� �� ��¥
		SimpleDateFormat k01_refunddf = new SimpleDateFormat("MM��dd��");			// ��ȯ/ȯ�� ��¥ ����
		
		int k01_totalPrice = (k01_price1 * k01_amount1) + (k01_price2 * k01_amount2) + (k01_price3 * k01_amount3);
		// ��ü �ݾ� = ��ǰ1 �� �ݾ� + ��ǰ2 �� �ݾ� + ��ǰ3 �� �ݾ�
		int k01_netPrice = getNetPrice(k01_totalPrice);								// �����ݾ�	getNetPrice �żҵ忡�� ȣ��	
		int k01_tax = k01_totalPrice - k01_netPrice;								// ���� = ��ü �ݾ� - ���� �ݾ�		

	
		System.out.printf("%24s\n", " \"���ΰ���, ���̼�\" ");								// "���ΰ���, ���̼�" ��� �� �ٹٲ�
		System.out.printf("%s\n", "(��)�Ƽ����̼�_�д缭����");								// (��)�Ƽ����̼�_�д缭���� ��� �� �ٹٲ�
		System.out.printf("%s\n", "��ȭ:031-702-6016");										// ��ȭ:031-702-6016 ��� �� �ٹٲ�
		System.out.printf("%s\n", "����:���� ������ ���μ�ȯ�� 2748 (���)");				// ����:���� ������ ���μ�ȯ�� 2748 (���) ��� �� �ٹٲ�
		System.out.printf("%s\n", "��ǥ:������,��ȣ�� 213-81-52063");						// ��ǥ:������,��ȣ�� 213-81-52063 ��� �� �ٹٲ�
		System.out.printf("%s\n", "����:��⵵ ������ �д籸 �д��53���� 11 (������)");	// ����:��⵵ ������ �д籸 �д��53���� 11 (������) ��� �� �ٹٲ�
		System.out.printf("=========================================\n");					// �ٹٲ�
		System.out.printf("%24s\n", "�Һ����߽ɰ濵(CCM) �������");						// �Һ����߽ɰ濵 (CCM) ������� ��� �� �ٹٲ�
		System.out.printf("%25s\n", "ISO 9001 ǰ���濵�ý��� �������");					// ISO 9001 ǰ���濵�ý��� ������� ��� �� �ٹٲ�
		System.out.printf("=========================================\n");					// �ٹٲ�
		System.out.printf("       ��ȯ/ȯ�� 14��(" + k01_refunddf.format(k01_refundDate) + ")�̳�,\n");
		// ��ȯ/ȯ�� 14�� (03�� 12��) �̳�, ��� �� �ٹٲ�
		System.out.printf("%28s\n", "(����)������, ����ī�� ���� �� ���Ը��忡�� ����");	// (����) ������, ����ī�� ���� �� ���Ը��忡�� ���� ��� �� �ٹٲ�
		System.out.printf("%24s\n", "����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");					// ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ� ��� �� �ٹٲ�
		System.out.printf("%24s\n", "üũī�� ��� �� �ִ� 7�� �ҿ�");						// üũī�� ��� �� �ִ� 7�� �ҿ� ��� �� �ٹٲ�
		System.out.printf("=========================================\n");					// �ٹٲ�
		System.out.printf("%s%19s%9s\n", "[POS 1058231]", k01_date.format(k01_today), k01_time.format(k01_today));
		// [POS 1058231] + ���� ��¥ + ���� �ð� ��� �� �ٹٲ�
		System.out.printf("=========================================\n");					// �ٹٲ�
		System.out.printf("%s%9.9s%3.3s%11.11s\n", k01_cutByBytes(k01_itemname1, 18), k01_df.format(k01_price1),
				k01_df.format(k01_amount1), k01_df.format(k01_price1 * k01_amount1)); 		// ��ǰ1 �̸�, ����, ����, �ݾ�
		System.out.printf("[%s]\n", k01_itemcode1); // ��ǰ1 ��ǰ�ڵ�
		System.out.printf("%s%9.9s%3.3s%11.11s\n", k01_cutByBytes(k01_itemname2, 18), k01_df.format(k01_price2),
				k01_df.format(k01_amount2), k01_df.format(k01_price2 * k01_amount2)); 		// ��ǰ2 �̸�, ����, ����, �ݾ�
		System.out.printf("[%s]\n", k01_itemcode2); // ��ǰ2 ��ǰ�ڵ�
		System.out.printf("%s%9.9s%3.3s%11.11s\n", k01_cutByBytes(k01_itemname3, 18), k01_df.format(k01_price3),
				k01_df.format(k01_amount3), k01_df.format(k01_price3 * k01_amount3));		// ��ǰ3 �̸�, ����, ����, �ݾ�
		System.out.printf("[%s]\n", k01_itemcode3); // ��ǰ3 ��ǰ�ڵ�		
		System.out.printf("           �����հ�%22.22s\n", k01_df.format(k01_netPrice)); 	// ���� ��� ���� ��� ���ް���
		System.out.printf("             �ΰ���%22.22s\n", k01_df.format(k01_tax)); 			// ���� ��� ���� ��� �ΰ���
		System.out.printf("-----------------------------------------\n");					// �ٹٲ�
		System.out.printf("%s%33s\n", "�Ǹ��հ�", k01_df.format(k01_totalPrice));			// �Ǹ��հ� + �ش� ���� ��� �� �ٹٲ�
		System.out.printf("=========================================\n");					// �ٹٲ�
		System.out.printf("%s%33s\n", "�ſ�ī��", k01_df.format(k01_totalPrice));			// �ſ�ī�� + �ش� ���� ��� �� �ٹٲ�
		System.out.printf("-----------------------------------------\n");					// �ٹٲ�
		System.out.printf("�츮ī��%33s\n", "538720**********");							// �츮ī�� 538720********** ��� �� �ٹٲ�
		System.out.printf("%-17.17s ", "���ι�ȣ 77982843(0)"); 							// ���ι�ȣ ���
		System.out.printf("%15.15s\n", "���αݾ� " + k01_df.format(k01_totalPrice)); 		// ���� ��� ���� ��� ���αݾ�
		// ���ι�ȣ + 77982843 (0) + ���αݾ� + �ش� ���� ��� �� �ٹٲ�
		System.out.printf("=========================================\n");					// �ٹٲ�
		System.out.printf("%16s%9s%6s\n", k01_date.format(k01_today), k01_time.format(k01_today), "�д缭����");
		// ���� ��¥ + ����ð� + �д缭���� ��� �� �ٹٲ�
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");								// ��ǰ �� ��Ÿ���� : 1522-4400 ��� �� �ٹٲ�
		System.out.printf("����� �� �����̼� ���� ���� : %s\n", "1599-2211");				// ����� �� �����̼� ���� ���� : 1599-2211 ��� �� �ٹٲ�
		System.out.printf("%28s\n", "2112820610158231");									// 2112820610158231 ��� �� �ٹٲ�
		System.out.printf("-----------------------------------------\n");					// �ٹٲ�
		System.out.printf("%s\n", "�� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�\n "		// �ش� ���� ��� �� �ٹٲ�
				+ "   ȸ������ �� �پ��� ������ ����������! ��");
	}
	
	// �������� ���ϱ�
	public static int getNetPrice(int k01_iPrice) {
		double k01_taxRate = 10.0 / 11.0;													// ���� 10%, �ε��Ҽ��� ���� ���� -> �Һ��ڰ��� * 10.0 / 11.0 
		double k01_netPrice = k01_iPrice * k01_taxRate;										// �������� = �Һ��ڰ��� / (1 + ����)
		return (int) k01_netPrice;															// ���������� �Һ��ڰ��� ��ȯ
	}
	
	// �ѱ� ���Ե� ���ڿ� �ڸ���
	public static String k01_cutByBytes(String k01_inputString, int k01_stringWidth) throws UnsupportedEncodingException {
		for (int i = 0; i < k01_stringWidth; i++) { 										// �� ���ڿ� ���� ����
			k01_inputString += " "; 														// ���� ���ڿ��� ���� �ʺ�ŭ ���� ����
		}
		int k01_widhtByte = 0; 																// ����Ʈ ���� ���γʺ�
		int k01_cutIndex = 0; 																// �߶� �ε���
		char k01_temp = ' '; 																// ���ڿ� �� �� ����
		for (int i = 0; i < k01_inputString.length(); i++) { 								// ���ڿ� ��ü
			k01_temp = k01_inputString.charAt(i); 											// �� ���ڸ� char�� �޾ƿ�
			if (Character.getType(k01_temp) == 5) { 										// character type�� 5�� ��� �ѱ�
				k01_widhtByte += 2; 														// �ѱ� ���� �ʺ� 2 �߰�
			} else { 																		// �ѱ� �ƴ� ���
				k01_widhtByte += 1; 														// �ѱ� �� ���� �ʺ� 1 �߰�
			}
			k01_cutIndex++; 																// �߶� �ε��� 1 �߰�
			if (k01_widhtByte > k01_stringWidth) { 											// ������ �ִ� �ʺ񺸴� Ŭ ���
				k01_cutIndex--; 															// �ѱ��� �տ��� �ڸ����� ��
				break; 																		// �۾� ����
			}
		}
		String k01_rename = k01_inputString.substring(0, k01_cutIndex); 					// ������ �ε��� �ձ��� �ڸ���

		// ���� �ʺ� üũ
		int k01_newWidth = k01_rename.getBytes("EUC-KR").length; 							// �ѱ� 2����Ʈ�� ������ �ʺ� = ����Ʈ ����
		if (k01_newWidth < k01_stringWidth) { 												// ������ �ִ� �ʺ񺸴� ���� ���
			for (int i = 0; i < k01_stringWidth - k01_newWidth; i++) { 						// ���� �ڸ� ��ŭ
				k01_rename += " "; 															// ���� �߰�
			}
		}
		return k01_rename; 																	// �ڿ� �߷��� ��ǰ�̸� ��ȯ
	}
}