package javaStudy;

import java.util.Scanner;

import java.util.Random;

public class Study14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���^�C�s���O�Q�[����");
		System.out.println();
		System.out.println("���ꂩ��o�Ă��镶������͂��Ă�������");
		System.out.println("���͂�������s�{�^���������Ă�������");
		System.out.println("5��N���A����܂ł̎��Ԃ��v�����܂�");
		System.out.println("�X�^�[�g����ɂ͎��s�{�^���������Ă�������");
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String[] theme = {"hokkaido","aomoriken","iwateken","miyagiken","akitaken","yamagataken","hukushimaken","ibarakiken","tochigiken","gummaken","saitamaken",
				"chibaken","toukyouto","kanagawaken","niigataken","toyamaken","ishikawaken","fukuiken","yamanashiken","naganoken","gifuken","shizuokaken","aichiken",
				"mieken","shigaken","kyotofu","osakafu","hyogoken","naraken","wakayamaken","tottoriken","shimaneken","okayamaken","hiroshimaken","yamaguchiken","tokushimaken",
				"kagawaken","ehimeken","kochiken","fukuokaken","sagaken","nagasakiken","kumamotoken","oitaken","miyazakiken","kagoshimaken","okinawaken"}; 
		
		String input = scan.nextLine();
		int count = 0;
		
		while(true) {
			int target = rand.nextInt(47);
			String targetTheme = theme[target];
			System.out.println("����F" + targetTheme);
			
			Scanner scan2 = new Scanner(System.in);
			String answer = scan2.nextLine();
			
			if(count == 5) {
				System.out.println("5�񐳉����܂����B");
				System.out.println("�Q�[���N���A�ł��B");
				break;
			}else {
				if(answer.isEmpty()) {
					System.out.println("��������͂��Ă�������");
				}else if(answer.equals(targetTheme)) {
					System.out.println("�����ł��B������x���킵�܂��傤");
					count++;
				}else {
					System.out.println("�s�����ł��B������x���킵�܂��傤�B");
				}
			}
			
		}

	}

}
