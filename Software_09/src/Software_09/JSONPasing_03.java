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
		JSONParser k01_parser = new JSONParser();// JSONParser ��ü ����
		Object k01_obj = k01_parser.parse(new FileReader("C:\\Users\\������\\Desktop\\test.json"));
		// �ش� ���ϰ�ο� �ִ� ���� �о �Ľ�
		JSONArray k01_array = (JSONArray)k01_obj;
		// �Ľ̵� k01_obj�� k01_array �迭�� ����
		System.out.println("**************************");							// ********** ��� �� ����
		for (int k01_i = 0; k01_i < k01_array.size(); k01_i++) {					// �迭 ũ�⸸ŭ �ݺ��Ǵ� ����
			JSONObject k01_result = (JSONObject) k01_array.get(k01_i);				// �迭���� �ϳ��� ������ ���� k01_result�� ���� 
			System.out.println("�̸� : " + k01_result.get("name"));					// �̸� : "name"���� �����ͼ� ���
			System.out.println("�й� : " + k01_result.get("studentid"));			// �й� : "studentid"���� �����ͼ� ���
			JSONArray k01_score = (JSONArray) k01_result.get("score");				// "score" �ԷµǾ� �ִ� ���� �迭�� ������
			long k01_kor = (long)k01_score.get(0);									// �迭 �� ù ��° ���� ����
			long k01_eng = (long)k01_score.get(1);									// �迭 �� �� ��° ���� ����
			long k01_mat = (long)k01_score.get(2);									// �迭 �� �� ��° ���� ����
			System.out.println("���� : " + k01_kor);								// ���� : ���� ���� ���
			System.out.println("���� : " + k01_eng);								// ���� : ���� ���� ���
			System.out.println("���� : " + k01_mat);								// ���� : ���� ���� ���
			System.out.println("���� : " + (k01_kor + k01_eng + k01_mat));			// ���� : �� ������ �� ���
			System.out.println("��� : " + (k01_kor + k01_eng + k01_mat) / 3.0);	// ��� : ���� / 3.0 ���
			System.out.println("**************************");						// ********** ��� �� ����
		}
	}
}
