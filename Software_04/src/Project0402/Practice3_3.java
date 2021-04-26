package Project0402;

public class Practice3_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int k01_n, k01_m;        //정수형 변수 k01_n, k01_m 선언
		k01_m = 10; k01_n = 1;   //각각의 변수 10,1로 초기값 설정
		
		while (true) {
			for (int i = 0; i < k01_m; i++) System.out.printf(" ");
			//0<= i < k01_m인동안 빈칸 출력 후 줄바꿈 X
			for (int i = 0; i < k01_n; i++) System.out.printf("*");
			//0<= i < k01_n인동안 * 출력
			System.out.printf("\n");   //줄바꿈 출력
			
			k01_m = k01_m -1;       //k01_m 줄수 차감
			k01_n = k01_n + 2;      //k01_n이 홀수로 별찍히게 변수 수정
			if (k01_m < 0) break;   //줄수가 0미만이 되면 while문 종료
		}
	}
}
