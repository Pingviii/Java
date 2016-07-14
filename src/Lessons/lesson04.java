package Lessons;

public class lesson04 {

	public static void main(String[] args) {
		int i = word("penguin").length();
		
		//System.out.println(i);
		//System.out.println(showChar("Oleh",4));
		//System.out.println(calculateRetail(5,50));
		System.out.println(isPrime(5));
	}
	
	public static String word (String word){
		return word;
	}
	
	public static char showChar (String word, int numb){
		char symb = word.charAt(numb-1);
		return symb;
	}
	
	public static double calculateRetail (double price, double percentage){
		
		return price*(1+percentage/100.00);
	}
	
	public static boolean isPrime (int number){
		int ost = 0;
		for (int i = 2; i < number; i++){
			ost = number%i; 
			if (ost == 0) break;
		}
		if (ost != 0) return true; else return false;

	}

}
