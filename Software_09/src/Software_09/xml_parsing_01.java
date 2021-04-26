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
		// �Ľ��� ���� �غ�
		DocumentBuilder k01_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml ������ ó�� PC�ȿ� �־ ��ü��θ� ����, xml �Ľ�ó�� ����
		Document k01_doc = k01_docBuilder.parse(new File("C:\\Users\\������\\Desktop\\score.xml"));
		// root �±׸� ������ ���⵵ ������ ������ ������ ����
		Element k01_root = k01_doc.getDocumentElement();		
		// �̸����� �ڽ� ��� ã��
		NodeList k01_tag_name = k01_doc.getElementsByTagName("name");				// name�̶�� �±׸����� �ڽĵ� ã��			
		NodeList k01_tag_studentid = k01_doc.getElementsByTagName("studentid");		// studentid�̶�� �±׸����� �ڽĵ� ã�� 
		NodeList k01_tag_kor = k01_doc.getElementsByTagName("kor");					// kor�̶�� �±׸����� �ڽĵ� ã�� 
		NodeList k01_tag_eng = k01_doc.getElementsByTagName("eng");					// eng�̶�� �±׸����� �ڽĵ� ã�� 
		NodeList k01_tag_mat = k01_doc.getElementsByTagName("mat");					// mat�̶�� �±׸����� �ڽĵ� ã�� 
		System.out.printf("******************\n");									// *****��� �� ����
		for (int k01_i = 0; k01_i < k01_tag_name.getLength(); k01_i++) {
			System.out.printf("�̸� : %s\n", k01_tag_name.item(k01_i).getFirstChild().getNodeValue());			// �̸� : tag_name�� ��庯�� ��� �� ����
			System.out.printf("�й� : %s\n", k01_tag_studentid.item(k01_i).getFirstChild().getNodeValue());		// �й� : tag_studentid�� ��庯�� ��� �� ����
			System.out.printf("���� : %s\n", k01_tag_kor.item(k01_i).getFirstChild().getNodeValue());			// ���� : tag_kor�� ��庯�� ��� �� ����
			System.out.printf("���� : %s\n", k01_tag_eng.item(k01_i).getFirstChild().getNodeValue());			// ���� : tag_eng�� ��庯�� ��� �� ����
			System.out.printf("���� : %s\n", k01_tag_mat.item(k01_i).getFirstChild().getNodeValue());			// ���� : tag_mat�� ��庯�� ��� �� ����
			System.out.printf("******************\n");															// *****��� �� ����
		}
	}
}