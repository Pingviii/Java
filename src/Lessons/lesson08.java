package Lessons;

public class lesson08 {

	public static void main (String [] args){
		
		Car c = new Car(1981, "Ніссан");
		
		for (int i = 0; i<5; i++){
		c.accelerate();
		System.out.println(c.getSpeed());
		}
		
		for (int i = 0; i<5; i++){
			c.brake();
			System.out.println(c.getSpeed());
			}
		
	}
}
