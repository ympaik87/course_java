package kr.co.smh.chap19;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example02 {

	public static void main(String[] args) {

		// File Ŭ���� -> �ڹٿ��� ������ �ٷ�� ���� �������� ��ɵ��� �����Ѵ�.
		// exists() : ������ ���� ����( true : ����, false : ���� ���� ���� )
		// mkdir() : ���� �����
		// isDirectory() : �ش� ������ �������� �ƴ��� �Ǻ�( true : ����, false : �Ϲ� ���� )
		// createNewFile() : ���� �����ϱ� (IOException ����ó�� �ʿ�)

		File file = new File("test1.txt"); // ������ �Ű������� ������ ��ΰ� ����.

		if (!file.exists()) {
			System.out.println("������ �����ϴ�.");
			System.exit(1); // ���α׷� ����
		}

		System.out.println("test1.txt ������ �����մϴ�.");

		// FileReader�� �̿��� ���Ϸκ��� ������( ���Ͽ� ��ϵ� "���ڿ�" )�� �о� �´�.
		FileReader reader = null;
		try {
			reader = new FileReader(file); // FileReader ��Ʈ�� ����
			
			int readData = -1;
			while((readData = reader.read()) != -1) {
				char readChar = (char)readData;
				System.out.print(readChar);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			// FileReader ��Ʈ�� ��� (�ʼ�).. �ſ� �߿�
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

	}

}
