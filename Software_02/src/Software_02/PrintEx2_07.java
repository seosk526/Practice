package Software_02;

public class PrintEx2_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k01_url = "www.codechobo.com";	// �Ǽ��� ���� k01_url �� ����
		
		float k01_f1 = .10f;					// �Ǽ��� ���� k01_f1 �ʱⰪ 0.10f�� ����(0.100000)
		float k01_f2 = 1e1f;					// �Ǽ��� ���� k01_f1 �ʱⰪ 1e1f�� ����(10.000000)
		float k01_f3 = 3.14e2f;					// �Ǽ��� ���� k01_f3 �ʱⰪ 3.14e2f�� ����(314.000000)
		double k01_d = 1.23456789;
		// %e: ��������, %g: ���� �����ϰ� ǥ���� ��
		System.out.printf("k01_f1=%f, %e, %g\n", k01_f1, k01_f1, k01_f1);	// k01_f1=0.100000, 1.000000e-01, 0.100000 ��� 
		System.out.printf("k01_f2=%f, %e, %g\n", k01_f2, k01_f2, k01_f2);	// k01_f2=10.000000, 1.000000e+01, 10.0000 ���
		System.out.printf("k01_f3=%f, %e, %g\n", k01_f3, k01_f3, k01_f3);	// k01_f3=314.000000, 3.140000e+02, 314.000 ���
		
		System.out.printf("k01_d=%f\n", k01_d);				// float���� ���������� k01_d �� ���
		System.out.printf("k01_d=%14.10f\n", k01_d);		// ��ü 14�ڸ� �� �Ҽ��� 10�ڸ����� k01_d �� ���
		
		System.out.printf("[12345678901234567890]\n");		// [12345678901234567890] ���
		System.out.printf("[%s]\n", k01_url);				// [www.codechobo.com] ���
		System.out.printf("[%20s]\n", k01_url);				// [20-���ڼ���ŭ ����+www.codechobo.com] ���
		System.out.printf("[%-20s]\n", k01_url);			// [codechobo+20-���ڼ���ŭ ����] ���
		System.out.printf("[%.8s]\n", k01_url);				// ���ʿ��� 8���ڸ� ���
	}
}
