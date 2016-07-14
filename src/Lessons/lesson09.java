package Lessons;

public class lesson09 {
	
	public static void main (String [] args){
		
		int [] a = {1,2,3,4,5,6,7};
		int [] b;
		b = new int[a.length];
		for (int i=0; i<b.length; i++){
			b[i] = a[i];
			System.out.print(a[i]+" ");
			System.out.print(b[i]+"\n");
		}	
			
		System.out.println();
		String [] planet = {"Mercury", "Venus", "Earth", "Mars"};
		
		for (int i =0; i<planet.length; i++){
			System.out.println(planet[i]);
		}
		
		System.out.println();
		
		for (int j=0; j<planet.length; j++){
			System.out.println(planet[j].charAt(0));
		}
			
		
	}

}
