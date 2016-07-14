package Lessons;

public class lesson15 {

	public static void main(String[] args) {
		
		int [] ar = new int[5];
		ar[1] =1;
		ar[4] =4;
		
		for (int i : ar){
			System.out.println(i);
		}
		
		String [] ch = new String[5];
		ch[1] = "afgf";
		ch[4] = "mgfgf";
		for (int j=0; j< ch.length; j++){
			System.out.println(ch[j]);
		}
		
		zero(ar);
		for (int i : ar){
			System.out.println(i);
		}

	}
	
	public static void zero (int [] mas){
		for(int k : mas){
			mas[k]=0;
		}
	}

}
