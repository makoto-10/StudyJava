package javaStudy;

public class Study3 {
	public static void main(String[] args) {
		//����
		int japanese = 39;
		//���w
		int math = 61;
		//���v
		int total = japanese + math;
		
		if (total >= 160) {
			System.out.println("�D");
		}else if(total >= 140) {
			System.out.println("��");
		}else if (total >= 100 && japanese >= 40 && math >= 40) {
			System.out.println("��");
		}else {
			System.out.println("�ǎ�");
		}
	}
}
