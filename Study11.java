package javaStudy;

import java.util.Random;

import java.util.Scanner;


public class Study11 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("��High&Low�Q�[����");
		System.out.println();
		System.out.println("�`���[���`");
		System.out.println("�@A��B��2�̐����������_���ɐ��������B");
		System.out.println("�A��������鐔����A�EB�������1�`10�̒�����1�I�΂��B");
		System.out.println("�BA�̐������Ɋm�F�������ƁAB�̐�����\�z����B");
		System.out.println("�CA+B=11�ȏ�̗\�z�Ȃ�u1�v�A10�ȉ��̗\�z�Ȃ�u2�v���L������B");
		System.out.println("�D���s��AB�̐����y�ї\�z�̌��ʂ��\�������B");
		System.out.println("�E���ʂ��u������v�Ȃ珟���A�u�͂���v�Ȃ畉���B");
		System.out.println();
		
		Random rand1 = new Random();
		int num1 = rand1.nextInt(11);
		System.out.println("A�̐����F" + "�w" + num1 + "�x");
		Scanner scan = new Scanner(System.in);
		
		int num2;
		int num3;
		int num4;
		
		while (true) {
			num2 = scan.nextInt();
			
			Random rand2 = new Random();
			num3 = rand2.nextInt(11);
			
			if (num2 > 2 || num2 < 0 ) {
				System.out.println("1��2�̐����ŋL�����Ă�������");
				System.out.println("������x�L�����Ă�������");
			}else {
				break;
			}
		}
		
		num4 = num1 + num3;
		
		if (num4 >= 11 && num2 == 1) {
			System.out.println("B�̐����́w" + num3 + "�ł�");
			System.out.println("���v���ʂ́w" + num4 + "�x�ł�");
			System.out.println("���Ȃ����I�񂾂̂́w" + num2 + "�x�ł�");
			System.out.println("�w������x�ł��B");
		}else if (num4 <= 10 && num2 == 2) {
			System.out.println("B�̐����́w" + num3 + "�ł�");
			System.out.println("���v���ʂ́w" + num4 + "�x�ł�");
			System.out.println("���Ȃ����I�񂾂̂́w" + num2 + "�x�ł�");
			System.out.println("�w������x�ł��B");
		}else {
			System.out.println("B�̐����́w" + num3 + "�ł�");
			System.out.println("���v���ʂ́w" + num4 + "�x�ł�");
			System.out.println("���Ȃ����I�񂾂̂́w" + num2 + "�x�ł�");
			System.out.println("�w�͂���x�ł��B");
		}	
	}
}
