package javaStudy;

import java.util.Scanner;

import java.util.Random;

public class Study12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand1 = new Random();
		int num1 = 1;
		
		System.out.println("おみくじを引きます。");
		System.out.println("実行キーを押してください。");
		
		while(true) {
			String[] array = {"大吉","中吉","小吉","吉","凶"};
			String text = array[rand1.nextInt(4)];
			String text2 = "大吉";	
			
			System.out.println();
			
			String input = scan.nextLine();
			
			System.out.println("あなたが引いたのは" + text + "です。");
			
			num1 += 1;
			
			if(text != text2) {
				System.out.println("大吉が出るまで引いてください");
				System.out.println("もう一度引いてください。");
			}else {
				System.out.println("大吉が出るまで" + num1 + "回引きました。");
				break;
			}
			
		}

	}

}
