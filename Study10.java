package javaStudy;

import java.util.Scanner;

import java.util.Random;

public class Study10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner‚Ì•W€“ü—Íİ’è
		Scanner s = new Scanner(System.in);
		
		//‰æ–Ê•¶š•\¦
		System.out.println("”š“–‚ÄƒQ[ƒ€‚ğ‚µ‚Ü‚·");
		System.out.println("0`2‚ÌD‚«‚È”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		System.out.println();
		
		//•Ï”number‚É•W€“ü—Í‚ğ‘ã“ü(®”)
		int num1 =s.nextInt();
		
		System.out.println();
		
		//“ü—ÍŒ‹‰Ê‚Ì•\¦
		System.out.println("‚ ‚È‚½‚ª“ü—Í‚µ‚½‚Ì‚Í" + num1 + "‚Å‚·B");
		System.out.println();
		
		//—”‚Ì¶¬
		Random rand = new Random();
		int num2 = rand.nextInt(2);
		//—”‚Ì•\¦
		System.out.println("¶¬‚³‚ê‚½”š‚Í" + num2 + "‚Å‚·");
		
		System.out.println();
		
		//”»’è
		if (num1 > 3 || num1 < -1 ) {
			System.out.println("0`2‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		}else if (num1 == num2) {
			System.out.println("‚ ‚½‚è");
		}else {
			System.out.println("‚Í‚¸‚ê");
		}
		

	}

}
