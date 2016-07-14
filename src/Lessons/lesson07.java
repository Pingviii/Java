package Lessons;

import javax.swing.JOptionPane;

public class lesson07 {

	public static void main (String [] args){
		
		String input = JOptionPane.showInputDialog("¬вед≥ть рад≥ус:");
	
		Circle circ;

		if (input.isEmpty()) 
			circ = new Circle(); 
		else {
			double radius = Double.parseDouble(input);
			circ = new Circle(radius);
		}
		
		System.out.println("рад≥ус = "+circ.getRadius()+"\n"+
				"площа = "+circ.getArea()+"\n"+
				"д≥аметр = "+circ.getDiameter()+"\n"+
				"окружн≥сть = "+circ.getCircumference());
		
		
	}
}
