package Lessons;

public class softServe01 {

	public static void main(String[] args){
		
	int [] ar = {1,56,98};
	int ar2 [] = {4,6,7};
	int [] ar3 = new int[4];
	
  for (int i =0; i<ar.length; i++ ){
		
		System.out.print(ar[i]+" ");
		
	}
	for (int i =0; i<ar.length; i++ ){
		
		System.out.print(ar2[i]+" ");
		
	}
	int temp;
	for (int i =0; i<ar.length; i++ ){
		temp = ar[i];
		ar[i] = ar2[i];
		ar2[i] = temp;
	}
	
	System.out.println();
	  
	  for (int i =0; i<ar.length; i++ ){
			
			System.out.print(ar[i]+" ");
			
		}
			  
	for (int i =0; i<ar.length; i++ ){
			
			System.out.print(ar2[i]+" ");
			
		}
			

	}

}
