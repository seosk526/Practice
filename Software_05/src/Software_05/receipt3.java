package Software_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class receipt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k01_itemname = { "피코크 진한 육개장500g", "카스후레쉬큐팩1.6L", "진로 400ml PET", "비비고 군교자 360*2", 
				"카레여왕망바나나", "피코크 진한 설렁탕 500g", "오감자감자", "꼬북꼬북칩", "머그컵세트300", "콘칩콘칩칩칩", 
				"좋은느낌데이", "아몬드빼빼로", "마이구미젤리3종", "왕꿈틀이종합세트", "미니쉘선물세트", "짱짱너무너무셔요", 
				"초코빅5종세트", "다크초콜릿다이제", "매운새우깡5개세트", "밀크초코카라멜", "허니메이플시럽",  "유기농살균바나나", 
				"차카니카니누가더차카니", "치토스토스공을나에게토스", "스티치필통세트", "자바의정석개정판", "샤오미 보조배터리", "오레오오즈 시리얼", "하기스 매직팬티", "맛있는 우유GT" };                          
		// 상품 품목 나열한 문장형 배열 선언
		int[] k01_price = { 8580, 4180, 1370, 8480, 2580, 4980, 1000, 1200, 3500, 1200, 
				7000, 1000, 1000, 1000, 1100, 1100, 1200, 1500, 1000, 1300, 
				3000, 4900, 1000, 1200, 1000, 1000, 1200, 2500, 9000, 4900}; 																					        
		// 단가 나열한 정수형 배열 선언
		int[] k01_amount = { 2, 2, 3, 1, 1, 3, 5, 2, 2, 3, 8, 9, 5, 3, 3, 4, 6, 6, 1, 2, 3, 3, 4, 6, 4, 2, 6, 3, 9, 7 }; 											
		// 각 상품 수량 나열한 정수형 배열 선언
		boolean[] k01_taxFree = { false, true, false, false, false, false, false, false, false, false, true, false, false, false, false,
				false, false, false, false, false, false, true, false, false, false, false, false, false, true, false }; 								        	
		// 면세유무 나열한 boolean 배열 선연(true: 면세)
				
		DecimalFormat k01_df = new DecimalFormat("###,###,###,###,###");					// DecimalFormat 클래스 활용하여 숫자에 , 찍기
		Date k01_today = new Date();									   					// 현재시간 부르는 Date 클래스 선언
		SimpleDateFormat k01_date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");			    // [구 매] 항목에서 활용되는 날짜 형식 선언
		SimpleDateFormat k01_date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");			// 입차시간 항목에서 활용되는 날짜 형식 선언
		SimpleDateFormat k01_date3 = new SimpleDateFormat("yyyyMMdd");						// 영수증 맨 마지막 항목에서 활용되는 날짜 형식 선언
		Calendar k01_cal = Calendar.getInstance();											// Calendar 클래스 활용하여 시간 조정
		k01_cal.setTime(k01_today);															// 현재 시간 출력
		k01_cal.add(Calendar.HOUR, -1);														// 주차시간 설정	   		
		int k01_taxPrice = 0;								// 과세품목 총 금액
		int k01_freePrice = 0;								// 면세품목 총 금액
		int k01_totalPrice = 0;								// 전체 총 금액
		int k01_netPrice = 0;								// 세전금액
		int k01_tax = 0;									// 세금		
		
		System.out.printf("%35s\n", "이마트 죽전점 (031)888-1234");          			                // 이마트 죽전점 (031)888-1234 출력 후 줄바꿈
		System.out.printf("%7s%23s\n", "emart", "206-86-50913 강희석");		   		        		    // emart  206-86-50913 강희석 출력 후 줄바꿈
		System.out.printf("%29s\n", "용인 수지구 포은대로 552");									    // 용인 수지구 포은대로 552 출력 후 줄바꿈
		System.out.println();																		    // 줄바꿈
		System.out.printf("영수증 미지참시 교환/환불 불가\n");									        // 영수증 미지참시 교환/환불 불가 출력 후 줄바꿈
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n"); 								    // 정상상품에 한함, 30일 이내(신선 7일) 출력 후 줄바꿈
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");								    // ※일부 브랜드매장 제외(매장 고지물참조) 출력 후 줄바꿈
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n"); 							    // 교환/환불 구매점에서 가능(결제카드 지참) 출력 후 줄바꿈
		System.out.println();																		    // 줄바꿈
	    System.out.printf("%s%s%18s\n", "[구 매]", k01_date1.format(k01_today), "POS:0011-9861");	    // [구  매] + 현재 날짜 + POS:0011-9861 출력 후 줄바꿈
		System.out.printf("-----------------------------------------\n");                       	    // ------------------------- 출력 후 줄바꿈
		System.out.printf("%9s%15s%3s%5s\n", "상 품 명", "단  가", "수량", "금  액");			        // 상품명, 단가, 수량, 금액 출력 후 줄바꿈
		System.out.printf("-----------------------------------------\n");								// ------------------------- 출력 후 줄바꿈
		
		for (int k01_i = 0; k01_i < k01_itemname.length; k01_i++) {										// 0 <= i < 상품품목 길이만큼 1씩 증가하는 동안
			if (k01_taxFree[k01_i] == true) {															// 면세품목일 때
				System.out.printf("*");																	// * 출력
				k01_freePrice += k01_price[k01_i] * k01_amount[k01_i];									// 각 면세품목의 금액과 수량 곱해서 해당 품목 최종금액 산정			
			} else {																					// 관세품목 일때
				System.out.printf(" ");																	// 공백 출력
				k01_taxPrice += k01_price[k01_i] * k01_amount[k01_i];									// 각 과세품목 총 금액 산정
			}
			System.out.printf("%s%9.9s%3d%10.10s\n", cutByBytes(k01_itemname[k01_i], 9),					// 상품명(8자)
					k01_df.format(k01_price[k01_i]), k01_amount[k01_i], 								// 상품 가격, 상품 수량
					k01_df.format(k01_price[k01_i] * k01_amount[k01_i]));								// 상품 합계 가격
			if ((k01_i + 1) % 5 == 0) {																	// 5줄씩 줄바꿈
				System.out.printf("-----------------------------------------\n");						// ------------------------- 출력 후 줄바꿈  
			}
		}
		
		k01_totalPrice = k01_taxPrice + k01_freePrice;		// 전체 총 금액 = 과세품목 총금액 + 면세품목 총 금액
		k01_netPrice = getNetPrice(k01_taxPrice);			// 세전금액 : getNetPrice 매소드 적용
		k01_tax = k01_taxPrice - k01_netPrice;				// 세금 = 관세금액 - 세전금액	
		
		System.out.println();  																					// 줄바꿈
		System.out.printf("%22s%14d\n", "총 품목 수량", k01_itemname.length);									// 총 상품 수량
		System.out.printf("%23s%14s\n", "(*)면 세  물 품", k01_df.format(k01_freePrice));						// 숫자 출력 형식 사용 면세상품 총액
		System.out.printf("%23s%14s\n", "과 세  물 품", k01_df.format(k01_netPrice));							// 숫자 출력 형식 사용 과세상품 총액
		System.out.printf("%24s%14s\n", "부   가   세", k01_df.format(k01_tax));								// 숫자 출력 형식 사용 부가세
		System.out.printf("%25s%14s\n", "합        계", k01_df.format(k01_totalPrice));							// 숫자 출력 형식 사용 총 합계액
		System.out.printf("결 제 대 상 금 액%24.24s\n", k01_df.format(k01_totalPrice)); 						// 숫자 출력 형식 사용 결제금액
		System.out.printf("-----------------------------------------\n");										// ------------------------- 출력 후 줄바꿈
		System.out.printf("0012 KEB 하나       541707**0408/35860658\n");										// 0012 KEB 하나 541707**0487/35860658 출력 후 줄바꿈
		System.out.printf("카드결제(IC)        %18.18s\n", "일시불 / " + k01_df.format(k01_totalPrice));		// 카드결제(IC) + 일시불 + 해당변수 출력 후 줄바꿈	
		System.out.printf("-----------------------------------------\n");                                		// ------------------------- 출력 후 줄바꿈
		System.out.printf("%20s\n", "[신세계포인트 적립]");						                                // [신세계포인트 적립] 출력 후 줄바꿈	
		System.out.printf("%s\n", "홍*두 고객님의 포인트 현황입니다.");											// 홍*두 고객님의 포인트 현황입니다. 출력 후 줄바꿈	
		System.out.printf("%s%18s%9d\n", "금회발생포인트", "9350**9995", 164);                    		        // 금회발생포인트 + 9350**9995              164 출력 후 줄바꿈	
		System.out.printf("%s%25s\n", "누계(가용)포인트", "5,637(       5,473)");								// 누계(가용)포인트 + 5,637(             5,473) 출력 후 줄바꿈	
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다.");										// *신세계포인트 유효기간은 2년입니다. 출력 후 줄바꿈	
		System.out.printf("-----------------------------------------\n");                                  		// ------------------------- 출력 후 줄바꿈
		System.out.printf("%22s\n", "구매금액기준 무료주차시간 자동부여");										// 구매금액기준 무료주차시간 자동부여 출력 후 줄바꿈	
		System.out.printf("%s%29s\n", "차량번호  :", "34저****");     											// 차량번호  : + 34저**** 출력 후 줄바꿈	
		System.out.printf("입차시간 :            %s\n", k01_date2.format(k01_cal.getTime()));					// 입차시간 + 해당변수 출력 후 줄바꿈
		System.out.printf("-----------------------------------------\n");                                  		// ------------------------- 출력 후 줄바꿈
		System.out.printf("%s%25d\n", "캐셔:084599 양00", 1150);												// 캐셔:084599  양00 + 1150 출력 후 줄바꿈
		System.out.printf("%15s%s\n", k01_date3.format(k01_cal.getTime()), "/00119861/00164980/31");			// 20210423/00119861/00164980/31 출력 후 줄바꿈
	}

	// 세전가격 구하기
	public static int getNetPrice(int k01_iPrice) {
		double k01_tax_Rate = 10.0 / 11.0;											// 세율 10%, 부동소수점 오류 방지 -> 소비자가격 * 10.0 / 11.0 
		double k01_netPrice = k01_iPrice * k01_tax_Rate; 							// 세전가격 = 소비자가격 / (1 + 세율)
		return (int) k01_netPrice; 													// 정수형으로 소비자가격 변환
	}

	// 문자열에서 한글 찾는 매서드
	public static String cutByBytes(String k01_item, int k01_length) {
		byte[] k01_inputByte = k01_item.getBytes();									// 상품명을 바이트 단위 배열로 선언
		int k01_cutByte = 0;														// 자르는 바이트 수 나타내는 변수 선언
		int k01_maxByte = k01_length * 2;											// 상품품목의 최대 바이트 수: 한글바이트(2) * 전체글자 수
		int k01_maxLength = 18;														// 최대 글자 길이 18으로 지정
		int k01_byteLen = 0;														// 문자열 길이 나타내는 변수 선언(한글 2, 그 외 1)

		for (int k01_i = 0; k01_i < k01_item.length(); k01_i++) {					// 0 <= i < 상품품목 길이만큼 1씩 증가하는 동안
			if (Character.getType(k01_item.charAt(k01_i)) == 5) {					// Character.getType() : 자바 문자열에서 한글 찾기(한글인 경우 5를 리턴)
				k01_cutByte += 2;													// 한글인 경우 2바이트 추가하여 깨짐방지 
			} else {																// 한글이 아닌 경우
				k01_cutByte += 1;													// 1바이트 추가하여 그외 글자 바이트 선언
			}
			if (k01_cutByte >= k01_maxLength) { 									// 최대 바이트수 보다 같거나 크면 탈출
				break;
			}
		}
		String k01_cutItem = new String(k01_inputByte, 0, k01_cutByte); 			// 바이트로 잘라낸 문자열 생성 (k01_inputByte 배열을 인덱스 0에서 k01_cutByte까지 추출)
		k01_byteLen = getLength(k01_cutItem); 										// 문자 길이 체크하는 변수 선언

		while (k01_byteLen > k01_maxLength) {										
			if (k01_byteLen >= k01_maxLength) {										// 문자열길이가 최대 길이보다 크거나 같을 때
				k01_cutItem = k01_cutItem.substring(0, k01_cutItem.length() - 1);   // 마지막 글자 삭제
				k01_byteLen = getLength(k01_cutItem); 								// 문자 길이 재체크
			}
		}
		
		if (k01_byteLen <= k01_maxLength) {											// 문자열길이가 최대 길이보다 작거나 같을 때
			for (int k01_i = 0; k01_i < k01_maxLength - k01_byteLen; k01_i++) {  	// 최장길이에서 문자열길이 뺀 만큼
				k01_cutItem += " ";													// 공백 출력하여 길이 맞춤
			}
		}
		return k01_cutItem; 														// 줄어든 상품이름 반환
	}

	// 문자열 길이 체크 메소드
	public static int getLength(String k01_cutItem) {
		int k01_byteLen = 0;
		for (int k01_i = 0; k01_i < k01_cutItem.length(); k01_i++) { 				// 문자열 전체
			if (Character.getType(k01_cutItem.charAt(k01_i)) == 5) { 				// 한글인 경우
				k01_byteLen += 2; 													// 바이트길이 + 2
			} else { 																// 한글이 아닌 경우
				k01_byteLen += 1; 													// 바이트길이 + 1
			}
		}
		return k01_byteLen;
	}
}