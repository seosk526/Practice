package Software_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class receipt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k01_itemname = { "����ũ ���� ������500g", "ī���ķ���ť��1.6L", "���� 400ml PET", "���� ������ 360*2", 
				"ī�����ո��ٳ���", "����ũ ���� ������ 500g", "�����ڰ���", "���ϲ���Ĩ", "�ӱ��ż�Ʈ300", "��Ĩ��ĨĨĨ", 
				"������������", "�Ƹ�廩����", "���̱�������3��", "�ղ�Ʋ�����ռ�Ʈ", "�̴Ͻ�������Ʈ", "¯¯�ʹ��ʹ��ſ�", 
				"���ں�5����Ʈ", "��ũ���ݸ�������", "�ſ�����5����Ʈ", "��ũ����ī���", "��ϸ����ý÷�",  "������չٳ���", 
				"��ī��ī�ϴ�������ī��", "ġ�佺�佺�����������佺", "��Ƽġ���뼼Ʈ", "�ڹ�������������", "������ �������͸�", "���������� �ø���", "�ϱ⽺ ������Ƽ", "���ִ� ����GT" };                          
		// ��ǰ ǰ�� ������ ������ �迭 ����
		int[] k01_price = { 8580, 4180, 1370, 8480, 2580, 4980, 1000, 1200, 3500, 1200, 
				7000, 1000, 1000, 1000, 1100, 1100, 1200, 1500, 1000, 1300, 
				3000, 4900, 1000, 1200, 1000, 1000, 1200, 2500, 9000, 4900}; 																					        
		// �ܰ� ������ ������ �迭 ����
		int[] k01_amount = { 2, 2, 3, 1, 1, 3, 5, 2, 2, 3, 8, 9, 5, 3, 3, 4, 6, 6, 1, 2, 3, 3, 4, 6, 4, 2, 6, 3, 9, 7 }; 											
		// �� ��ǰ ���� ������ ������ �迭 ����
		boolean[] k01_taxFree = { false, true, false, false, false, false, false, false, false, false, true, false, false, false, false,
				false, false, false, false, false, false, true, false, false, false, false, false, false, true, false }; 								        	
		// �鼼���� ������ boolean �迭 ����(true: �鼼)
				
		DecimalFormat k01_df = new DecimalFormat("###,###,###,###,###");					// DecimalFormat Ŭ���� Ȱ���Ͽ� ���ڿ� , ���
		Date k01_today = new Date();									   					// ����ð� �θ��� Date Ŭ���� ����
		SimpleDateFormat k01_date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");			    // [�� ��] �׸񿡼� Ȱ��Ǵ� ��¥ ���� ����
		SimpleDateFormat k01_date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");			// �����ð� �׸񿡼� Ȱ��Ǵ� ��¥ ���� ����
		SimpleDateFormat k01_date3 = new SimpleDateFormat("yyyyMMdd");						// ������ �� ������ �׸񿡼� Ȱ��Ǵ� ��¥ ���� ����
		Calendar k01_cal = Calendar.getInstance();											// Calendar Ŭ���� Ȱ���Ͽ� �ð� ����
		k01_cal.setTime(k01_today);															// ���� �ð� ���
		k01_cal.add(Calendar.HOUR, -1);														// �����ð� ����	   		
		int k01_taxPrice = 0;								// ����ǰ�� �� �ݾ�
		int k01_freePrice = 0;								// �鼼ǰ�� �� �ݾ�
		int k01_totalPrice = 0;								// ��ü �� �ݾ�
		int k01_netPrice = 0;								// �����ݾ�
		int k01_tax = 0;									// ����		
		
		System.out.printf("%35s\n", "�̸�Ʈ ������ (031)888-1234");          			                // �̸�Ʈ ������ (031)888-1234 ��� �� �ٹٲ�
		System.out.printf("%7s%23s\n", "emart", "206-86-50913 ����");		   		        		    // emart  206-86-50913 ���� ��� �� �ٹٲ�
		System.out.printf("%29s\n", "���� ������ ������� 552");									    // ���� ������ ������� 552 ��� �� �ٹٲ�
		System.out.println();																		    // �ٹٲ�
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");									        // ������ �������� ��ȯ/ȯ�� �Ұ� ��� �� �ٹٲ�
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n"); 								    // �����ǰ�� ����, 30�� �̳�(�ż� 7��) ��� �� �ٹٲ�
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");								    // ���Ϻ� �귣����� ����(���� ����������) ��� �� �ٹٲ�
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n"); 							    // ��ȯ/ȯ�� ���������� ����(����ī�� ����) ��� �� �ٹٲ�
		System.out.println();																		    // �ٹٲ�
	    System.out.printf("%s%s%18s\n", "[�� ��]", k01_date1.format(k01_today), "POS:0011-9861");	    // [��  ��] + ���� ��¥ + POS:0011-9861 ��� �� �ٹٲ�
		System.out.printf("-----------------------------------------\n");                       	    // ------------------------- ��� �� �ٹٲ�
		System.out.printf("%9s%15s%3s%5s\n", "�� ǰ ��", "��  ��", "����", "��  ��");			        // ��ǰ��, �ܰ�, ����, �ݾ� ��� �� �ٹٲ�
		System.out.printf("-----------------------------------------\n");								// ------------------------- ��� �� �ٹٲ�
		
		for (int k01_i = 0; k01_i < k01_itemname.length; k01_i++) {										// 0 <= i < ��ǰǰ�� ���̸�ŭ 1�� �����ϴ� ����
			if (k01_taxFree[k01_i] == true) {															// �鼼ǰ���� ��
				System.out.printf("*");																	// * ���
				k01_freePrice += k01_price[k01_i] * k01_amount[k01_i];									// �� �鼼ǰ���� �ݾװ� ���� ���ؼ� �ش� ǰ�� �����ݾ� ����			
			} else {																					// ����ǰ�� �϶�
				System.out.printf(" ");																	// ���� ���
				k01_taxPrice += k01_price[k01_i] * k01_amount[k01_i];									// �� ����ǰ�� �� �ݾ� ����
			}
			System.out.printf("%s%9.9s%3d%10.10s\n", cutByBytes(k01_itemname[k01_i], 9),					// ��ǰ��(8��)
					k01_df.format(k01_price[k01_i]), k01_amount[k01_i], 								// ��ǰ ����, ��ǰ ����
					k01_df.format(k01_price[k01_i] * k01_amount[k01_i]));								// ��ǰ �հ� ����
			if ((k01_i + 1) % 5 == 0) {																	// 5�پ� �ٹٲ�
				System.out.printf("-----------------------------------------\n");						// ------------------------- ��� �� �ٹٲ�  
			}
		}
		
		k01_totalPrice = k01_taxPrice + k01_freePrice;		// ��ü �� �ݾ� = ����ǰ�� �ѱݾ� + �鼼ǰ�� �� �ݾ�
		k01_netPrice = getNetPrice(k01_taxPrice);			// �����ݾ� : getNetPrice �żҵ� ����
		k01_tax = k01_taxPrice - k01_netPrice;				// ���� = �����ݾ� - �����ݾ�	
		
		System.out.println();  																					// �ٹٲ�
		System.out.printf("%22s%14d\n", "�� ǰ�� ����", k01_itemname.length);									// �� ��ǰ ����
		System.out.printf("%23s%14s\n", "(*)�� ��  �� ǰ", k01_df.format(k01_freePrice));						// ���� ��� ���� ��� �鼼��ǰ �Ѿ�
		System.out.printf("%23s%14s\n", "�� ��  �� ǰ", k01_df.format(k01_netPrice));							// ���� ��� ���� ��� ������ǰ �Ѿ�
		System.out.printf("%24s%14s\n", "��   ��   ��", k01_df.format(k01_tax));								// ���� ��� ���� ��� �ΰ���
		System.out.printf("%25s%14s\n", "��        ��", k01_df.format(k01_totalPrice));							// ���� ��� ���� ��� �� �հ��
		System.out.printf("�� �� �� �� �� ��%24.24s\n", k01_df.format(k01_totalPrice)); 						// ���� ��� ���� ��� �����ݾ�
		System.out.printf("-----------------------------------------\n");										// ------------------------- ��� �� �ٹٲ�
		System.out.printf("0012 KEB �ϳ�       541707**0408/35860658\n");										// 0012 KEB �ϳ� 541707**0487/35860658 ��� �� �ٹٲ�
		System.out.printf("ī�����(IC)        %18.18s\n", "�Ͻú� / " + k01_df.format(k01_totalPrice));		// ī�����(IC) + �Ͻú� + �ش纯�� ��� �� �ٹٲ�	
		System.out.printf("-----------------------------------------\n");                                		// ------------------------- ��� �� �ٹٲ�
		System.out.printf("%20s\n", "[�ż�������Ʈ ����]");						                                // [�ż�������Ʈ ����] ��� �� �ٹٲ�	
		System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");											// ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�. ��� �� �ٹٲ�	
		System.out.printf("%s%18s%9d\n", "��ȸ�߻�����Ʈ", "9350**9995", 164);                    		        // ��ȸ�߻�����Ʈ + 9350**9995              164 ��� �� �ٹٲ�	
		System.out.printf("%s%25s\n", "����(����)����Ʈ", "5,637(       5,473)");								// ����(����)����Ʈ + 5,637(             5,473) ��� �� �ٹٲ�	
		System.out.printf("%s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");										// *�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�. ��� �� �ٹٲ�	
		System.out.printf("-----------------------------------------\n");                                  		// ------------------------- ��� �� �ٹٲ�
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�");										// ���űݾױ��� ���������ð� �ڵ��ο� ��� �� �ٹٲ�	
		System.out.printf("%s%29s\n", "������ȣ  :", "34��****");     											// ������ȣ  : + 34��**** ��� �� �ٹٲ�	
		System.out.printf("�����ð� :            %s\n", k01_date2.format(k01_cal.getTime()));					// �����ð� + �ش纯�� ��� �� �ٹٲ�
		System.out.printf("-----------------------------------------\n");                                  		// ------------------------- ��� �� �ٹٲ�
		System.out.printf("%s%25d\n", "ĳ��:084599 ��00", 1150);												// ĳ��:084599  ��00 + 1150 ��� �� �ٹٲ�
		System.out.printf("%15s%s\n", k01_date3.format(k01_cal.getTime()), "/00119861/00164980/31");			// 20210423/00119861/00164980/31 ��� �� �ٹٲ�
	}

	// �������� ���ϱ�
	public static int getNetPrice(int k01_iPrice) {
		double k01_tax_Rate = 10.0 / 11.0;											// ���� 10%, �ε��Ҽ��� ���� ���� -> �Һ��ڰ��� * 10.0 / 11.0 
		double k01_netPrice = k01_iPrice * k01_tax_Rate; 							// �������� = �Һ��ڰ��� / (1 + ����)
		return (int) k01_netPrice; 													// ���������� �Һ��ڰ��� ��ȯ
	}

	// ���ڿ����� �ѱ� ã�� �ż���
	public static String cutByBytes(String k01_item, int k01_length) {
		byte[] k01_inputByte = k01_item.getBytes();									// ��ǰ���� ����Ʈ ���� �迭�� ����
		int k01_cutByte = 0;														// �ڸ��� ����Ʈ �� ��Ÿ���� ���� ����
		int k01_maxByte = k01_length * 2;											// ��ǰǰ���� �ִ� ����Ʈ ��: �ѱ۹���Ʈ(2) * ��ü���� ��
		int k01_maxLength = 18;														// �ִ� ���� ���� 18���� ����
		int k01_byteLen = 0;														// ���ڿ� ���� ��Ÿ���� ���� ����(�ѱ� 2, �� �� 1)

		for (int k01_i = 0; k01_i < k01_item.length(); k01_i++) {					// 0 <= i < ��ǰǰ�� ���̸�ŭ 1�� �����ϴ� ����
			if (Character.getType(k01_item.charAt(k01_i)) == 5) {					// Character.getType() : �ڹ� ���ڿ����� �ѱ� ã��(�ѱ��� ��� 5�� ����)
				k01_cutByte += 2;													// �ѱ��� ��� 2����Ʈ �߰��Ͽ� �������� 
			} else {																// �ѱ��� �ƴ� ���
				k01_cutByte += 1;													// 1����Ʈ �߰��Ͽ� �׿� ���� ����Ʈ ����
			}
			if (k01_cutByte >= k01_maxLength) { 									// �ִ� ����Ʈ�� ���� ���ų� ũ�� Ż��
				break;
			}
		}
		String k01_cutItem = new String(k01_inputByte, 0, k01_cutByte); 			// ����Ʈ�� �߶� ���ڿ� ���� (k01_inputByte �迭�� �ε��� 0���� k01_cutByte���� ����)
		k01_byteLen = getLength(k01_cutItem); 										// ���� ���� üũ�ϴ� ���� ����

		while (k01_byteLen > k01_maxLength) {										
			if (k01_byteLen >= k01_maxLength) {										// ���ڿ����̰� �ִ� ���̺��� ũ�ų� ���� ��
				k01_cutItem = k01_cutItem.substring(0, k01_cutItem.length() - 1);   // ������ ���� ����
				k01_byteLen = getLength(k01_cutItem); 								// ���� ���� ��üũ
			}
		}
		
		if (k01_byteLen <= k01_maxLength) {											// ���ڿ����̰� �ִ� ���̺��� �۰ų� ���� ��
			for (int k01_i = 0; k01_i < k01_maxLength - k01_byteLen; k01_i++) {  	// ������̿��� ���ڿ����� �� ��ŭ
				k01_cutItem += " ";													// ���� ����Ͽ� ���� ����
			}
		}
		return k01_cutItem; 														// �پ�� ��ǰ�̸� ��ȯ
	}

	// ���ڿ� ���� üũ �޼ҵ�
	public static int getLength(String k01_cutItem) {
		int k01_byteLen = 0;
		for (int k01_i = 0; k01_i < k01_cutItem.length(); k01_i++) { 				// ���ڿ� ��ü
			if (Character.getType(k01_cutItem.charAt(k01_i)) == 5) { 				// �ѱ��� ���
				k01_byteLen += 2; 													// ����Ʈ���� + 2
			} else { 																// �ѱ��� �ƴ� ���
				k01_byteLen += 1; 													// ����Ʈ���� + 1
			}
		}
		return k01_byteLen;
	}
}