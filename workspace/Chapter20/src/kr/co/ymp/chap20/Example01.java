package kr.co.ymp.chap20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		String file = "log.txt";
	    Scanner scan = new Scanner(System.in);
	    scan.useDelimiter("\\n");
	    System.out.println("Enter exit to terminate");
	    try (PrintWriter fw = new PrintWriter(new File(file))) {
	        String line = null;
	        while ((line = scan.nextLine()) != null) {
	            if (line.trim().equalsIgnoreCase("exit")) {
	                System.out.println("Bye");
	                System.exit(0);
	            }else {
	            	fw.write(line);
	            }
	        }
	        fw.close();
	    } catch (FileNotFoundException ex) {
	        System.out.println(ex);
	    }
		
	}
}
