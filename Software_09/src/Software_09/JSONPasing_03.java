package Software_09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONPasing_03 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser k01_parser = new JSONParser();// JSONParser 객체 생성
		Object k01_obj = k01_parser.parse(new FileReader("C:\\Users\\강세영\\Desktop\\test.json"));
		// 해당 파일경로에 있는 파일 읽어서 파싱
		JSONArray k01_array = (JSONArray)k01_obj;
		// 파싱된 k01_obj를 k01_array 배열에 저장
		System.out.println("**************************");							// ********** 출력 후 개행
		for (int k01_i = 0; k01_i < k01_array.size(); k01_i++) {					// 배열 크기만큼 반복되는 동안
			JSONObject k01_result = (JSONObject) k01_array.get(k01_i);				// 배열에서 하나씩 추출한 값을 k01_result로 선언 
			System.out.println("이름 : " + k01_result.get("name"));					// 이름 : "name"값을 가져와서 출력
			System.out.println("학번 : " + k01_result.get("studentid"));			// 학번 : "studentid"값을 가져와서 출력
			JSONArray k01_score = (JSONArray) k01_result.get("score");				// "score" 입력되어 있는 값을 배열로 가져옴
			long k01_kor = (long)k01_score.get(0);									// 배열 중 첫 번째 값은 국어
			long k01_eng = (long)k01_score.get(1);									// 배열 중 두 번째 값은 영어
			long k01_mat = (long)k01_score.get(2);									// 배열 중 세 번째 값은 수학
			System.out.println("국어 : " + k01_kor);								// 국어 : 국어 점수 출력
			System.out.println("영어 : " + k01_eng);								// 영어 : 영어 점수 출력
			System.out.println("수학 : " + k01_mat);								// 수학 : 수학 점수 출력
			System.out.println("총점 : " + (k01_kor + k01_eng + k01_mat));			// 총점 : 세 과목의 합 출력
			System.out.println("평균 : " + (k01_kor + k01_eng + k01_mat) / 3.0);	// 평균 : 총점 / 3.0 출력
			System.out.println("**************************");						// ********** 출력 후 개행
		}
	}
}
