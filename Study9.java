package javaStudy;

import java.util.Collections;

public class Study9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				int k = i * j;
				if ((i * j)% 5 == 0) {
					System.out.print("���@");
				}else if((i == 2 || j == 2) && k > 7 && k < 13) {
					System.out.print("���@");
				}else if((i == 3 || j == 3) && k > 8 && k < 22) {
					System.out.print("���@");
				}else if((i == 4 || j == 4) && k > 7 && k < 33) {
					System.out.print("���@");
				}else if((i == 6 || j == 6 || j == 7) && k > 35 && k < 50) {
					System.out.print("���@");
				}else {
					System.out.print("���@");
				}
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
		
		int h = 4;
		for (int i = h; i > 0; i = i-1) {
			for(int a = i; a > 0; a = a-1) {
				System.out.print("���@");
			}
			
			for(int b = 1; b < 4; b++) {
				System.out.print("���@");
			}

			for(int c = i; c > 0; c = c-1) {
				System.out.print("���@");
			}
			
			System.out.println("");
		}
		
		for (int i = 1; i < 10; i++) {
			System.out.print("���@");
		}
		System.out.println("");
		
		
		
		
	}
	

}

