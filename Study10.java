package javaStudy;

import java.util.Scanner;

import java.util.Random;

public class Study10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ʕ����\��
		System.out.println("�������ăQ�[�������܂�");
		System.out.println("0�`2�̍D���Ȑ�������͂��Ă�������");
		System.out.println();
		//scanner�̕W�����͐ݒ�
		Scanner scan = new Scanner(System.in);
		int num1;
		
		while(true) {
			//�ϐ�num1�ɕW�����͂���(����)
			num1 =scan.nextInt();
			System.out.println();
			
			//���͌��ʂ̕\��
			System.out.println("���Ȃ������͂����̂́u" + num1 + "�v�ł��B");
			System.out.println();
			
			//����
			if (num1 > 2 || num1 < 0) {
				System.out.println("0�`2�̐�������͂��Ă�������");
				System.out.println("������x���͂��Ă�������");
				System.out.println();
			}else {
				break;
			}
		}
			//�����̐���
			Random rand = new Random();
			int num2 = rand.nextInt(3);
			//�����̕\��
			System.out.println("�������ꂽ�����́u" + num2 + "�v�ł�");
			
			System.out.println();
			
				if (num1 == num2) {
					System.out.println("�u������v�ł�");
				}else if (num1 != num2){
					System.out.println("�u�͂���v�ł�");
				}
		}
}