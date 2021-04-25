package Software_08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWrite_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {																	// try catch 활용해서 예외 선언 (또는 매소드명에 throw IOException 적어서 예외 선언할 수 있음)
			File k01_f = new File("C:\\Users\\seosk\\Desktop\\Mytest.txt");		// 파일 저장 위치 설정
			FileWriter k01_fw = new FileWriter(k01_f);							// 텍스트 데이터를 파일에 저장하기 위해 FileWriter 클래스 선언			
			k01_fw.write("안녕 파일\n");										// 안녕 파일 입력 후 줄바꿈
			k01_fw.write("hello 헬로\n");										// hello 헬로 입력 후 줄바꿈
			
			k01_fw.close();														// FileWriter 클래스 종료
			
			FileReader k01_fr = new FileReader(k01_f);				// 파일 읽기 위한 FileReader 클래스 선언
			
			int k01_n = -1;											// 정수형 변수 k01_n 초기값 -1로 설정
			char [] k01_ch;											// 문자형 배열 k01_ch 선언
			
			while (true) {											// 반복문 실행
				k01_ch = new char[100];								// k01_ch 배열 [100]으로 선언
				k01_n = k01_fr.read(k01_ch);						// k01_n을 배열 k01_ch에 넣고 읽기
				if (k01_n == -1) break;								// k01_n == -1 일때 반복문 종료
				
				for (int k01_i = 0; k01_i < k01_n; k01_i++) {		// 0 <= k01_i < k01_n까지 k01_i가 1씩 증가할 때
					System.out.printf("%c", k01_ch[k01_i]);			// k01_ch[k01_i] 출력
				}
			}
			k01_fr.close();											// FileReader 클래스 종료
			System.out.printf("\n FILE READ END");					// FILE READ END 출력
		} catch (Exception e) {										// Exception 에러가 발생하면
			System.out.printf("나 에러[%s]\n", e);					// 나 에러e 출력
		}
	}
}
