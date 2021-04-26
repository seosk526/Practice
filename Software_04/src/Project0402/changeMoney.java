package Project0402;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class changeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_MyWon = 1000000;         //내가 가지고 있는 금액 100만원
		double k01_MoneyEx = 1238.21;    //달러 환율
		double k01_commission = 0.003;   //환전 수수료 0.3%

		int k01_usd = (int) (k01_MyWon / k01_MoneyEx);
		//환전받는 달러: 한국 원화에서 환율 나눈 값(몫)만큼 받음
		int k01_remain = (int) (k01_MyWon - k01_usd * k01_MoneyEx);
		/*지급받은 달러에서 환율 곱한 값: 원화로 받은 값으로 변경한 것
		 * 잔돈: 기존 원화 - 달러로 바꾼 원화 값
		 */
		System.out.printf("****************************************************\n");   //* 출력 후 줄바꿈
 		System.out.printf("*     		    수수료 없이 계산   		   *\n");              //수수료 없이 계산 출력 후 줄바꿈
 		System.out.printf("  총 한화환전금액: %d원 => 미화: %d달러, 잔돈: %d원\n", k01_MyWon, k01_usd, k01_remain); 
 		//총 한화환전금액: %d원 => 미화: %d달러, 잔돈: %d원 문장과 그에 해당 되는 변수 출력 후 줄바꿈
		System.out.printf("****************************************************\n");   //* 출력 후 줄바꿈	
				
		double k01_ComPerOne = k01_MoneyEx * k01_commission;   //1달러당 수수료
		double k01_totalcom = k01_usd * k01_ComPerOne;         //1달러당 수수료를 환전받는 달러와 곱해서 전체 금액의 수수료 계산     
	
		System.out.printf("**************************************************************\n");   //* 출력 후 줄바꿈
 		System.out.printf("*     		           수수료 계산     		     *\n");                  //수수료 계산 출력 후 줄바꿈 
 		System.out.printf("  총 수수료: %f원 => 미화: %d달러, 달러당 수수료: %f원\n", k01_totalcom, k01_usd, k01_ComPerOne); 
 		//총 수수료: %f원 => 미화: %f달러, 달러당 수수료: %f원 문장과 그에 해당 되는 변수 출력 후 줄바꿈
		System.out.printf("**************************************************************\n");   //* 출력 후 줄바꿈 
		
		int k01_i_totalcom;   //전체 환전수수료 나타내는 정수형 변수
		if (k01_totalcom != (double)((int)k01_totalcom)) 
				k01_i_totalcom = (int)k01_totalcom + 1;
		//정수형 수수료와 실수형 수수료가 같지 않은 경우, 소수점값까지 받아야하기 때문에 +1 적용
		else
			k01_i_totalcom = (int)k01_totalcom;   //두 변수 값이 같은 경우 실수형을 형변환하여 대입		
		System.out.printf("**************************************************************\n");   //* 출력 후 줄바꿈
 		System.out.printf("*     		           수수료 적용환전     		     *\n");              //수수료 적용환전 출력 후 줄바꿈 
 		System.out.printf("      총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k01_i_totalcom, k01_usd, k01_ComPerOne); 
		//총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원 문장과 그에 해당 되는 변수 출력 후 줄바꿈
 		k01_remain = (int) (k01_MyWon - k01_usd * k01_MoneyEx - k01_i_totalcom);
 		//기존 계산한 잔돈에서 수수료도 차감
 		System.out.printf("      총 한화환전금액: %d원 => 미화: %d달러, 잔돈: %d원\n", k01_MyWon, k01_usd, k01_remain); 
		//총 한화환전금액: %d원 => 미화: %d달러, 잔돈: %d원 문장과 그에 해당 되는 변수 출력 후 줄바꿈
 		//수수료 형이 정수로 바뀌었기 때문에 출력할 때 %f->%d로 수정
		System.out.printf("**************************************************************\n");	 //* 출력 후 줄바꿈

		k01_usd = (int)(k01_MyWon / (k01_MoneyEx + k01_ComPerOne));
		//정확한 환전달러= 원화에서 (1달러+1달러환전수수료) 나눈 값
		k01_totalcom = k01_usd * k01_ComPerOne;   //정확한 총 수수료
		if (k01_totalcom != (double)((int)k01_totalcom))
			k01_i_totalcom = (int)k01_totalcom + 1;
		//정수형 수수료와 실수형 수수료가 같지 않은 경우, 소수점값까지 받아야하기 때문에 +1 적용
		else
			k01_i_totalcom = (int)k01_totalcom;
		//수수료 올림처리
		System.out.printf("**************************************************************\n");   //* 출력 후 줄바꿈
 		System.out.printf("*     		          (정확한)수수료 적용환전  	             *\n");      //(정확한)수수료 적용환전 출력 후 줄바꿈 
 		System.out.printf("      총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k01_i_totalcom, k01_usd, k01_ComPerOne); 
		//총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원 문장과 그에 해당 되는 변수 출력 후 줄바꿈
 		k01_remain = (int) (k01_MyWon - k01_usd * k01_MoneyEx - k01_i_totalcom);
 		//환전받는 달러가 변경되었기 때문에 잔돈 변수 수정
 		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료징구: %d원 잔돈: %d원\n", k01_MyWon, k01_usd, k01_i_totalcom, k01_remain);
 		//총 한화환전금액: %d원 => 미화: %d달러, 수수료징구: %d원 잔돈: %d원 문장과 그에 해당 되는 변수 출력 후 줄바꿈
		System.out.printf("**************************************************************\n");	 //* 출력 후 줄바꿈

		DecimalFormat k01_df = new DecimalFormat( "###, ###, ###, ###, ###" );
		//DecimalFormatClass 활용
		System.out.printf("************************************************************************************\n");   //* 출력 후 줄바꿈
 		System.out.printf("*     		      	          콤마찍기, 날짜 적용     	         	          *\n");           //콤마찍기, 날짜 적용 출력 후 줄바꿈 
 		System.out.printf("         총 수수료: %s원 => 미화: %s달러, 달러당 수수료: %f원\n",
 				k01_df.format(k01_i_totalcom),
 				k01_df.format(k01_usd),
 				k01_ComPerOne );
 		//총 수수료: %s원 => 미화: %s달러, 달러당 수수료: %f원 문장과 그에 해당 되는 변수를 DecimalFormat 매소드 활용하여 인자 값으로 지정 후 출력
 		k01_remain = (int) (k01_MyWon - k01_usd * k01_MoneyEx - k01_i_totalcom);
 		//환전받는 달러가 변경되었기 때문에 잔돈 변수 수정
 		System.out.printf(" 총 한화환전금액: %s원 => 미화: %s달러, 수수료징구: %s원 잔돈: %s원\n",
 				k01_df.format(k01_MyWon), k01_df.format(k01_usd), k01_df.format(k01_i_totalcom), k01_df.format(k01_remain) );
 		//총 한화환전금액: %s원 => 미화: %s달러, 수수료징구: %s원 잔돈: %s 문장과 그에 해당 되는 변수를 DecimalFormat 매소드 활용하여 인자 값으로 지정 후 출력
 		Calendar k01_calt = Calendar.getInstance();   //Calendar.getInstance() 함수 활용
		SimpleDateFormat k01_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		//현재시간 알려주는 매소드
		System.out.printf(" 최종실행시간: %s\n", k01_sdt.format(k01_calt.getTime()));
		//해당 클래스를 실행한 시간 출력
		System.out.printf("************************************************************************************\n");   //* 출력 후 줄바꿈		
	}	
}
