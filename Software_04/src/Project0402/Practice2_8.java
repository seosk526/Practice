package Project0402;
		
public class Practice2_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] k01_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		//문장형 1차원 배열 k01_units 선언
		for (int i = 0; i < 101; i++) {   //0 <= i < 101까지 100번 반복하는 동안
			if (i >= 0 && i < 10) {       //0 <= i < 10인 경우  
				System.out.printf("일의자리 : %s\n", k01_units[i]);
				//"일의자리 : k01_units[i]" 출력 후 줄바꿈
			} else if (i >= 10 && i < 100) {   //10 <= i < 100인 경우  
				int k01_i10, k01_i0;           //정수형 변수 k01_i10, k01_i0 선언
				k01_i10	= i / 10;    //10으로 나눈 몫이 십의자리
				k01_i0 = i % 10;     //10으로 나눈 나머지 값이 일의자리
				if (k01_i0 == 0) {   //일의자리가 0인 경우
					System.out.printf("십의자리 : %s십\n", k01_units[k01_i10]);
					//"k01_units[k01_i10]십" 출력 후 줄바꿈
				} else {             //일의자리가 0이 아닌 경우 
					System.out.printf("십의자리 : %s십%s\n", k01_units[k01_i10], k01_units[k01_i0]);
					//"k01_units[k01_i10]십k01_units[k01_i0]" 출력 후 줄바꿈
				}
			}
			else System.out.printf("==> %d\n", i);   //i개수 출력 후 줄바꿈
		}
	}
}
