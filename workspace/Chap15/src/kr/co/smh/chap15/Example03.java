package kr.co.smh.chap15;

import java.util.InputMismatchException;
import java.util.Scanner;

import kr.co.smh.chap15.demo.DemoA;

public class Example03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int input1 = 0;
		int input2 = 0;

		try {
			System.out.print("input1 >> ");
			input1 = scan.nextInt();
			scan.nextLine();

			System.out.print("input2 >> ");
			input2 = scan.nextInt();
			scan.nextLine();

			System.out.println("³ª´°¼À : " + (input1 / input2));
			
			DemoA demoA = null;
			demoA.foo();

		} catch (InputMismatchException e) {
			System.out.println("Àß¸øµÈ ÇüÅÂÀÇ ÀÔ·Â ¹ß»ý : " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("³ª´°¼À Àß¸øµÊ");
		} catch (Exception e) {
			System.out.println("¿À·ù ¹ß»ý!");
		}

		// System.out.println("µ¡¼À : " + (input1 + input2));
		// System.out.println("»¬¼À : " + (input1 - input2));
		// System.out.println("°ö¼À : " + (input1 * input2));
		// try{
		// System.out.println("³ª´°¼À : " + (input1 / input2));
		// }catch(ArithmeticException e) {
		// System.out.println("³ª´°¼À Àß¸øµÊ");
		// }

	}

}
