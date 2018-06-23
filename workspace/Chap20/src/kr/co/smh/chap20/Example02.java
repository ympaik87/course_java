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
			System.out.println("파일이 존재 합니다.");
		}
		
		//1) 원본 파일에서 데이터를 읽어온다. --> FileInputStream
		FileInputStream in = new FileInputStream(originalFile);
		BufferedInputStream bis = new BufferedInputStream(in);
		
		// 1-1) 파일을 일정한 크기로 잘라서 담아내기 위한 버퍼 만들기
		byte [] buffer = new byte[4096];	//2의 n승 개 만큼 만들어 주는것이 좋다.
		
		int readCount = -1;	//버퍼로 읽어낸 byte[]의 길이
		
		//2) 복사 대상 파일 만들기
		File copyFile = new File("img_copy.jpg");
		copyFile.createNewFile();
		
		// 2-1) 복사 대상 파일에 출력 할 FileOutputStream
		FileOutputStream out = new FileOutputStream(copyFile);
		BufferedOutputStream bos = new BufferedOutputStream(out);
		
		
		//readCount에는 BufferdInputStream이 버퍼를 이용해 읽어낸 파일 조각의 길이가 들어간다.
		// -1이면 EOF에 도달한 것
		while((readCount = bis.read(buffer)) != -1) {
			System.out.println("읽은 갯수 : " + readCount);
			bos.write(buffer);
			
		}
		
		
		//outputstream 닫기
		bos.close();
		//inputstream 닫기
		bis.close();
		
		
	}
	
}
