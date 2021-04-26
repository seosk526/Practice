package Project0402;

public class Practice3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double k01_fSin;                  //실수형 변수 k01_fSin 선언
		for (int i = 0; i < 360; i++) {   //0 <= i < 359까지 증가하는 동안(각도 1씩 증가)
			k01_fSin = Math.sin(i * 3.141592 / 180);           //k01_fSin을 각 각도의 라디안 값으로 초기화
			System.out.printf("%d sin ==>%f\n", i, k01_fSin);  //각 각도의 sin값 출력
		}
		for (int i = 0; i < 360; i++) {  //0 <= i < 359까지 증가하는 동안
			k01_fSin = Math.sin(i * 3.141592 / 180);           //k01_fSin을 각 각도의 라디안 값으로 초기화
			int k01_iSpace = (int)((1.0 - k01_fSin) * 50); 
			//정수형 변수 k01_iSpace에 1에서 각 라디안 값을 뺀 값에 50을 곱해서 범위를 크게 만듦
			//-1 < sin < 1이기 때문에 최댓값 1에서 값을 빼주어 그 공백을 구함
			for (int j = 0; j < k01_iSpace; j++) System.out.printf(" ");  
			//0에서 k01_iSpace값보다 적을 때까지 j가 증가하는 동안 공백 출력
			System.out.printf("*[%f][%d]\n", k01_fSin, k01_iSpace);
			//줄바꿈없이 k01_fSin과 k01_iSpace 출력하고 줄바꿈
		}
	}
}