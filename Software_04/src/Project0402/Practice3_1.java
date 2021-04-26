package Project0402;

public class Practice3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		for (int k01_i = 0; k01_i < 10; k01_i++) {
			//0 <= k01_i < 10까지 10번 반복되는 동안
			for (int k01_j = 0; k01_j < k01_i; k01_j++) System.out.printf(" ");
			//0 <= k01_j <k01_i까지 반복되는 동안 빈칸 출력
			System.out.printf("%d\n", k01_i);
			//k01_i도 빈칸에 이어 출력 후 줄바꿈
		}
	}
}