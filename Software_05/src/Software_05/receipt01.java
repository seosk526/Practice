package Software_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class receipt01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_iPrice = 33000;  													// 변수 k01_iPrice: 소비자가격
		int k01_netPrice = getNetPrice(k01_iPrice);								// 변수 k01_netPrice : 세전가격
		int k01_tax = k01_iPrice - k01_netPrice;  								// 변수 k01_tax: 부가세
		DecimalFormat k01_df = new DecimalFormat("###,###,###,###,###");		// DecimalFormat 클래스 활용하여 금액에 , 구분

		Date k01_today = new Date();											// 현재시간 부르는 Date 클래스 선언
		SimpleDateFormat k01_date = new SimpleDateFormat("yyyy/MM/dd");			// SimpleDateFormat 인스턴스 생성하여 년/월/일 선언
		SimpleDateFormat k01_time = new SimpleDateFormat("HH:mm:ss");			// SimpleDateFormat 인스턴스 생성하여 시:분:초 선언
				 
		System.out.printf("신용승인\n");                                        								// 신용승인 출력 후 줄바꿈
		System.out.printf("단말기 : %-13s 전표번호 : %s\n", "2N68665898", "041218");							// 단말기 : 2N68665898 출력 + 칸 띄우기 + 전표번호 : 041218 출력 후 줄바꿈
		System.out.printf("가맹점 : %s\n", "한양김치찌개");														// 가맹점 : 한양김치찌개 출력 후 줄바꿈
		System.out.printf("주  소 : %s", "경기 성남시 분당구 황새울로351 .\n번길 10 1층\n");					// 주  소 : 경기 성남시 분당구 황새울로351번길 10 1층 출력 후 줄바꿈
		System.out.printf("대표자 : %s\n", "유창신");															// 대표자 : 유창신 출력 후 줄바꿈
		System.out.printf("사업자 : %-18s TEL : %s\n", "752-53-00558", "7055695");								// 사업자 : 752-53-00558 출력 + 칸 띄우기 + TEL : 7055695 출력 후 줄바꿈
		System.out.printf("-----------------------------------------\n");										// ---------------------------- 출력 후 줄바꿈
		System.out.printf("금  액%32s 원\n", k01_df.format(k01_netPrice));										// 숫자 출력 형식 사용 공급가액
		System.out.printf("부가세%32s 원\n", k01_df.format(k01_tax));											// 숫자 출력 형식 사용 부가세
		System.out.printf("합  계%32s 원\n", k01_df.format(k01_iPrice));										// 숫자 출력 형식 사용 총 금액
		System.out.printf("-----------------------------------------\n");										// ---------------------------- 출력 후 줄바꿈
		System.out.printf("우리카드\n");																		// 우리카드 출력 후 줄바꿈
		System.out.printf("카드번호 : %s%5s\n", "5387-20**-****-4613(S)", "일시불");							// 카드번호 : 5387-20**-****-4613(S) 출력 + 칸 띄우기 + 일시불 출력 후 줄바꿈
		System.out.println("거래일시 : " + k01_date.format(k01_today) + "  " + k01_time.format(k01_today));		// 거래일시 : SimpleDateFormat 변수k01_date, k01_time 출력 후 줄바꿈
		System.out.printf("승인번호 : %s\n", "70404427");														// 승인번호 : 70404427 출력 후 줄바꿈
		System.out.printf("거래번호 : %s\n", "357734873739");													// 거래번호 : 357734873739 출력 후 줄바꿈
		System.out.printf("매입 : %s %10s%s\n", "비씨카드사", "가맹 : ", "720068568");							// 매입 : 비씨카드사 출력 + 칸 띄우기 + 가맹: 720068568 출력 후 줄바꿈
		System.out.printf("알림 : %s\n", "EDC매출표");															// 알림  :  EDC매출표 출력 후 줄바꿈
		System.out.printf("문의 : %s\n", "TEL)1544-4700");														// 문의 : TEL)1544-4700 출력 후 줄바꿈
		System.out.printf("-----------------------------------------\n");										// ---------------------------- 출력 후 줄바꿈
		System.out.printf("%24s\n", "* 감사합니다 *");															// 칸 띄우기 + *  감사합니다  * 출력 후 줄바꿈
		System.out.printf("%39s\n", "표준V2. 08_20200212");														// 칸 띄우기 + 표준V2.08_20200212 출력 후 줄바꿈
	}
	
	public static int getNetPrice(int k01_iPrice) {
		double k01_taxRate = 10.0 / 11.0;										// 세율 10%, 부동소수점 오류 방지 -> 소비자가격 * 10.0 / 11.0 
		double k01_netprice = k01_iPrice * k01_taxRate;							// 세전가격 = 소비자가격 / (1 + 세율)
		return (int) k01_netprice; 												// 정수형으로 소비자가격 변환
	}
}