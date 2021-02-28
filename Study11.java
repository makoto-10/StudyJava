package javaStudy;

import java.util.Random;

import java.util.Scanner;


public class Study11 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("◆High&Lowゲーム◆");
		System.out.println();
		System.out.println("～ルール～");
		System.out.println("①AとBの2つの数字がランダムに生成される。");
		System.out.println("②生成される数字はA・Bいずれも1～10の中から1つ選ばれる。");
		System.out.println("③Aの数字を先に確認したあと、Bの数字を予想する。");
		System.out.println("④A+B=11以上の予想なら「1」、10以下の予想なら「2」を記入する。");
		System.out.println("⑤実行後、Bの数字及び予想の結果が表示される。");
		System.out.println("⑥結果が「あたり」なら勝ち、「はずれ」なら負け。");
		System.out.println();
		
		Random rand1 = new Random();
		int num1 = rand1.nextInt(11);
		System.out.println("Aの数字：" + "『" + num1 + "』");
		Scanner scan = new Scanner(System.in);
		
		int num2;
		int num3;
		int num4;
		
		while (true) {
			num2 = scan.nextInt();
			
			Random rand2 = new Random();
			num3 = rand2.nextInt(11);
			
			if (num2 > 2 || num2 < 0 ) {
				System.out.println("1か2の数字で記入してください");
				System.out.println("もう一度記入してください");
			}else {
				break;
			}
		}
		
		num4 = num1 + num3;
		
		if (num4 >= 11 && num2 == 1) {
			System.out.println("Bの数字は『" + num3 + "です");
			System.out.println("合計結果は『" + num4 + "』です");
			System.out.println("あなたが選んだのは『" + num2 + "』です");
			System.out.println("『あたり』です。");
		}else if (num4 <= 10 && num2 == 2) {
			System.out.println("Bの数字は『" + num3 + "です");
			System.out.println("合計結果は『" + num4 + "』です");
			System.out.println("あなたが選んだのは『" + num2 + "』です");
			System.out.println("『あたり』です。");
		}else {
			System.out.println("Bの数字は『" + num3 + "です");
			System.out.println("合計結果は『" + num4 + "』です");
			System.out.println("あなたが選んだのは『" + num2 + "』です");
			System.out.println("『はずれ』です。");
		}	
	}
}
