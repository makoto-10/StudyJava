package javaStudy;

import java.util.Random;

import java.util.Scanner;

public class Study13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("����񂯂�Q�[�������܂��B");
		System.out.println("���L���琔����I��œ��́����s�����Ă��������B");
		System.out.println();
		System.out.println("0.�p�[�@1.�O�[�@2.�`���L");
		System.out.println();
		System.out.println("�ǂ��炩��3�񏟂܂ōs���܂��B");
		System.out.println("3��A���ŏ������炨�݂����������܂��B");
		
		String[] hand = {"�p�[","�O�[","�`���L"};
		
		int input = 0;
		int enemy;
		int count = 0;
		
		while(true) {
			input = scan.nextInt();
			
			if(input == 0 || input == 1 || input == 2) {
				String inputtext = hand[input];
				enemy = rand.nextInt(3);
				String enemytext = hand[enemy];
				
				System.out.println("���Ȃ����o�����̂�" + inputtext + "�ł��B");	
				System.out.println("���肪�o�����̂�" + enemytext + "�ł��B");
				
				if(input == enemy) {
					count = 0;
					System.out.println("�������ł��B");
					System.out.println("������x���킵�܂��傤�B");
				}else {
					if(input == 0 && enemy == 1 || input == 1 && enemy == 2 || input == 2 && enemy == 0) {
						count++;
						System.out.println("���Ȃ��̏����ł��B");
						if(count == 3) {
							System.out.println("3��A���ŏ������܂����B");
							System.out.println("���݂����������܂��B");
							System.out.println("���s�{�^���������Ă��������B");
							
							Scanner scan2 = new Scanner(System.in);
							
							String input2 = scan2.nextLine();
							String[] kuji = {"��g","���g","���g","�g","��",};
							String omikuji = kuji[rand.nextInt(4)];
							System.out.println("���Ȃ����������̂́w" + omikuji + "�x�ł��B");
							break;
						}else {
						System.out.println("������x���킵�܂��傤�B");
						}
					}else {
						count = 0;
						System.out.println("���Ȃ��̕����ł��B");
						System.out.println("������x���킵�܂��傤�B");
					}
				}
			}else {
				System.out.println("0�`2�̐�������͂��Ă�������");
			}
		}
	}
}
