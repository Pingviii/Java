package Lessons;

import javax.swing.JOptionPane;
public class lesson11 {
	
	public static void main (String[] args){
		
		String[] arName = new String[5];
		char[] letter = {'A','B','C','D','F'};
		int[][] score = new int[5][4];
		String temp;
		double sum=0;
		double avg;
		boolean flag = false;
		
		for(int i = 0; i < arName.length; i++){
			arName[i] = JOptionPane.showInputDialog("¬вед≥ть ≥м'€ студента:");
			for(int j=0; j<score[i].length; j++){
				temp = JOptionPane.showInputDialog("¬вед≥ть оц≥нку за тест "+(j+1)+" :");
				score[i][j]=Integer.parseInt(temp);
				if(score[i][j]>100 || score[i][j]<0) { JOptionPane.showMessageDialog(null,"Error!"); break; }
				else {
					flag = true;
				sum+=score[i][j];
				}
			}
			if(!flag) {JOptionPane.showMessageDialog(null,"Error");break;}
			else {
			avg = sum/(score[i].length);
			JOptionPane.showMessageDialog(null," "+arName[i]+" бал: "+avg);
			if(avg>=90) JOptionPane.showMessageDialog(null,letter[0]); else
			if(avg>=80) JOptionPane.showMessageDialog(null,letter[1]); else
			if(avg>=70) JOptionPane.showMessageDialog(null,letter[2]); else
			if(avg>=60) JOptionPane.showMessageDialog(null,letter[3]); else
			if(avg>=0) JOptionPane.showMessageDialog(null,letter[4]);
			}			
		}
		
		
		
	}

}
