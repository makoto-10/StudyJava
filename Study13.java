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
		
		while(true) {
			int input = scan.nextInt();
			String inputtext = hand[input];
			int enemy = rand.nextInt(3);
			String enemytext = hand[enemy];
			System.out.println("���Ȃ����o�����̂�" + inputtext + "�ł��B");	
			System.out.println("���肪�o�����̂�" + enemytext + "�ł��B");
			
			
			if(input > 2 || input < 0) {
				System.out.println("0�`2�̐����œ��͂��Ă��������B");
				System.out.println("������x���͂��Ă��������B");
			}else if(input == enemy) {
				System.out.println("�������ł��B");
				System.out.println("������x���킵�܂��傤�B");
			}else {
				if(input == 0 && enemy == 1 || input == 1 && enemy == 2 || input == 2 && enemy == 0) {
					System.out.println("���Ȃ��̏����ł��B");
					break;
				}else {
					System.out.println("���Ȃ��̕����ł��B");
					break;
				}
			}
		}
	}
}
