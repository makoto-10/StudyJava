package javaStudy;

import java.util.Random;

import java.util.Scanner;

public class Study13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("じゃんけんゲームをします。");
		System.out.println("下記から数字を選んで入力＆実行をしてください。");
		System.out.println();
		System.out.println("0.パー　1.グー　2.チョキ");
		System.out.println();
		System.out.println("どちらかが3回勝つまで行います。");
		System.out.println("3回連続で勝ったらおみくじを引けます。");
		
		String[] hand = {"パー","グー","チョキ"};
		
		while(true) {
			int input = scan.nextInt();
			String inputtext = hand[input];
			int enemy = rand.nextInt(3);
			String enemytext = hand[enemy];
			System.out.println("あなたが出したのは" + inputtext + "です。");	
			System.out.println("相手が出したのは" + enemytext + "です。");
			
			
			if(input > 2 || input < 0) {
				System.out.println("0～2の整数で入力してください。");
				System.out.println("もう一度入力してください。");
			}else if(input == enemy) {
				System.out.println("あいこです。");
				System.out.println("もう一度挑戦しましょう。");
			}else {
				if(input == 0 && enemy == 1 || input == 1 && enemy == 2 || input == 2 && enemy == 0) {
					System.out.println("あなたの勝ちです。");
					break;
				}else {
					System.out.println("あなたの負けです。");
					break;
				}
			}
		}
	}
}
