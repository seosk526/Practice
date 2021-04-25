package Software_02;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_x = 10;			// 정수형 변수 k01_x 초기값 10으로 선언
		int k01_y = 20;			// 정수형 변수 k01_y 초기값 20으로 선언
		int k01_tmp = 0;		// 정수형 변수 k01_tmp 초기값 0으로 선언
		
		System.out.println("k01_x:" + k01_x + " k01_y:" + k01_y);
		// k01_x:10 k01_y:20 출력 후 줄바꿈 
		k01_tmp = k01_x;		// k01_tmp = 10
		k01_x = k01_y;			// k01_x = 20
		k01_y = k01_tmp;		// k01_y = 10
		
		System.out.println("k01_x:" + k01_x + " k01_y:" + k01_y);
		// k01_x:20 k01_y:10 출력 후 줄바꿈 
	}
}
