package kr.co.smh.chap19;

import java.io.File;
import java.io.FileWriter;

public class Example03 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("test2.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("���� ���� ����!");
		}
		
		//���ڿ��� ���Ͽ� ��� �ϱ� ���� FileWriter ��Ʈ�� ����
		FileWriter writer = new FileWriter(file);
		writer.write("�ȳ��ϼ���" + "\n");
		writer.write("��Ʈ��..�Ф�");
		
		//��Ʈ�� ���
		writer.close();
		
		System.out.println("���α׷� ����~");
		
	}
	
}



