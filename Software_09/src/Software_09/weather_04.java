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

public class weather_04 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		String k01_seq = "";		// 48�ð� �� �� ��°����
		String k01_hour = "";		// ���׿��� 3�ð� ����
		String k01_day = "";		// 1��° ��(0: ����, 1: ����, 2: ��)
		String k01_temp = "";		// ���� �ð��µ�
		String k01_tmx = "";		// �ְ� �µ�
		String k01_tmn = "";		// ���� �µ�
		String k01_sky = "";		// �ϴ� �����ڵ�(1: ����, 2: ��������, 3: ��������, 4: �帲)
		String k01_pty = "";		// ���� �����ڵ�(0: ����, 1: ��, 2: ��/��, 3:��/��, 4: ��)
		String k01_wfKor = "";		// ���� �ѱ���
		String k01_wfEn = "";		// ���� ����
		String k01_pop = "";		// ���� Ȯ��%
		String k01_r12 = "";		// 12�ð� ���� ������
		String k01_s12 = "";		// 12�ð� ���� ������
		String k01_ws = "";			// ǳ��(m/s)
		String k01_wd = "";			// ǳ�� (0~7: ��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�)
		String k01_wdKor = "";		// ǳ�� �ѱ���
		String k01_wdEn = "";		// ǳ�� ����
		String k01_reh = "";		// ���� %
		String k01_r06 = "";		// 6�ð� ���� ������
		String k01_s06 = "";		// 6�ð� ���� ������		
		
		DocumentBuilder k01_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml ������ ó�� PC�ȿ� �־ ��ü��θ� ����, xml �Ľ�ó�� ����
		Document k01_doc = k01_docBuilder.parse(new File("C:\\Users\\������\\Desktop\\weather.xml"));
		// root �±׸� ������ ���⵵ ������ ������ ������ ����
		Element k01_root = k01_doc.getDocumentElement();		
		// �̸����� �ڽ� ��� ã��
		NodeList tag_001 = k01_doc.getElementsByTagName("data");
		for (int i = 0; i < tag_001.getLength(); i++) {
			
			Element elmt = (Element)tag_001.item(i);			
			k01_seq = tag_001.item(i).getAttributes().getNamedItem("seq").getNodeValue();
			k01_hour = elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			k01_day = elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			k01_temp = elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			k01_tmx = elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			k01_tmn = elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			k01_sky = elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			k01_pty = elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			k01_wfKor = elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			k01_wfEn = elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			k01_pop = elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			k01_r12 = elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			k01_s12 = elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			k01_ws = elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			k01_wd = elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			k01_wdKor = elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			k01_wdEn = elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			k01_reh = elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			k01_r06 = elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			k01_s06 = elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();		
			System.out.printf("seq : %s\n", k01_seq);
			System.out.printf("hour : %s\n", k01_hour);
			System.out.printf("day : %s\n", k01_day);
			System.out.printf("temp : %s\n", k01_temp);
			System.out.printf("tmx : %s\n", k01_tmx);
			System.out.printf("tmn : %s\n", k01_tmn);
			System.out.printf("sky : %s\n", k01_sky);
			System.out.printf("pty : %s\n", k01_pty);
			System.out.printf("wfKor : %s\n", k01_wfKor);
			System.out.printf("wfEn : %s\n", k01_wfEn);
			System.out.printf("pop : %s\n", k01_pop);
			System.out.printf("r12 : %s\n", k01_r12);
			System.out.printf("s12 : %s\n", k01_s12);
			System.out.printf("ws : %s\n", k01_ws);
			System.out.printf("wd : %s\n", k01_wd);
			System.out.printf("wdKor : %s\n", k01_wdKor);
			System.out.printf("wdEn : %s\n", k01_wdEn);
			System.out.printf("reh : %s\n", k01_reh);
			System.out.printf("r06 : %s\n", k01_r06);
			System.out.printf("s06 : %s\n", k01_s06);
			System.out.printf("******************\n");	
		}		
	}
}
