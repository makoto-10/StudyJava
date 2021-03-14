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
		
		int input = 0;
		int enemy;
		int count = 0;
		
		while(true) {
			input = scan.nextInt();
			
			if(input == 0 || input == 1 || input == 2) {
				String inputtext = hand[input];
				enemy = rand.nextInt(3);
				String enemytext = hand[enemy];
				
				System.out.println("あなたが出したのは" + inputtext + "です。");	
				System.out.println("相手が出したのは" + enemytext + "です。");
				
				if(input == enemy) {
					count = 0;
					System.out.println("あいこです。");
					System.out.println("もう一度挑戦しましょう。");
				}else {
					if(input == 0 && enemy == 1 || input == 1 && enemy == 2 || input == 2 && enemy == 0) {
						count++;
						System.out.println("あなたの勝ちです。");
						if(count == 3) {
							System.out.println("3回連続で勝利しました。");
							System.out.println("おみくじを引けます。");
							System.out.println("実行ボタンを押してください。");
							
							Scanner scan2 = new Scanner(System.in);
							
							String input2 = scan2.nextLine();
							String[] kuji = {"大吉","中吉","小吉","吉","凶",};
							String omikuji = kuji[rand.nextInt(4)];
							System.out.println("あなたが引いたのは『" + omikuji + "』です。");
							break;
						}else {
						System.out.println("もう一度挑戦しましょう。");
						}
					}else {
						count = 0;
						System.out.println("あなたの負けです。");
						System.out.println("もう一度挑戦しましょう。");
					}
				}
			}else {
				System.out.println("0～2の整数を入力してください");
			}
		}
	}
}
