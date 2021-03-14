package javaStudy;

public class Study16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output("A",1.7,60);
		

	}
	
	public static void output(String name, double height, double weight) {
		System.out.println(name + "‚³‚ñ‚Ìg’·‚Í" + height + "m‚Å‚·");
		System.out.println(name + "‚³‚ñ‚Ìg’·‚Í" + weight + "kg‚Å‚·");
		double bmi = bmi(height,weight);
		System.out.println(name + "‚³‚ñ‚ÌBMI’l‚Í" + String.format("%.1f",bmi) + "kg‚Å‚·");
	}
	
	public static double bmi(double height, double weight) {
		return weight / height / height;
	}
	
}
