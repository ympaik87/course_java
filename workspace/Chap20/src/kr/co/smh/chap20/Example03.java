package kr.co.smh.chap20;

public class Example03 {

	public static void main(String[] args) {
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("[대문자] " + ch);
		}
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println("[소문자] " + ch);
		}
		
		for(char ch = 'ㄱ'; ch <= 'ㅎ'; ch++) {
			System.out.println("[한   글] " + ch);
		}
		
	}
	
}
