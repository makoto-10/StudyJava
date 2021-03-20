package javaStudy;

public class Study19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {15448564,153451564,3458,65465213,56};
		int min = minNum(array);
		
		System.out.println("Å¬’l‚Í" + min + "‚Å‚·");
	}
	
	public static int minNum(int array[]) {
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

}
