package javaStudy;

public class Study18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output(9);
	}

	public static void output(int num) {
		int array = timesTablesArray(num);
		System.out.println(array + "の段の答えは下記です");
		String l = loop(array);
		System.out.println(l);
	}
	
	public static int timesTablesArray(int a) {
		int array[] = {0,1,2,3,4,5,6,7,8,9};
		return array[a];
	}
	
	public static String loop(int l) {
		for(int i = l; i <= l; l--) {
			for(int num = 0;num < 10; num++) {
				int result = i * num;
				System.out.println(i + "×" + num + "=" + result);
			}
		}
		return "";
	}

}
