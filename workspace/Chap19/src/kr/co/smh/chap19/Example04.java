package kr.co.smh.chap19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Example04 {

	public static void main(String[] args) throws Exception{
		
		File file = new File("test1.txt");
		
		if(!file.exists()) {
			System.out.println("������ ���� ���� �ʽ��ϴ�.");
			System.exit(1);
		}
		
		FileReader in = new FileReader(file);
		BufferedReader br = new BufferedReader(in);//���� ��Ʈ���� ���� ���� �ݵ�� �� ��Ʈ���� �ʿ���
		
		int whileCount = 0;
		
		String readData = null;
		
		//���پ� �о���ٰ�(\n ���๮�ڸ� ������ ������)
		// ������ ���� �����ؼ� �� �̻� �о�� ���ڿ��� ���� ������ (null) �ݺ�
		while((readData = br.readLine()) != null) {
			whileCount++;
			System.out.println(readData);
		}
		
		System.out.println("�ݺ� Ƚ�� : " + whileCount);
		
		
		br.close();	//������Ʈ���� ������ �� ��Ʈ�� ���� �ڵ����� ������.
		
		
		
		
	}
	
}
