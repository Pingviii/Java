package Lessons;

import javax.swing.JOptionPane;

public class lesson07 {

	public static void main (String [] args){
		
		String input = JOptionPane.showInputDialog("������ �����:");
	
		Circle circ;

		if (input.isEmpty()) 
			circ = new Circle(); 
		else {
			double radius = Double.parseDouble(input);
			circ = new Circle(radius);
		}
		
		System.out.println("����� = "+circ.getRadius()+"\n"+
				"����� = "+circ.getArea()+"\n"+
				"������ = "+circ.getDiameter()+"\n"+
				"��������� = "+circ.getCircumference());
		
		
	}
}
