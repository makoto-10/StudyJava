package javaStudy;

import java.util.Scanner;

import java.util.Random;

public class Study10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner�̕W�����͐ݒ�
		Scanner scan = new Scanner(System.in);
		
		//��ʕ����\��
		System.out.println("�������ăQ�[�������܂�");
		System.out.println("0�`2�̍D���Ȑ�������͂��Ă�������");
		System.out.println();
		
		//�ϐ�num1�ɕW�����͂���(����)
		int num1 =scan.nextInt();
		System.out.println();
		
		//���͌��ʂ̕\��
		System.out.println("���Ȃ������͂����̂́u" + num1 + "�v�ł��B");
		System.out.println();
		
		//�����̐���
		Random rand = new Random();
		int num2 = rand.nextInt(3);
		//�����̕\��
		System.out.println("�������ꂽ�����́u" + num2 + "�v�ł�");
		
		System.out.println();
		
		//����
		if (num1 > 3 || num1 < -1 ) {
			System.out.println("0�`2�̐�������͂��Ă�������");
		}else if (num1 == num2) {
			System.out.println("�u������v�ł�");
		}else {
			System.out.println("�u�͂���v�ł�");
		}
		

	}

}
