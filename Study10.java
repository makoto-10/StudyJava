package javaStudy;

import java.util.Scanner;

import java.util.Random;

public class Study10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner�̕W�����͐ݒ�
		Scanner s = new Scanner(System.in);
		
		//��ʕ����\��
		System.out.println("�������ăQ�[�������܂�");
		System.out.println("0�`2�̍D���Ȑ�������͂��Ă�������");
		System.out.println();
		
		//�ϐ�number�ɕW�����͂���(����)
		int num1 =s.nextInt();
		
		System.out.println();
		
		//���͌��ʂ̕\��
		System.out.println("���Ȃ������͂����̂�" + num1 + "�ł��B");
		System.out.println();
		
		//�����̐���
		Random rand = new Random();
		int num2 = rand.nextInt(2);
		//�����̕\��
		System.out.println("�������ꂽ������" + num2 + "�ł�");
		
		System.out.println();
		
		//����
		if (num1 > 3 || num1 < -1 ) {
			System.out.println("0�`2�̐�������͂��Ă�������");
		}else if (num1 == num2) {
			System.out.println("������");
		}else {
			System.out.println("�͂���");
		}
		

	}

}
