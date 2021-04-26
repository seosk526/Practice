package Software_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StockDailyPrice_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\강세영\\Desktop\\day_data\\THTSKS010H00.dat");		// 파일 저장 위치 설정
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));					// BufferedReader 클래스 사용해서 f파일 읽기
		
		File k01_f1 = new File("C:\\Users\\강세영\\Desktop\\StockDailyPrice.csv");			// 파일 저장 위치 설정
		BufferedWriter k01_bw1 = new BufferedWriter(new FileWriter(k01_f1));				// BufferedWriter 클래스 사용해서 f1파일 생성
				
		String k01_readtxt;																	// 문장형 변수 k01_readtxt 선언
		int k01_cnt = 0;																	// 정수형 변수 k01_cnt 선언
		int k01_wcnt = 0;																	// 정수형 변수 k01_wcnt 성넌
		while ((k01_readtxt = k01_br.readLine()) != null) {									// br에 k01_readtxt안 내용이 아무것도 없지 않다면
			StringBuffer k01_s = new StringBuffer();										//스트링 버퍼 생성
			String [] k01_field = k01_readtxt.split("%_%");									// %_% 구분자로 하여 문장형 배열 k01_field 생성
			
			if (k01_field.length > 2&&k01_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				k01_s.append(k01_field[0].replace("^", "").trim());							// 배열 field 길이가 2이상이면서 ^를 공뱅ㄱ으로 바꾼 한글자가 A일 때, A를 잡아내서 csv를 생성
				for (int k01_j = 1; k01_j < k01_field.length; k01_j++) {					// 1 <= k01_j < 01_field 범위에서 1씩 증가하는 동안
					k01_s.append("," + k01_field[k01_j].replace("^", "").trim());			// 덮어쓰기
				}
				k01_bw1.write(k01_s.toString());									// k01_s.toString 출력
				k01_bw1.newLine();													// 줄바꿈					
				k01_wcnt++;															// k01_wcnt 1씩 증가
			}
			k01_cnt++;																// k01_cnt 1씩 증가
		}	
		k01_br.close();																// BufferedReader 클래스 종료
		k01_bw1.close();															// BufferedWriter 클래스 종료
		System.out.printf("Program End[%d][%d]records\n", k01_cnt, k01_wcnt);		// Program End [k01_cnt][k01_wcnt]records 출력 후 줄바꿈
	}
}