package javaStudy;

import java.util.Scanner;

import java.util.Random;


public class Study14 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("◆タイピングゲーム◆");
		System.out.println();
		System.out.println("これから出てくる文字を入力してください");
		System.out.println("入力したら実行ボタンを押してください");
		System.out.println("5回クリアするまでの時間を計測します");
		System.out.println("スタートするには実行ボタンを押してください");
	
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String[] theme = {"hokkaido","aomoriken","iwateken","miyagiken","akitaken","yamagataken","hukushimaken","ibarakiken","tochigiken","gummaken","saitamaken",
				"chibaken","toukyouto","kanagawaken","niigataken","toyamaken","ishikawaken","fukuiken","yamanashiken","naganoken","gifuken","shizuokaken","aichiken",
				"mieken","shigaken","kyotofu","osakafu","hyogoken","naraken","wakayamaken","tottoriken","shimaneken","okayamaken","hiroshimaken","yamaguchiken","tokushimaken",
				"kagawaken","ehimeken","kochiken","fukuokaken","sagaken","nagasakiken","kumamotoken","oitaken","miyazakiken","kagoshimaken","okinawaken"}; 
		
		String input = scan.nextLine();
		long start = System.currentTimeMillis();
		
		double total = 0;
		int count = 0;
		
		while(true) {
			int target = rand.nextInt(47);
			String targetTheme = theme[target];
			System.out.println("お題：" + targetTheme);
			
			Scanner scan2 = new Scanner(System.in);
			String answer = scan2.nextLine();
			
			int words = answer.length();
			total = total + words;
			
			if(answer.isEmpty()) {
				System.out.println("答えを入力してください");
			}else if(answer.equals(targetTheme)) {
				System.out.println("正解です。");
				count++;
			}else {
				System.out.println("不正解です。");
			}
			
			if(count == 5) {
				System.out.println("5回正解しました。");
				System.out.println("ゲームクリアです。");
				
				long end = System.currentTimeMillis();
				
				System.out.println("クリアまでにかかった時間は" + ((end - start)/1000) + "秒です。");
				System.out.println("入力した文字数は" + total + "文字です。");
				double average = ((end - start)/1000)/total;
				System.out.println("一文字あたりの入力時間は" + average + "秒です");
				break;
			}else {
				System.out.println("もう一度挑戦しましょう。");
			}
			
			
			
		}

	}

}
