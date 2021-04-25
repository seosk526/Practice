package Software_05;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_iWeekday = 5;     // 정수형 변수 iWeekday 초기값 5로 선언           
		int k01_iEnd[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// k01_iEnd 배열 안에 각 월별 마지막 일자 지정
		for (int k01_iMon = 0; k01_iMon < 12; k01_iMon++) {							// 0 <= k01_iMon < 12까지 1씩 증가하는 동안
			System.out.printf("\n\n         %d월\n", k01_iMon + 1);					// (k01_iMon + 1)월로 출력
			System.out.printf("=====================\n");							// ========출력 후 줄바꿈
			System.out.printf(" 일 월 화 수 목 금 토\n");							// 각 요일 출력 후 줄바꿈
			for (int k01_i = 1; k01_i <= k01_iEnd[k01_iMon]; k01_i++) {				// 1 <= k01_i <= 각 월별 마지막 날짜까지 배열 안에서 1씩 증가하는 동안
				if (k01_i == 1) {													// k01_i가 1일 때
					for (int k01_j = 0; k01_j < k01_iWeekday % 7; k01_j++) {		// 0 <= k01_j < 5를 7로 나눈 나머지만큼까지 1씩 증가하는 동안
						System.out.printf("   ");									// 공백 출력
					}
				}
				System.out.printf(" %2d", k01_i);									// 2칸 확보하고 그 안에서 숫자를 채우기
				k01_iWeekday++;														// k01_iWeekday 변수는 for문 돌면서 1씩 증가
				k01_iWeekday = k01_iWeekday % 7;									// k01_iWeekday를 7로 나눈 값을 다시 대입
				if (k01_iWeekday == 0) {											// k01_iWeekday = 0이 되었을 때가 일주일이 지난 상태
					System.out.println();											// 줄바꿈
				}
			}
		}
	}
}