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
		String k01_seq = "";		// 48시간 중 몇 번째인지
		String k01_hour = "";		// 동네예보 3시간 단위
		String k01_day = "";		// 1번째 날(0: 오늘, 1: 내일, 2: 모레)
		String k01_temp = "";		// 현재 시간온도
		String k01_tmx = "";		// 최고 온도
		String k01_tmn = "";		// 최저 온도
		String k01_sky = "";		// 하늘 상태코드(1: 맑음, 2: 구름조금, 3: 구름많음, 4: 흐림)
		String k01_pty = "";		// 강수 상태코드(0: 없음, 1: 비, 2: 비/눈, 3:눈/비, 4: 눈)
		String k01_wfKor = "";		// 날씨 한국어
		String k01_wfEn = "";		// 날씨 영어
		String k01_pop = "";		// 강수 확률%
		String k01_r12 = "";		// 12시간 예상 강수량
		String k01_s12 = "";		// 12시간 예상 적설량
		String k01_ws = "";			// 풍속(m/s)
		String k01_wd = "";			// 풍향 (0~7: 북, 북동, 동, 남동, 남, 남서, 서, 북서)
		String k01_wdKor = "";		// 풍향 한국어
		String k01_wdEn = "";		// 풍향 영어
		String k01_reh = "";		// 습도 %
		String k01_r06 = "";		// 6시간 예상 강수량
		String k01_s06 = "";		// 6시간 예상 적설량		
		
		DocumentBuilder k01_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml 파일이 처리 PC안에 있어서 전체경로를 지정, xml 파싱처리 시작
		Document k01_doc = k01_docBuilder.parse(new File("C:\\Users\\강세영\\Desktop\\weather.xml"));
		// root 태그를 가지고 오기도 하지만 지금은 쓰이지 않음
		Element k01_root = k01_doc.getDocumentElement();		
		// 이름으로 자식 노드 찾기
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
