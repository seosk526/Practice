package Project0402;

import java.text.DecimalFormat;

public class Practice3_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String k01_item = "사과";     //품목 변수 초기값 "사과"로 설정 
		int k01_unit_price = 5000;   //단가 변수 초기값 5000으로 설정
		int k01_num = 500;           //수량 변수 초기값 500으로 설정		
		int k01_total = 0;           //합계 초기값 0으로 설정
		
		DecimalFormat k01_df = new DecimalFormat( "###, ###, ###, ###, ###" );
		//DecimalFormatClass 활용
		System.out.printf("==============================================================\n");   //"===="출력 후 줄바꿈
		System.out.printf("%30.30s%8.8s%8.8s%13.13s\n", "품목", "단가", "수량", "합계");              
		//"품목", "단가", "수량", "합계" 왼쪽정렬, 칸수 띄어서 출력 후 줄바꿈
		System.out.printf("==============================================================\n");   //"===="출력 후 줄바꿈		
		System.out.printf("%30.30s%13.13s%9.9s%14.14s\n",				
				k01_item, k01_df.format(k01_unit_price), k01_df.format(k01_num), k01_df.format(k01_unit_price * k01_num));
		//"품목", "단가", "수량", "합계"에 해당되는 변수 출력 후 줄바꿈
		System.out.printf("==============================================================\n");   //"===="출력 후 줄바꿈
	}
}
