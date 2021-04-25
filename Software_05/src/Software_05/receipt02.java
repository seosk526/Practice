package Software_05;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class receipt02 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String k01_itemname1 = "퓨어에어 비말차단용마스크(최고급형)";		// 상품1 상품명 선언
		String k01_itemcode1 = "1031615";									// 상품1 코드번호 선언
		int k01_price1 = 3000000;												// 상품1 가격 선언
		int k01_amount1 = 1;												// 상품 1 수량 선언
		
		String k01_itemname2 = "슬라이드식명찰(가로형)(100호)";				// 상품2 상품명 선언
		String k01_itemcode2 = "11008152";									// 상품2 코드번호 선언
		int k01_price2 = 1000000;												// 상품2 가격 선언
		int k01_amount2 = 1;												// 상품2 수량 선언
		
		String k01_itemname3 = "매직흡착 인테리어후크(알루미늄타입)";		// 상품3 상품명 선언
		String k01_itemcode3 = "1020800";									// 상품3 코드번호 선언
		int k01_price3 = 1000000;												// 상품3 가격 선언
		int k01_amount3 = 99;												// 상품3 수량 선언
		
		DecimalFormat k01_df = new DecimalFormat("###,###,###,###,###");			// DecimalFormat 클래스 활용하여 숫자에 , 찍기
		Date k01_today = new Date(); 												// 현재시간 부르는 Date 클래스 선언
		SimpleDateFormat k01_date = new SimpleDateFormat("yyyy.MM.dd"); 			// SimpleDateFormat 인스턴스 생성하여 년/월/일 선언
		SimpleDateFormat k01_time = new SimpleDateFormat("HH:mm:ss"); 				// SimpleDateFormat 인스턴스 생성하여 시:분:초 선언
		Calendar cal = Calendar.getInstance();										// 현재 시간
		cal.add(Calendar.DAY_OF_MONTH, +14);										// 14일 후로 설정
		Date k01_refundDate = cal.getTime();										// 14일 후 날짜
		SimpleDateFormat k01_refunddf = new SimpleDateFormat("MM월dd일");			// 교환/환불 날짜 설정
		
		int k01_totalPrice = (k01_price1 * k01_amount1) + (k01_price2 * k01_amount2) + (k01_price3 * k01_amount3);
		// 전체 금액 = 상품1 총 금액 + 상품2 총 금액 + 상품3 총 금액
		int k01_netPrice = getNetPrice(k01_totalPrice);								// 세전금액	getNetPrice 매소드에서 호출	
		int k01_tax = k01_totalPrice - k01_netPrice;								// 세금 = 전체 금액 - 세전 금액		

	
		System.out.printf("%24s\n", " \"국민가게, 다이소\" ");								// "국민가게, 다이소" 출력 후 줄바꿈
		System.out.printf("%s\n", "(주)아성다이소_분당서현점");								// (주)아성다이소_분당서현점 출력 후 줄바꿈
		System.out.printf("%s\n", "전화:031-702-6016");										// 전화:031-702-6016 출력 후 줄바꿈
		System.out.printf("%s\n", "본사:서울 강남구 남부순환로 2748 (도곡동)");				// 본사:서울 강남구 남부순환로 2748 (도곡동) 출력 후 줄바꿈
		System.out.printf("%s\n", "대표:박정부,신호섭 213-81-52063");						// 대표:박정부,신호섭 213-81-52063 출력 후 줄바꿈
		System.out.printf("%s\n", "매장:경기도 성남시 분당구 분당로53번길 11 (서현동)");	// 매장:경기도 성남시 분당구 분당로53번길 11 (서현동) 출력 후 줄바꿈
		System.out.printf("=========================================\n");					// 줄바꿈
		System.out.printf("%24s\n", "소비자중심경영(CCM) 인증기업");						// 소비자중심경영 (CCM) 인증기업 출력 후 줄바꿈
		System.out.printf("%25s\n", "ISO 9001 품질경영시스템 인증기업");					// ISO 9001 품질경영시스템 인증기업 출력 후 줄바꿈
		System.out.printf("=========================================\n");					// 줄바꿈
		System.out.printf("       교환/환불 14일(" + k01_refunddf.format(k01_refundDate) + ")이내,\n");
		// 교환/환불 14일 (03월 12일) 이내, 출력 후 줄바꿈
		System.out.printf("%28s\n", "(전자)영수증, 결제카드 지참 후 구입매장에서 가능");	// (전자) 영수증, 결제카드 지참 후 구입매장에서 가능 출력 후 줄바꿈
		System.out.printf("%24s\n", "포장/가격 택 훼손시 교환/환불 불가");					// 포장/가격 택 훼손시 교환/환불 불가 출력 후 줄바꿈
		System.out.printf("%24s\n", "체크카드 취소 시 최대 7일 소요");						// 체크카드 취소 시 최대 7일 소요 출력 후 줄바꿈
		System.out.printf("=========================================\n");					// 줄바꿈
		System.out.printf("%s%19s%9s\n", "[POS 1058231]", k01_date.format(k01_today), k01_time.format(k01_today));
		// [POS 1058231] + 현재 날짜 + 현재 시간 출력 후 줄바꿈
		System.out.printf("=========================================\n");					// 줄바꿈
		System.out.printf("%s%9.9s%3.3s%11.11s\n", k01_cutByBytes(k01_itemname1, 18), k01_df.format(k01_price1),
				k01_df.format(k01_amount1), k01_df.format(k01_price1 * k01_amount1)); 		// 상품1 이름, 가격, 수량, 금액
		System.out.printf("[%s]\n", k01_itemcode1); // 상품1 상품코드
		System.out.printf("%s%9.9s%3.3s%11.11s\n", k01_cutByBytes(k01_itemname2, 18), k01_df.format(k01_price2),
				k01_df.format(k01_amount2), k01_df.format(k01_price2 * k01_amount2)); 		// 상품2 이름, 가격, 수량, 금액
		System.out.printf("[%s]\n", k01_itemcode2); // 상품2 상품코드
		System.out.printf("%s%9.9s%3.3s%11.11s\n", k01_cutByBytes(k01_itemname3, 18), k01_df.format(k01_price3),
				k01_df.format(k01_amount3), k01_df.format(k01_price3 * k01_amount3));		// 상품3 이름, 가격, 수량, 금액
		System.out.printf("[%s]\n", k01_itemcode3); // 상품3 상품코드		
		System.out.printf("           과세합계%22.22s\n", k01_df.format(k01_netPrice)); 	// 숫자 출력 형식 사용 공급가액
		System.out.printf("             부가세%22.22s\n", k01_df.format(k01_tax)); 			// 숫자 출력 형식 사용 부가세
		System.out.printf("-----------------------------------------\n");					// 줄바꿈
		System.out.printf("%s%33s\n", "판매합계", k01_df.format(k01_totalPrice));			// 판매합계 + 해당 변수 출력 후 줄바꿈
		System.out.printf("=========================================\n");					// 줄바꿈
		System.out.printf("%s%33s\n", "신용카드", k01_df.format(k01_totalPrice));			// 신용카드 + 해당 변수 출력 후 줄바꿈
		System.out.printf("-----------------------------------------\n");					// 줄바꿈
		System.out.printf("우리카드%33s\n", "538720**********");							// 우리카드 538720********** 출력 후 줄바꿈
		System.out.printf("%-17.17s ", "승인번호 77982843(0)"); 							// 승인번호 출력
		System.out.printf("%15.15s\n", "승인금액 " + k01_df.format(k01_totalPrice)); 		// 숫자 출력 형식 사용 승인금액
		// 승인번호 + 77982843 (0) + 승인금액 + 해당 변수 출력 후 줄바꿈
		System.out.printf("=========================================\n");					// 줄바꿈
		System.out.printf("%16s%9s%6s\n", k01_date.format(k01_today), k01_time.format(k01_today), "분당서현점");
		// 현재 날짜 + 현재시간 + 분당서현점 출력 후 줄바꿈
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");								// 상품 및 기타문의 : 1522-4400 출력 후 줄바꿈
		System.out.printf("멤버십 및 샵다이소 관련 문의 : %s\n", "1599-2211");				// 멤버십 및 샵다이소 관련 문의 : 1599-2211 출력 후 줄바꿈
		System.out.printf("%28s\n", "2112820610158231");									// 2112820610158231 출력 후 줄바꿈
		System.out.printf("-----------------------------------------\n");					// 줄바꿈
		System.out.printf("%s\n", "◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서\n "		// 해당 내용 출력 후 줄바꿈
				+ "   회원가입 후 다양한 혜택을 누려보세요! ◈");
	}
	
	// 세전가격 구하기
	public static int getNetPrice(int k01_iPrice) {
		double k01_taxRate = 10.0 / 11.0;													// 세율 10%, 부동소수점 오류 방지 -> 소비자가격 * 10.0 / 11.0 
		double k01_netPrice = k01_iPrice * k01_taxRate;										// 세전가격 = 소비자가격 / (1 + 세율)
		return (int) k01_netPrice;															// 정수형으로 소비자가격 변환
	}
	
	// 한글 포함된 문자열 자르기
	public static String k01_cutByBytes(String k01_inputString, int k01_stringWidth) throws UnsupportedEncodingException {
		for (int i = 0; i < k01_stringWidth; i++) { 										// 빈 문자열 오류 방지
			k01_inputString += " "; 														// 기존 문자열에 설정 너비만큼 공백 더함
		}
		int k01_widhtByte = 0; 																// 바이트 기준 가로너비
		int k01_cutIndex = 0; 																// 잘라낼 인덱스
		char k01_temp = ' '; 																// 문자열 중 한 글자
		for (int i = 0; i < k01_inputString.length(); i++) { 								// 문자열 전체
			k01_temp = k01_inputString.charAt(i); 											// 한 글자를 char로 받아옴
			if (Character.getType(k01_temp) == 5) { 										// character type이 5인 경우 한글
				k01_widhtByte += 2; 														// 한글 글자 너비 2 추가
			} else { 																		// 한글 아닌 경우
				k01_widhtByte += 1; 														// 한글 외 글자 너비 1 추가
			}
			k01_cutIndex++; 																// 잘라낼 인덱스 1 추가
			if (k01_widhtByte > k01_stringWidth) { 											// 설정한 최대 너비보다 클 경우
				k01_cutIndex--; 															// 한글자 앞에서 자르도록 함
				break; 																		// 작업 종료
			}
		}
		String k01_rename = k01_inputString.substring(0, k01_cutIndex); 					// 지정한 인덱스 앞까지 자르기

		// 최종 너비 체크
		int k01_newWidth = k01_rename.getBytes("EUC-KR").length; 							// 한글 2바이트로 간주한 너비 = 바이트 길이
		if (k01_newWidth < k01_stringWidth) { 												// 설정한 최대 너비보다 작은 경우
			for (int i = 0; i < k01_stringWidth - k01_newWidth; i++) { 						// 남는 자리 만큼
				k01_rename += " "; 															// 공백 추가
			}
		}
		return k01_rename; 																	// 뒤에 잘려진 상품이름 반환
	}
}