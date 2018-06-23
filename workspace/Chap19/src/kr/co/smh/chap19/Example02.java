package kr.co.smh.chap19;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example02 {

	public static void main(String[] args) {

		// File 클래스 -> 자바에서 파일을 다루기 위한 여러가지 기능들을 제공한다.
		// exists() : 파일의 존재 여부( true : 존재, false : 존재 하지 않음 )
		// mkdir() : 폴더 만들기
		// isDirectory() : 해당 파일이 폴더인지 아닌지 판별( true : 폴더, false : 일반 파일 )
		// createNewFile() : 파일 생성하기 (IOException 예외처리 필요)

		File file = new File("test1.txt"); // 생성자 매개변수에 파일의 경로가 들어간다.

		if (!file.exists()) {
			System.out.println("파일이 없습니다.");
			System.exit(1); // 프로그램 종료
		}

		System.out.println("test1.txt 파일이 존재합니다.");

		// FileReader를 이용해 파일로부터 데이터( 파일에 기록된 "문자열" )을 읽어 온다.
		FileReader reader = null;
		try {
			reader = new FileReader(file); // FileReader 스트림 개방
			
			int readData = -1;
			while((readData = reader.read()) != -1) {
				char readChar = (char)readData;
				System.out.print(readChar);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			// FileReader 스트림 폐쇄 (필수).. 매우 중요
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

	}

}
