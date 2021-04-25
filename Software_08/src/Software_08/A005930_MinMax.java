package Software_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A005930_MinMax {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\seosk\\Desktop\\A005930.csv"); 			// 파일 저장 위치 설정
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f)); 			// BufferedReader 클래스 사용해서 k01_f파일 읽기

		String k01_readtxt; 														// 문장형 변수 k01_readtxt 선언
		int k01_min = Integer.MAX_VALUE; 											// 주가 최소값 변수
		int k01_max = Integer.MIN_VALUE;											// 주가 최대값 변수

		while ((k01_readtxt = k01_br.readLine()) != null) { 						// k01_br에 k01_readtxt안 내용이 아무것도 없지 않다면
			String[] k01_field = k01_readtxt.split(","); 							// ,를 구분자로 하여 문장형 배열 k01_field 생성
			int k01_stockPrice;														// 주가 넣을 변수 k01_stockPrice 선언

			if (k01_field[1].contains("2015")) { 									// k01_field[1] 항목에 2015가 포함된다면
				k01_stockPrice = Integer.parseInt(k01_field[3]);					// k01_stockPrice에 정수형 타입으로 형변환한 k01_field[3] 대입

				if (k01_min > k01_stockPrice) {							// 최소값 변수보다 k01_stockPrice가 작다면
					k01_min = k01_stockPrice;							// 최소값 변수에 k01_stockPrice 대입
				} else if (k01_max < k01_stockPrice) {					// 최대값 변수보다 k01_stockPrice가 크다면
					k01_max = k01_stockPrice;							// 최대값 변수에 k01_stockPrice 대입
				}
			}
		}
		k01_br.close(); 												// BufferedReader 클래스 종료
		System.out.printf("삼성전자 주가 최소값: %d\n", k01_min);		// 삼성전자 주가 최소값: k01_min 출력 후 줄바꿈
		System.out.printf("삼성전자 주가 최대값: %d", k01_max);			// 삼성전자 주가 최대값 : k01_max 출력
	}	
}
