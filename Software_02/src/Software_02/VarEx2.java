package Software_02;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_x = 10;			// ������ ���� k01_x �ʱⰪ 10���� ����
		int k01_y = 20;			// ������ ���� k01_y �ʱⰪ 20���� ����
		int k01_tmp = 0;		// ������ ���� k01_tmp �ʱⰪ 0���� ����
		
		System.out.println("k01_x:" + k01_x + " k01_y:" + k01_y);
		// k01_x:10 k01_y:20 ��� �� �ٹٲ� 
		k01_tmp = k01_x;		// k01_tmp = 10
		k01_x = k01_y;			// k01_x = 20
		k01_y = k01_tmp;		// k01_y = 10
		
		System.out.println("k01_x:" + k01_x + " k01_y:" + k01_y);
		// k01_x:20 k01_y:10 ��� �� �ٹٲ� 
	}
}
