package Software_02;

public class StringEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k01_name = "Ja" + "va";			// ���ڿ� k01_name �� "Ja" + "va"�� ����
		String k01_str = k01_name + "8.0";		// ���ڿ� k01_str �� "k01_name" + "8.0"���� ����
		
		System.out.println(k01_name);		// k01_name ��� �� �ٹٲ�
		System.out.println(k01_str);		// k01_str ��� �� �ٹٲ�
		System.out.println(7 + " ");		// 7+���� 1ĭ ��� �� �ٹٲ�
		System.out.println(" " + 7);		// ���� 1ĭ+7 ��� �� �ٹٲ�
		System.out.println(7 + "");			// ������ 7 ��� �� ���ڿ��� ��ȯ �� �ٹٲ�
		System.out.println("" + 7);			// ���ڿ� 7 ��� �� �ٹٲ�
		System.out.println("" + "");		// null�� ���
		System.out.println(7 + 7 + "");		// ������ 14 ��� �� �ٹٲ�
		System.out.println("" + 7 + 7);		// ���ڿ� 77 ��� �� �ٹٲ�
	}
}
