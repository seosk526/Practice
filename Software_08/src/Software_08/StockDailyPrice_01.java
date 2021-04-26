package Software_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StockDailyPrice_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\강세영\\Desktop\\day_data\\THTSKS010H00.dat");		// 파일 저장 위치 설정
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));					// BufferedReader 클래스 사용해서 f파일 읽기
				
		String k01_readtxt;													// 문장형 변수 readtxt 선언
		int k01_LineCnt = 0;												// 몇 번째인지 출력하는 k01_LineCnt 변수 선언
		int k01_n = -1;														// 읽은 갯수 파악, 정수형 변수 k01_n 초기값 -1로 설정
		StringBuffer k01_s = new StringBuffer();							//스트링 버퍼 생성
		while (true) {														// 무한반복
			char [] k01_ch = new char [1000];								// char 배열 선언
			k01_n = k01_br.read(k01_ch);									// k01_n을 배열 k01_ch에 넣고 읽기 
			if (k01_n == -1) break;											// k01_n == -1 일때 반복문 종료
			for (int k01_i = 0; k01_i < k01_n; k01_i++) {					// 0 <= k01_i < k01_n까지 k01_i가 1씩 증가할 때
				if (k01_ch[k01_i] == '\n') {								// 개행
					System.out.printf("[%s]****\n", k01_s.toString());		// [s.toString()]**** 출력 후 줄바꿈
					k01_s.delete(0, k01_s.length());						// 0부터 s길이 전까지 삭제
				} else {													// 개행이 아닌 경우
					k01_s.append(k01_ch[k01_i]);							// 덧붙이기
				}
			}
		}
		System.out.printf("[%s]***\n", k01_s.toString());					// [s.toString()]**** 출력 후 줄바꿈
		k01_br.close();														// BufferedReader 클래스 종료		
	}
}