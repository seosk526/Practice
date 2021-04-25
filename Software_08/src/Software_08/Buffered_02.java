package Software_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_02 {

	public static void FileWrite() throws IOException {						// try catch Ȱ������ �ʾұ� ������ �żҵ忡 ����ó������ ���� 
		File k01_f = new File("C:\\Users\\seosk\\Desktop\\Mytest.txt");			// ���� ���� ��ġ ����
		BufferedWriter k01_bw = new BufferedWriter(new FileWriter(k01_f));		// BufferedWriter Ŭ���� ����ؼ� f���� ����
		k01_bw.write("�ȳ� ����");												// �ȳ� ���� �Է�
		k01_bw.newLine();														// �ٹٲ�
		k01_bw.write("hello ���");												// hello ��� �Է�
		k01_bw.newLine();														// �ٹٲ�
		k01_bw.close();															// BufferedWriter Ŭ���� ����
	}
	
	public static void FileRead() throws IOException {						// try catch Ȱ������ �ʾұ� ������ �żҵ忡 ����ó������ ���� 
		File k01_f = new File("C:\\Users\\seosk\\Desktop\\Mytest.txt");			// ���� ���� ��ġ ����
		BufferedReader k01_br = new BufferedReader(new FileReader(k01_f));		// BufferedReader Ŭ���� ����ؼ� f���� �б�
		String k01_readtxt;														// ������ ���� readtxt ����
		
		while ((k01_readtxt = k01_br.readLine()) != null) {						// br�� readtxt�� ������ �ƹ��͵� ���� �ʴٸ�
			System.out.printf("%s\n", k01_readtxt);								// readtxt ��� �� �ٹٲ�
		}
		k01_br.close();															// BufferedReader Ŭ���� ����
	}
		
	public static void main(String[] args) throws IOException {				// try catch Ȱ������ �ʾұ� ������ �żҵ忡 ����ó������ ���� 
		// TODO Auto-generated method stub
		FileWrite();															// FileWrite �żҵ� ����
		FileRead();																// FileRead �żҵ� ����
	}
}
