package Software_09;

import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JSON_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �ϼ��� JSONObject ����
		JSONObject k01_jsonobject = new JSONObject();
		// �Ѹ� ������ JSON ���� ���� Array ����
		JSONArray k01_datasArray = new JSONArray();
		// �Լ� ó��
		k01_datasArray.add(oneRec("����", 209901, 95, 100, 55));	// datasArray�� ���� ���ڰ�1 �߰�
		k01_datasArray.add(oneRec("����", 209902, 100, 85, 75));	// datasArray�� ���� ���ڰ�2 �߰�
		k01_datasArray.add(oneRec("���", 209903, 90, 75, 85));		// datasArray�� ���� ���ڰ�3 �߰�
		k01_datasArray.add(oneRec("�糪", 209904, 90, 85, 75));		// datasArray�� ���� ���ڰ�4 �߰�
		k01_datasArray.add(oneRec("��ȿ", 209905, 80, 75, 85));		// datasArray�� ���� ���ڰ�5 �߰�
		k01_datasArray.add(oneRec("�̳�", 209906, 90, 85, 55));		// datasArray�� ���� ���ڰ�6 �߰�
		k01_datasArray.add(oneRec("�ٿ�", 209907, 70, 75, 65));		// datasArray�� ���� ���ڰ�7 �߰�
		k01_datasArray.add(oneRec("ä��", 209908, 100, 75, 95));	// datasArray�� ���� ���ڰ�8 �߰�
		k01_datasArray.add(oneRec("����", 209909, 80, 65, 95));		// datasArray�� ���� ���ڰ�9 �߰�
		
		try {
			FileWriter k01_file = new FileWriter("C:\\Users\\������\\Desktop\\test.json");		
			// �ش� ���ϰ�ο� ���� ����
			k01_file.write(k01_datasArray.toJSONString());			// datasArray�� �Էµ� ���� ���
			k01_file.flush();										// ���� ���Ͽ� ����Ǿ� �ִ� ������ Ŭ���̾�Ʈ�� �����ϰ� ���۸� ���
			k01_file.close();										// FileWriter Ŭ���� ����
		} catch(IOException e) {									// IOException �߻��ϸ�
			e.printStackTrace();									// e. printStackTrace ���
		}
		System.out.println("JSON ���� �� : " + k01_datasArray);		// JSON ���� �� :k01_datasArray ���� ��� �� ����
	}
	// k01_datasArray�� �� ���� �żҵ�� ����
	public static JSONObject oneRec(String k01_name, int k01_studentid, int k01_kor, int k01_eng, int k01_mat) {
		JSONObject k01_dataObject = new JSONObject();		// k01_dataObject ��ü ����
		k01_dataObject.put("name", k01_name);				// k01_dataObject���� ���� k01_name�� "name" �ֱ�
		k01_dataObject.put("studentid", k01_studentid);		// k01_dataObject���� ���� k01_studentid�� "studentid" �ֱ�
		
		JSONArray k01_score = new JSONArray();				// JSONArray ����
		k01_score.add(k01_kor);								// k01_score �迭�� k01_kor ���ڰ� �ֱ�
		k01_score.add(k01_eng);								// k01_score �迭�� k01_eng ���ڰ� �ֱ�
		k01_score.add(k01_mat);								// k01_score �迭�� k01_mat ���ڰ� �ֱ�
		k01_dataObject.put("score", k01_score);				// k01_dataObject���� "k01_score" �ֱ�
		
		return k01_dataObject;								// ��ü ���ڰ� ��� ���� k01_dataObject������ ����
	}
}