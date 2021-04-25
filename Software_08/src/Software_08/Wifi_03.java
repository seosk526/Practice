package Software_08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Wifi_03 {

	public static void main(String[] args) throws IOException {										// try catch 활용하지 않았기 때문에 매소드에 예외처리사항 선언 
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\seosk\\Desktop\\전국무료와이파이표준데이터.csv");				// 파일 저장 위치 설정
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));								// BufferedReader 클래스 사용해서 f파일 읽기
		
		String k01_readtxt;																				// 문장형 변수 readtxt 선언
		if ((k01_readtxt = k01_br.readLine()) == null) {												// br에 readtxt안 내용이 아무것도 없다면(한 줄을 먼저 읽어야 필드명 알 수 있음)
			System.out.printf("빈 파일입니다.\n");														// 빈 파일입니다. 출력 후 줄바꿈
		}
		String [] k01_field_name = k01_readtxt.split(",");												// readtxt를 ,로 구분한 후 field_name 배열에 저장
		int k01_LineCnt = 0;																			// 번호 나타낼 정수형 변수 LineCnt 선언
		while ((k01_readtxt = k01_br.readLine()) != null) {												// br에 readtxt안 내용이 아무것도 없지 않다면
			String [] k01_field = k01_readtxt.split(",");												// readtxt를 ,로 구분한 후 field 배열에 저장
			System.out.printf("**[%d번째 항목]************************************\n", k01_LineCnt);	// LineCnt번째 항목 출력 후 줄바꿈
			for (int k01_j = 0; k01_j < k01_field_name.length; k01_j++) {								// 0 <= k01_j < field_name 길이(field 길이도 가능) 범위에서 1씩 증가하는 동안
				System.out.printf(" %s : %s\n", k01_field_name[k01_j], k01_field[k01_j]);				// k01_field_name : k01_field 출력 후 줄바꿈
			}
			System.out.printf("****************************************************\n");				// ********** 출력 후 줄바꿈
			if (k01_LineCnt == 100) break;																// LineCnt가 100이 되면 for문 종료
			k01_LineCnt++;																				// LineCnt 1씩 증가
		}
		k01_br.close();																					// BufferedReader 클래스 종료
	}
}