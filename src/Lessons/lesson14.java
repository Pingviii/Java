package Lessons;
import java.util.*;
public class lesson14 {

	public static void main(String [] args) {
		
		char a = '\u005B', b = '\u005D';
		
		System.out.println(a*b);
		
		
		
		for (int i = 0; i<7; i++){
			
			for(int j=0; j<7; j++){
				if (((i+j)%2)!=0)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}

}
