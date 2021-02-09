package javaStudy;

public class Study3 {
	public static void main(String[] args) {
		//‘Œê
		int japanese = 39;
		//”Šw
		int math = 61;
		//‡Œv
		int total = japanese + math;
		
		if (total >= 160) {
			System.out.println("—D");
		}else if(total >= 140) {
			System.out.println("—Ç");
		}else if (total >= 100 && japanese >= 40 && math >= 40) {
			System.out.println("‰Â");
		}else {
			System.out.println("’ÇŽŽ");
		}
	}
}
