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
		
		int count = 1;
		
		while(true) {
			String[] hand = {"パー","グー","チョキ"};
			String hands = hand[rand.nextInt(2)];
			String hands2 = hand[rand.nextInt(2)];
			int input = scan.nextInt();
			
			count ++;
			
			if(hands2 == hands) {
				System.out.println("あなたの手は" + hands + "です");
				System.out.println();
				System.out.println("相手の手は" + hands2 + "です");
				System.out.println();
				System.out.println("結果は『あいこ』です");
				System.out.println();
				System.out.println("もう一度挑戦してください");
			}
			
			
		}
	}

}
