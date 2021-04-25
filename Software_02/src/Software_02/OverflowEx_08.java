package Software_02;

public class OverflowEx_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short k01_sMin = -32768;
		short k01_sMax = 32767;
		char k01_cMin = 0;
		char k01_cMax = 65535;
		
		System.out.println("k01_sMin = " + k01_sMin);
		System.out.println("k01_sMin - 1 = " + (short)(k01_sMin - 1));
		System.out.println("k01_sMax = " + k01_sMax);
		System.out.println("k01_sMax + 1 = " + (short)(k01_sMax - 1));
		System.out.println("k01_cMin = " + (int)k01_cMin);
		System.out.println("k01_cMin - 1 =" + (int)--k01_cMin);
		System.out.println("k01_cMax = " + (int)k01_cMax);
		System.out.println("k01_cMax + 1 =" + (int)++k01_cMax);
	}
}
