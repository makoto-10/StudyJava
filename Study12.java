package javaStudy;

import java.util.Scanner;

import java.util.Random;

public class Study12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand1 = new Random();
		int num1 = 0;
		
		System.out.println("���݂����������܂��B");
		System.out.println("���s�L�[�������Ă��������B");
		System.out.println();
		
		String[] array = {"��g","���g","���g","�g","��"};
		String text2 = "��g";
		
		while(true) {
			String input = scan.nextLine();
			String text = array[rand1.nextInt(4)];
			System.out.println("���Ȃ����������̂�" + text + "�ł��B");
			num1 ++;
			if(text != text2) {
				System.out.println("��g���o��܂ň����Ă�������");
				System.out.println("������x�����Ă��������B");
			}else {
				System.out.println("��g���o��܂�" + num1 + "������܂����B");
				break;
			}
			
		}

	}

}
