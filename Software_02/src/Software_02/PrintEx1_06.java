package Software_02;

public class PrintEx1_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte k01_b = 1;							// Ŭ���� ���� k01_b �ʱⰪ 1�� ����
		short k01_s = 2;						// ������ ���� k01_s �ʰ��� 2�� ����
		char k01_c = 'A';						// ������ ���� k01_c �ʱⰪ 'A'�� ����
		
		int k01_finger = 10;					// ������ ���� k01_finger �ʱⰪ 10���� ����
		long k01_big = 100000000000L;			// ������ ���� k01_big �ʱⰪ 100000000000L���� ����
		long k01_hex = 0xFFFFFFFFFFFFFFFFL;		// ������ ���� k01_hex �ʱⰪ 0xFFFFFFFFFFFFFFFFL���� ����
		
		int k01_octNum = 010;					// ������ ���� k01_octNum ����(8������ 10, 10������ 8)
		int k01_hexNum = 0x10;					// ������ ���� k01_hexNum ����(16������ 10, 10������ 16)
		int k01_binNum = 0b10;					// ������ ���� k01_binNum ����(2������ 10, 10������ 2)
		
		System.out.printf("k01_b=%d\n", k01_b);														// k01_b=1 ���
		System.out.printf("k01_s=%d\n", k01_s);														// k01_s=2 ���
		System.out.printf("k01_c=%c, %d \n", k01_c, (int)k01_c);									// k01_c=A, A�� �ƽ�Ű�ڵ� 65 ���
		System.out.printf("k01_finger=[%5d]\n", k01_finger);										// k01_finger=[����5ĭ+10] ���
		System.out.printf("k01_finger=[%-5d]\n", k01_finger);										// k01_finger=[10+����5ĭ] ���
		System.out.printf("k01_finger=[%05d]\n", k01_finger);										// k01_finger=[5�ڸ� �� 10 ������ ���鸸ŭ 0����+10] ���
		System.out.printf("k01_big=%d\n", k01_big);													// k01_big=100000000000 ���	
		System.out.printf("k01_hex=%#x\n", k01_hex);												// k01_hex=0xffffffffffffffff ��� #�� ���λ�(16���� 0x, 8���� 0)
		System.out.printf("k01_octNum=%o, %d\n", k01_octNum, k01_octNum);							// k01_octNum=8����, 10���� �� ���
		System.out.printf("k01_hexNum=%x, %d\n", k01_hexNum, k01_hexNum);							// k01_hexNum=16����, 10���� �� ���
		System.out.printf("k01_binNum=%s, %d\n", Integer.toBinaryString(k01_binNum), k01_binNum);	// k01_binNum=2����, 10���� �� ���
	}
}
