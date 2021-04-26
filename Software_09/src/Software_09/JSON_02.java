package Software_09;

import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JSON_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 최종 완성될 JSONObject 선언
		JSONObject k01_jsonobject = new JSONObject();
		// 한명 성적의 JSON 정보 담을 Array 선언
		JSONArray k01_datasArray = new JSONArray();
		// 함수 처리
		k01_datasArray.add(oneRec("나연", 209901, 95, 100, 55));	// datasArray에 넣을 인자값1 추가
		k01_datasArray.add(oneRec("정연", 209902, 100, 85, 75));	// datasArray에 넣을 인자값2 추가
		k01_datasArray.add(oneRec("모모", 209903, 90, 75, 85));		// datasArray에 넣을 인자값3 추가
		k01_datasArray.add(oneRec("사나", 209904, 90, 85, 75));		// datasArray에 넣을 인자값4 추가
		k01_datasArray.add(oneRec("지효", 209905, 80, 75, 85));		// datasArray에 넣을 인자값5 추가
		k01_datasArray.add(oneRec("미나", 209906, 90, 85, 55));		// datasArray에 넣을 인자값6 추가
		k01_datasArray.add(oneRec("다연", 209907, 70, 75, 65));		// datasArray에 넣을 인자값7 추가
		k01_datasArray.add(oneRec("채영", 209908, 100, 75, 95));	// datasArray에 넣을 인자값8 추가
		k01_datasArray.add(oneRec("쯔위", 209909, 80, 65, 95));		// datasArray에 넣을 인자값9 추가
		
		try {
			FileWriter k01_file = new FileWriter("C:\\Users\\강세영\\Desktop\\test.json");		
			// 해당 파일경로에 파일 생성
			k01_file.write(k01_datasArray.toJSONString());			// datasArray에 입력된 파일 출력
			k01_file.flush();										// 현재 파일에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비움
			k01_file.close();										// FileWriter 클래스 종료
		} catch(IOException e) {									// IOException 발생하면
			e.printStackTrace();									// e. printStackTrace 출력
		}
		System.out.println("JSON 만든 거 : " + k01_datasArray);		// JSON 만든 거 :k01_datasArray 내용 출력 후 개행
	}
	// k01_datasArray에 들어갈 내용 매소드로 생성
	public static JSONObject oneRec(String k01_name, int k01_studentid, int k01_kor, int k01_eng, int k01_mat) {
		JSONObject k01_dataObject = new JSONObject();		// k01_dataObject 객체 생성
		k01_dataObject.put("name", k01_name);				// k01_dataObject에서 인자 k01_name에 "name" 넣기
		k01_dataObject.put("studentid", k01_studentid);		// k01_dataObject에서 인자 k01_studentid에 "studentid" 넣기
		
		JSONArray k01_score = new JSONArray();				// JSONArray 생성
		k01_score.add(k01_kor);								// k01_score 배열에 k01_kor 인자값 넣기
		k01_score.add(k01_eng);								// k01_score 배열에 k01_eng 인자값 넣기
		k01_score.add(k01_mat);								// k01_score 배열에 k01_mat 인자값 넣기
		k01_dataObject.put("score", k01_score);				// k01_dataObject에서 "k01_score" 넣기
		
		return k01_dataObject;								// 전체 인자값 모두 넣은 k01_dataObject값으로 리턴
	}
}