package kr.co.ymp.chap10;

import kr.co.ymp.chap10.example.Writer;

import kr.co.ymp.chap10.example.Pencil;

public class Example01 {
	public static void main(String[] args) {
		
		Pencil pencil = new Pencil(100);
		pencil.write("hihi");
		pencil.refill();
		
		// upcasting
		Writer writer = new Pencil(1000);
		writer.write("Hello");
		writer.refill();
		
		pencil.foo();
		writer.foo();
		
	}
}
