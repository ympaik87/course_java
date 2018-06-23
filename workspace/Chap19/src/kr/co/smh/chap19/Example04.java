package kr.co.smh.chap19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Example04 {

	public static void main(String[] args) throws Exception{
		
		File file = new File("test1.txt");
		
		if(!file.exists()) {
			System.out.println("파일이 존재 하지 않습니다.");
			System.exit(1);
		}
		
		FileReader in = new FileReader(file);
		BufferedReader br = new BufferedReader(in);//보조 스트림을 만들 때는 반드시 주 스트림이 필요함
		
		int whileCount = 0;
		
		String readData = null;
		
		//한줄씩 읽어오다가(\n 개행문자를 만나기 전까지)
		// 파일의 끝에 도달해서 더 이상 읽어올 문자열이 없을 때까지 (null) 반복
		while((readData = br.readLine()) != null) {
			whileCount++;
			System.out.println(readData);
		}
		
		System.out.println("반복 횟수 : " + whileCount);
		
		
		br.close();	//보조스트림을 닫으면 주 스트림 까지 자동으로 닫힌다.
		
		
		
		
	}
	
}
