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
		long start = System.currentTimeMillis();
		
		double total = 0;
		int count = 0;
		
		while(true) {
			int target = rand.nextInt(47);
			String targetTheme = theme[target];
			System.out.println("����F" + targetTheme);
			
			Scanner scan2 = new Scanner(System.in);
			String answer = scan2.nextLine();
			
			int words = answer.length();
			total = total + words;
			
			if(answer.isEmpty()) {
				System.out.println("��������͂��Ă�������");
			}else if(answer.equals(targetTheme)) {
				System.out.println("�����ł��B");
				count++;
			}else {
				System.out.println("�s�����ł��B");
			}
			
			if(count == 5) {
				System.out.println("5�񐳉����܂����B");
				System.out.println("�Q�[���N���A�ł��B");
				
				long end = System.currentTimeMillis();
				
				System.out.println("�N���A�܂łɂ����������Ԃ�" + ((end - start)/1000) + "�b�ł��B");
				System.out.println("���͂�����������" + total + "�����ł��B");
				double average = ((end - start)/1000)/total;
				System.out.println("�ꕶ��������̓��͎��Ԃ�" + average + "�b�ł�");
				break;
			}else {
				System.out.println("������x���킵�܂��傤�B");
			}
			
			
			
		}

	}

}
