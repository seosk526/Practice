package Project0402;

public class Practice2_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int k01_iNumVal = 1001034567;   //정수형 변수 k01_iNumVal 1001034567으로 초기값 설정
		String k01_sNumVal = String.valueOf(k01_iNumVal);
		//정수형 k01_iNumVal을 문장형으로 변환
		String k01_sNumVoice = "";
		System.out.printf("==> %s [%d자리]\n", k01_sNumVal, k01_sNumVal.length());
		//k01_sNumVal 자리수는 길이 통해 확인 가능
		int k01_i, k01_j;   //정수형 변수 k01_i, k01_j 선언
		
		String [] k01_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		String [] k01_unitX = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"};
		
		k01_i = 0;                          //k01_i 초기값 0으로 설정
		k01_j = k01_sNumVal.length() - 1;   //k01_j 초기값 k01_sNumVal 길이수 -1로 설정
		
		while (true) {
			if (k01_i >= k01_sNumVal.length()) break;   
			//k01_i가 k01_sNumVal길이 이상인 경우 종료
			System.out.printf("%s[%s]",
					k01_sNumVal.substring(k01_i, k01_i + 1),
					k01_units[Integer.parseInt(k01_sNumVal.substring(k01_i, k01_i + 1))]);
			if (k01_sNumVal.substring(k01_i, k01_i + 1).equals("0")) {
				if (k01_unitX[k01_j].equals("만") || k01_unitX[k01_j].equals("억")) {
					k01_sNumVoice = k01_sNumVoice + "" + k01_unitX[k01_j];
				}
			}
		}
	}
}
