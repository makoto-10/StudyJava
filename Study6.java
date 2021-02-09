package javaStudy;

public class Study6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//身長
		double height = 1.7;
		//体重
		double weight = 70.0;
		//BMI値
		double bmi = weight / (height * height);
		
		if (bmi >= 25) {
			System.out.println("肥満");
		}else if (bmi >= 18.5) {
			System.out.println("標準");
		}else {
			System.out.println("低体");
		}
	}

}
