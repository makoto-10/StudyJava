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
	}
	
	public static double bmi(double height, double weight) {
		return weight / height / height;
	}
	
}
