package javaStudy;

public class Study16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output("A",1.7,60);
	}
	
	public static void output(String name, double height, double weight) {
		System.out.println(name + "さんの身長は" + height + "mです");
		System.out.println(name + "さんの身長は" + weight + "kgです");
		double bmi = bmi(height,weight);
		System.out.println(name + "さんのBMI値は" + String.format("%.1f",bmi) + "kgです");
		
		String bmiResult = branch(bmi);
		System.out.println(bmiResult);
	}
	
	public static double bmi(double height, double weight) {
		return weight / height / height;
	}
	
	
	public static String branch(double bmi) {
		if(bmi < 25 && bmi >= 18.5) {
			return "標準です。";
		}else if(bmi >= 25) {
			return "肥満です。";
		}else {
			return "低体重です。";
		}
	}
}
