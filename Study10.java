package javaStudy;

import java.util.Scanner;

import java.util.Random;

public class Study10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scannerの標準入力設定
		Scanner scan = new Scanner(System.in);
		
		//画面文字表示
		System.out.println("数字当てゲームをします");
		System.out.println("0～2の好きな数字を入力してください");
		System.out.println();
		
		//変数num1に標準入力を代入(整数)
		int num1 =scan.nextInt();
		System.out.println();
		
		//入力結果の表示
		System.out.println("あなたが入力したのは「" + num1 + "」です。");
		System.out.println();
		
		//乱数の生成
		Random rand = new Random();
		int num2 = rand.nextInt(3);
		//乱数の表示
		System.out.println("生成された数字は「" + num2 + "」です");
		
		System.out.println();
		
		//判定
		if (num1 > 3 || num1 < -1 ) {
			System.out.println("0～2の数字を入力してください");
		}else if (num1 == num2) {
			System.out.println("「あたり」です");
		}else {
			System.out.println("「はずれ」です");
		}
		

	}

}
