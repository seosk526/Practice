package Software_09;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class xml_parsing_01 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		// 파싱을 위한 준비
		DocumentBuilder k01_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml 파일이 처리 PC안에 있어서 전체경로를 지정, xml 파싱처리 시작
		Document k01_doc = k01_docBuilder.parse(new File("C:\\Users\\강세영\\Desktop\\score.xml"));
		// root 태그를 가지고 오기도 하지만 지금은 쓰이지 않음
		Element k01_root = k01_doc.getDocumentElement();		
		// 이름으로 자식 노드 찾기
		NodeList k01_tag_name = k01_doc.getElementsByTagName("name");				// name이라는 태그명으로 자식들 찾기			
		NodeList k01_tag_studentid = k01_doc.getElementsByTagName("studentid");		// studentid이라는 태그명으로 자식들 찾기 
		NodeList k01_tag_kor = k01_doc.getElementsByTagName("kor");					// kor이라는 태그명으로 자식들 찾기 
		NodeList k01_tag_eng = k01_doc.getElementsByTagName("eng");					// eng이라는 태그명으로 자식들 찾기 
		NodeList k01_tag_mat = k01_doc.getElementsByTagName("mat");					// mat이라는 태그명으로 자식들 찾기 
		System.out.printf("******************\n");									// *****출력 후 개행
		for (int k01_i = 0; k01_i < k01_tag_name.getLength(); k01_i++) {
			System.out.printf("이름 : %s\n", k01_tag_name.item(k01_i).getFirstChild().getNodeValue());			// 이름 : tag_name의 노드변수 출력 후 개행
			System.out.printf("학번 : %s\n", k01_tag_studentid.item(k01_i).getFirstChild().getNodeValue());		// 학번 : tag_studentid의 노드변수 출력 후 개행
			System.out.printf("국어 : %s\n", k01_tag_kor.item(k01_i).getFirstChild().getNodeValue());			// 국어 : tag_kor의 노드변수 출력 후 개행
			System.out.printf("영어 : %s\n", k01_tag_eng.item(k01_i).getFirstChild().getNodeValue());			// 영어 : tag_eng의 노드변수 출력 후 개행
			System.out.printf("수학 : %s\n", k01_tag_mat.item(k01_i).getFirstChild().getNodeValue());			// 수학 : tag_mat의 노드변수 출력 후 개행
			System.out.printf("******************\n");															// *****출력 후 개행
		}
	}
}