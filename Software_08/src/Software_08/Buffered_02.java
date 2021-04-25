package Software_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_02 {

	public static void FileWrite() throws IOException {						// try catch 활용하지 않았기 때문에 매소드에 예외처리사항 선언 
		File k01_f = new File("C:\\Users\\seosk\\Desktop\\Mytest.txt");			// 파일 저장 위치 설정
		BufferedWriter k01_bw = new BufferedWriter(new FileWriter(k01_f));		// BufferedWriter 클래스 사용해서 f파일 쓰기
		k01_bw.write("안녕 파일");												// 안녕 파일 입력
		k01_bw.newLine();														// 줄바꿈
		k01_bw.write("hello 헬로");												// hello 헬로 입력
		k01_bw.newLine();														// 줄바꿈
		k01_bw.close();															// BufferedWriter 클래스 종료
	}
	
	public static void FileRead() throws IOException {						// try catch 활용하지 않았기 때문에 매소드에 예외처리사항 선언 
		File k01_f = new File("C:\\Users\\seosk\\Desktop\\Mytest.txt");			// 파일 저장 위치 설정
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));		// BufferedReader 클래스 사용해서 f파일 읽기
		String k01_readtxt;														// 문장형 변수 readtxt 선언
		
		while ((k01_readtxt = k01_br.readLine()) != null) {						// br에 readtxt안 내용이 아무것도 없지 않다면
			System.out.printf("%s\n", k01_readtxt);								// readtxt 출력 후 줄바꿈
		}
		k01_br.close();															// BufferedReader 클래스 종료
	}
		
	public static void main(String[] args) throws IOException {				// try catch 활용하지 않았기 때문에 매소드에 예외처리사항 선언 
		// TODO Auto-generated method stub
		FileWrite();															// FileWrite 매소드 선언
		FileRead();																// FileRead 매소드 선언
	}
}
