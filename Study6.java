package javaStudy;

public class Study6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//g·
		double height = 1.7;
		//Ìd
		double weight = 70.0;
		//BMIl
		double bmi = weight / (height * height);
		
		if (bmi >= 25) {
			System.out.println("ì");
		}else if (bmi >= 18.5) {
			System.out.println("W");
		}else {
			System.out.println("áÌ");
		}
	}

}
