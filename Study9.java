package javaStudy;

public class Study9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a =System.lineSeparator();
		for (int i = 1; i < 10; i++) {
			for (int n = 1; n < 10; n++) {
				int in = i * n;
				if (in % 5 == 0) {
					System.out.print("���@");
				}else if (in <= 7 || in >= 54) {
					System.out.print("���@");
				}else {
					System.out.print("���@");
				}
			}
			System.out.println(a);
		}
	}
}
