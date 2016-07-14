package Lessons;

public class sum {
	
	private int a, b;
	
	public sum (int x, int y){
		a = x;
		b = y;
	}
	
	public sum(){
		a = 0;
		b = 0;
	}
	
	public int getSum(){
		return a+b;
	}
	
	public static String sumS (){
		return "String!";
	}

}
