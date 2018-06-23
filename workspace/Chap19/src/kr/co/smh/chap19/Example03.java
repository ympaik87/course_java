package kr.co.smh.chap19;

import java.io.File;
import java.io.FileWriter;

public class Example03 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("test2.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("파일 생성 성공!");
		}
		
		//문자열을 파일에 출력 하기 위해 FileWriter 스트림 개방
		FileWriter writer = new FileWriter(file);
		writer.write("안녕하세요" + "\n");
		writer.write("스트림..ㅠㅠ");
		
		//스트림 폐쇄
		writer.close();
		
		System.out.println("프로그램 종료~");
		
	}
	
}



