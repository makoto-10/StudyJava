package javaStudy;

public class Study6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�g��
		double height = 1.7;
		//�̏d
		double weight = 70.0;
		//BMI�l
		double bmi = weight / (height * height);
		
		if (bmi >= 25) {
			System.out.println("�얞");
		}else if (bmi >= 18.5) {
			System.out.println("�W��");
		}else {
			System.out.println("���");
		}
	}

}
