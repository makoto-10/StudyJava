package javaStudy;

public class Study3 {
	public static void main(String[] args) {
		//国語
		int japanese = 39;
		//数学
		int math = 61;
		//合計
		int total = japanese + math;
		
		if (total >= 160) {
			System.out.println("優");
		}else if(total >= 140) {
			System.out.println("良");
		}else if (total >= 100 && japanese >= 40 && math >= 40) {
			System.out.println("可");
		}else {
			System.out.println("追試");
		}
	}
}
