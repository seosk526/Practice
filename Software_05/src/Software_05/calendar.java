package Software_05;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_iWeekday = 5;     // ������ ���� iWeekday �ʱⰪ 5�� ����           
		int k01_iEnd[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// k01_iEnd �迭 �ȿ� �� ���� ������ ���� ����
		for (int k01_iMon = 0; k01_iMon < 12; k01_iMon++) {							// 0 <= k01_iMon < 12���� 1�� �����ϴ� ����
			System.out.printf("\n\n         %d��\n", k01_iMon + 1);					// (k01_iMon + 1)���� ���
			System.out.printf("=====================\n");							// ========��� �� �ٹٲ�
			System.out.printf(" �� �� ȭ �� �� �� ��\n");							// �� ���� ��� �� �ٹٲ�
			for (int k01_i = 1; k01_i <= k01_iEnd[k01_iMon]; k01_i++) {				// 1 <= k01_i <= �� ���� ������ ��¥���� �迭 �ȿ��� 1�� �����ϴ� ����
				if (k01_i == 1) {													// k01_i�� 1�� ��
					for (int k01_j = 0; k01_j < k01_iWeekday % 7; k01_j++) {		// 0 <= k01_j < 5�� 7�� ���� ��������ŭ���� 1�� �����ϴ� ����
						System.out.printf("   ");									// ���� ���
					}
				}
				System.out.printf(" %2d", k01_i);									// 2ĭ Ȯ���ϰ� �� �ȿ��� ���ڸ� ä���
				k01_iWeekday++;														// k01_iWeekday ������ for�� ���鼭 1�� ����
				k01_iWeekday = k01_iWeekday % 7;									// k01_iWeekday�� 7�� ���� ���� �ٽ� ����
				if (k01_iWeekday == 0) {											// k01_iWeekday = 0�� �Ǿ��� ���� �������� ���� ����
					System.out.println();											// �ٹٲ�
				}
			}
		}
	}
}