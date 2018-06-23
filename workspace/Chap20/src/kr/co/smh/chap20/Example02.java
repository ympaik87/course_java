package kr.co.smh.chap20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example02 {

	public static void main(String[] args) throws Exception {
		
		File originalFile = new File("img.jpg");
		
		if(originalFile.exists()) {
			System.out.println("������ ���� �մϴ�.");
		}
		
		//1) ���� ���Ͽ��� �����͸� �о�´�. --> FileInputStream
		FileInputStream in = new FileInputStream(originalFile);
		BufferedInputStream bis = new BufferedInputStream(in);
		
		// 1-1) ������ ������ ũ��� �߶� ��Ƴ��� ���� ���� �����
		byte [] buffer = new byte[4096];	//2�� n�� �� ��ŭ ����� �ִ°��� ����.
		
		int readCount = -1;	//���۷� �о byte[]�� ����
		
		//2) ���� ��� ���� �����
		File copyFile = new File("img_copy.jpg");
		copyFile.createNewFile();
		
		// 2-1) ���� ��� ���Ͽ� ��� �� FileOutputStream
		FileOutputStream out = new FileOutputStream(copyFile);
		BufferedOutputStream bos = new BufferedOutputStream(out);
		
		
		//readCount���� BufferdInputStream�� ���۸� �̿��� �о ���� ������ ���̰� ����.
		// -1�̸� EOF�� ������ ��
		while((readCount = bis.read(buffer)) != -1) {
			System.out.println("���� ���� : " + readCount);
			bos.write(buffer);
			
		}
		
		
		//outputstream �ݱ�
		bos.close();
		//inputstream �ݱ�
		bis.close();
		
		
	}
	
}
