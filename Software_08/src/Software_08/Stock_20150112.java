package Software_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Stock_20150112 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\seosk\\Desktop\\StockDailyPrice.csv");			// 파일 저장 위치 설정
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));					// BufferedReader 클래스 사용해서 k01_f파일 읽기
		
		File k01_f1 = new File("C:\\Users\\seosk\\Desktop\\20150112.csv");					// 파일 저장 위치 설정
		BufferedWriter k01_bw = new BufferedWriter(new FileWriter(k01_f1));					// BufferedWriter 클래스 사용해서 k01_f1파일 생성
		
		String k01_readtxt;														// 문장형 변수 k01_readtxt 선언
		int k01_cnt = 0;														// 정수형 변수 k01_cnt 선언	
		
		while ((k01_readtxt = k01_br.readLine()) != null) {						// k01_br에 k01_readtxt안 내용이 아무것도 없지 않다면
			StringBuffer k01_s = new StringBuffer();							//스트링 버퍼 생성
			String [] k01_field = k01_readtxt.split(",");						// ,를 구분자로 하여 문장형 배열 k01_field 생성
			
			if (k01_field[1].equals("20150112")) {								// k01_field[1] 항목이 20150112이라면
				k01_s.append(k01_field[0].trim());								// k01_field[0]부터 공백없이 모든 항목 덮어쓰기
				for (int k01_j = 1; k01_j < k01_field.length; k01_j++) {		// 1 <= k01_j < 01_field 범위에서 1씩 증가하는 동안
					k01_s.append("," + k01_field[k01_j].trim());				// 덮어쓰기
				}
				k01_bw.write(k01_s.toString());									// k01_s.toString 출력
				k01_bw.newLine();												// 줄바꿈			
				k01_cnt++;														// k01_cnt 1씩 증가				
			}
		}
		k01_br.close();												// BufferedReader 클래스 종료
		k01_bw.close();												// BufferedWriter 클래스 종료
		System.out.printf("20150112 [%d] records\n", k01_cnt);		// 20150112 [k01_cnt]records 출력 후 줄바꿈			
	}
}
