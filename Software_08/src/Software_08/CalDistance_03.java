package Software_08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CalDistance_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k01_f = new File("C:\\Users\\강세영\\Desktop\\전국공영주차장정보.txt");			// 파일 저장 위치 설정
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));					// BufferedReader 클래스 사용해서 f파일 읽기
		String k01_readtxt;																	// 문장형 변수 k01_readtxt 선언
		
		if ((k01_readtxt = k01_br.readLine()) == null) {									// k01_br에 k01_readtxt안 내용이 아무것도 없다면(한 줄을 먼저 읽어야 필드명 알 수 있음)
			System.out.printf("빈 파일입니다.\n");											// 빈 파일입니다. 출력 후 줄바꿈
			return;																			// return값 호출하여 해당 매소드 마침
		}
		String [] k01_field_name = k01_readtxt.split("\t");									// k01_readtxt를 \t 기준으로 자른 후 k01_field_name 배열에 저장
		double k01_lat = 37.3650509;														// 우리집 위도
		double k01_lng = 127.1203713;														// 우리집 경도
		double k01_min = Double.MAX_VALUE;													// 현재지점과의 거리 최소값 변수
		double k01_max = Double.MIN_VALUE;													// 현재지점과의 거리 최대값 변수
		String k01_short_Dist = null;														// 최단거리 주소 변수 k01_short_Dist
		String k01_long_Dist = null;														// 최단거리 주소 변수 k01_long_Dist		
		
		while ((k01_readtxt = k01_br.readLine()) != null) {											// k01_br에 k01_readtxt안 내용이 아무것도 없지 않다면
			String [] k01_field = k01_readtxt.split("\t");											// k01_readtxt를 \t 기준으로 자른 후 k01_field 배열에 저장			
			if (k01_field[2].isEmpty() || k01_field[3].isEmpty()) {									// 위도, 경도가 공란인 경우
				continue;																			// 해당 공란인 부분 제외하고 반복문 진행
			}
			double k01_dist = Math.sqrt(Math.pow(Double.parseDouble(k01_field[3]) - k01_lat, 2)
					+ Math.pow(Double.parseDouble(k01_field[2]) - k01_lng, 2));						// 피타고라스 정리로 거리 구한 후 해당 값 k01_dist에 저장
			for (int k01_i = 0; k01_i < k01_readtxt.length(); k01_i++) {							// 0 <= k01_i < k01_readtxt 길이인 범위에서 1씩 증가하는 동안
				if (k01_min > k01_dist) {															// 최소값 변수보다 현재지점과의 거리가 더 작다면
					k01_min = k01_dist;																// 해당값을 최소값 변수에 대입
					if (k01_min == k01_dist) {														// 대입한 후 
						k01_short_Dist = k01_field[6];												// 주차장지번주소 나타내는 인덱스를 k01_short_Dist 변수에 대입
					}
				} else if (k01_max < k01_dist) {													// 최대값 변수보다 현재지점과의 거리가 더 크다면
					k01_max = k01_dist;																// 해당값을 최대값 변수에 대입
					if (k01_max == k01_dist) {														// 대입한 후
						k01_long_Dist = k01_field[6];												// 주차장지번주소 나타내는 인덱스를 k01_short_Dist 변수에 대입
					}
				}
			}
		}
		System.out.printf("우리 집과 가장 가까운 공영주차장 : %s", k01_short_Dist);					// 우리집과 가장 가까운 곳 : k01_short_Dist 출력
		System.out.printf(", 거리차이 : %f\n", k01_min);											// , 거리차이 : k01_min 출력 후 줄바꿈		
		System.out.printf("우리 집과 가장 먼 공영주차장 : %s", k01_long_Dist);						// 우리집 가장 먼 곳 : k01_short_Dist 출력
		System.out.printf(", 거리차이 : %f\n", k01_max);											// , 거리차이 : k01_max 출력 후 줄바꿈		
		k01_br.close();																				// BufferedReader 클래스 종료
	}
}
