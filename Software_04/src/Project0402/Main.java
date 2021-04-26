package Project0402;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_iA, k01_iB;   //숫자형 변수 k01_iA, k01_iB 선언
		k01_iA = 0;           //변수 k01_iA를 0으로 초기값 설정
		
		while (true) {        //( )안이 참이기 때문에 { } 해당 내용이 계속 반복 
			k01_iB = 0;       //변수 k01_iA를 0으로 초기값 설정
			while (true) {    //이중 while: ( )안이 참이기 때문에 { } 해당 내용이 계속 반복 
				System.out.printf("*");   //*출력
				
				if (k01_iA == k01_iB)     //변수 k01_iA와 k01_iB가 같다면
					break;                //while문 종료 
				k01_iB++;                 //변수 k01_iB는 반복되면서 1씩 증가
			}
			System.out.printf("\n");      //*찍는 while문 종료된 후 줄바꿈 출력
			k01_iA++;                     //변수 k01_iA는 전체 while문 안에서 반복되면서 1씩 증가
			if (k01_iA == 10)             //변수 k01_iA가 증가하다가 10이 되면
				break;                    //전체 while문 종료
		}		
	}
}
