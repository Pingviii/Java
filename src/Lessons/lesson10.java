package Lessons;

public class lesson10 {
	
	public static void main (String[] args){
		
		int [] array = {23,5,67,2,8,9,66,0,6,78};
		int temp = 0;
		
		for(int j = array.length-1 ; j > 0 ; j--){
		for(int i=0; i<array.length-1; i++){
			if (array[i] < array[i+1]){
				temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			} 
		}
		}
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		
	}

}
