package kr.co.ymp.chap20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example01Ans {
	public static void main(String[] args) throws IOException {
		File logFile = new File("log.txt");
		
		if(!logFile.exists()) {
			logFile.createNewFile();
			System.out.println("파일 생성");
		}else {
			FileReader in = new FileReader(logFile);
			BufferedReader br = new BufferedReader(in);
			
			String logData = null;
			System.out.println("이전 내용");
			while((logData = br.readLine()) != null) {
				System.out.println(logData);
			}
			System.out.println("--------------");
			
		}
		
		Scanner scan = new Scanner(System.in);
		FileWriter out = new FileWriter(logFile);
		BufferedWriter bw = new BufferedWriter(out);
		String msg = "";
		do {
			System.out.print("입력>> ");
			msg = scan.nextLine();
			bw.write(msg+"\n");
		}while(!msg.equals("exit"));
		
		System.out.println("종료");
		bw.close();
		
	}
}
