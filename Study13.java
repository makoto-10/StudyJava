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
		
		int count = 1;
		
		while(true) {
			String[] hand = {"�p�[","�O�[","�`���L"};
			String hands = hand[rand.nextInt(2)];
			String hands2 = hand[rand.nextInt(2)];
			int input = scan.nextInt();
			
			count ++;
			
			if(hands2 == hands) {
				System.out.println("���Ȃ��̎��" + hands + "�ł�");
				System.out.println();
				System.out.println("����̎��" + hands2 + "�ł�");
				System.out.println();
				System.out.println("���ʂ́w�������x�ł�");
				System.out.println();
				System.out.println("������x���킵�Ă�������");
			}
			
			
		}
	}

}
