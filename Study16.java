package javaStudy;

public class Study16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output("A",1.7,60);
	}
	
	public static void output(String name, double height, double weight) {
		System.out.println(name + "����̐g����" + height + "m�ł�");
		System.out.println(name + "����̐g����" + weight + "kg�ł�");
		double bmi = bmi(height,weight);
		System.out.println(name + "�����BMI�l��" + String.format("%.1f",bmi) + "kg�ł�");
		
		String bmiResult = branch(bmi);
		System.out.println(bmiResult);
	}
	
	public static double bmi(double height, double weight) {
		return weight / height / height;
	}
	
	
	public static String branch(double bmi) {
		if(bmi < 25 && bmi >= 18.5) {
			return "�W���ł��B";
		}else if(bmi >= 25) {
			return "�얞�ł��B";
		}else {
			return "��̏d�ł��B";
		}
	}
}
