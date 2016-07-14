package Lessons;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 * this is class for lerning
 */
/*
 * import libraries below
 */
import java.util.Scanner;
public class lesson03{
	
	//main method
	
	public static void main (String [] args) throws IOException{
		/*
		int i = 1234567890;
		float f = i;
		System.out.println(f);
		int result = i - (int)f;
		System.out.println(result);
		
		
		float a = 5.6f;
		double b;
		System.out.println(b = (double)a);
		
		final int CONST = 5;
		System.out.println(CONST);
		
		System.out.println(Math.PI);
		
		String name = "Oleh";
		int count = name.length();
		System.out.println(count);
		
		System.out.println(name.charAt(2));
		
		int n = 5;
		double d = 11.0;
		double r = d/n;
		System.out.println(r);
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		String city =  "Lviv";
		int stringLength = city.length();
		char oneChar = city.charAt(0);
		String upperCity = city.toUpperCase();
		String lowerCity = city.toLowerCase();
		System.out.println(city+"\n"+stringLength+"\n"+oneChar+"\n"+upperCity+"\n"+lowerCity);
		*/
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String userName = scan.nextLine();
		
		System.out.println("Please enter your age");
		int age =scan.nextInt();
		
		System.out.println(userName+" "+age);
		*/
		
		//JOptionPane.showMessageDialog(null, "Greating!");
		//String numb = JOptionPane.showInputDialog("Enter number");
		/*
		String ageString = JOptionPane.showInputDialog("Enter your age");
		int ageInt = Integer.parseInt(ageString);
		JOptionPane.showMessageDialog(null, ageInt);
		System.exit(0);
		*/
		/*
		double temp, weight, age;
		int day, month = 2, year = 3;
		
		int aa,bb;
		bb = aa + 2;
		aa = 4*bb;
		bb = aa/3.14;
		aa = bb - 8;
		char c = 'K';
		c = 0066;
		*/
		/*
		int speed = 20,
			time = 10,
			distance = speed*time;
		System.out.println(distance);
		
		double force = 172.5,
				area = 27.5,
				pressure = area/force;
		System.out.println(pressure);
		
		Scanner sc2 = new Scanner (System.in);
		System.out.println("Enter your desire income");
		Double income = sc2.nextDouble();
		JOptionPane.showMessageDialog(null, income);
		
		
		String incomeString = JOptionPane.showInputDialog("Enter your desire income");
		double incomeDouble = Double.parseDouble(incomeString);
		JOptionPane.showMessageDialog(null, incomeDouble);
		
		
		float total;
		double number= 2.5;
		total = (float)number;
		
		
		String name = "Oleh";
		int age = 31;
		double annualPay = 300;
		System.out.println("My name is "+name+", my age is "+age+" and\nI hope to earn "+annualPay+" per year.");
		
		String firstName = "Oleh",
				secondName = "Mukhailovych",
				lastName = "Seniuk";
		char firstIn = firstName.charAt(0);
		char secondIn = secondName.charAt(0);
		char lastIn = lastName.charAt(0);
		System.out.println(""+firstIn + secondIn + lastIn);
		
		System.out.println("\t\tOleh\nUkraine, Lviv-79008, sq.Soborna 10, apt.3\n\t\t+380634434524\n\t\tMorion");
		
		System.out.println("   *   \n  ***  \n ***** \n*******\n ***** \n  ***  \n   *   ");
		
		int num1 = 62,
				num2 = 99,
				total = num1 + num2; 
		
		final double perc = 0.62;
		double income = 4.6e6;
		double total2 = income*perc;
		System.out.println(total2);
		
		double sum = 389.787/43.56;
		JOptionPane.showMessageDialog(null,sum);
		
		if (y == 20)
			x = 0;
		
		if (hours > 40)
			payRate *= 1.5;
		
		if (sales >= 10000)
			commition = 0.2;
		
		if (max)
			fees = 50;
		
		if (x > 100)
		{
			y = 20;
			z = 40;
		}
		
		if (a < 10)
		{
			b = 0;
			c = 1;
		}
		
		if (myCharacter == 'D')
			JOptionPane.showMessageDialog(null,"GoodBye!");
			
		
		if (x > 100)
			y = 20;
		else 
			y = 0;
		
		if (y == 100)
			x = 1;
		else
			x = 0;
		
		if (sales >= 50000)
			commition = 0.2;
		else
			commition = 0.1;
		
		if (a < 10)
		{
			b = 0;
			c = 1;
		} else
		{
			b = -99;
			c = 0;
		}
		
		
		if (amount1 > 10)
			if (amount2 < 100)
				if ( amount1 > amount2 )
					JOptionPane.showMessageDialog(null, amount1);
				else JoptionPane.showMessageDialog(null, amount1);
		System.exit(0);
		
		if (x > 0) 
			if (y < 20) 
				z = 1;
			else 
				z = 0;
	
		int speed = 45;
		if (speed>=0 & speed<=200)
			JOptionPane.showMessageDialog(null, "The number is valid");
		
		if (speed <0 & speed >200)
			JOptionPane.showMessageDialog(null, "The number is not valid");
			
		
		String name1 = "Oleh",
				name2 = "Ihor";
		
		if (name1.compareTo(name2)<0)
			System.out.println(name1+"\n"+name2);
		else
			System.out.println(name2+"\n"+name1);
				
		String name = "oleh";
		if (name.equalsIgnoreCase("Oleh"))
			System.out.println("Do I know you?");
		
		int x =2 , y = 4, z;
		z = x > y ? 1 : 20;
		
		population = temp > 45 ? base*10: base*2;
		
		double wages = 3.0, hours = 43.0;
		wages = hours > 40 ? wages*1.5 : wages*1; 
		
		int result = 10;
		System.out.println(result >= 0 ? "This result is positive" : "This result is negative");
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		int scInt = sc.nextInt();
		switch (scInt){
			case 1: System.out.println("One"); break;
			case 2: System.out.println("Two"); break;
			case 3: System.out.println("Tree"); break;
			default: System.out.println("Error");
		}
		
		System.out.println("Enter a letter");
		Scanner sc = new Scanner(System.in);
		String scStr = sc.nextLine();
		char selection = scStr.charAt(0);
		switch (selection){
		case 'A': System.out.println("You selected A"); break;
		case 'B': System.out.println("You selected B"); break;
		case 'C': System.out.println("You selected C"); break;
		case 'D': System.out.println("You selected D"); break;
		default: System.out.println("Not good with letters, eh?");
		}
		
		
		double number = 1234567.456;
		System.out.printf("%,.2f\n",number);
		
		double number2 = 123.456;
		System.out.printf("%10.1f\n",number2);
		
		System.out.printf("%08.1f\n",number2);
		
		int number3 = 123456;
		System.out.printf("%,10d\n",number3);
		
		double number4 = 123456.789;
		System.out.printf("%-20.2f\n", number4);
		
		String name = "James";
		System.out.printf("%20s",name);
		
		
		double d = 459.6329;
		
		DecimalFormat df = new DecimalFormat("00000.00");
		//JOptionPane.showMessageDialog(null,df.format(d));
		
		double d2 = 0.179;
		DecimalFormat df2 = new DecimalFormat(".00");
		//JOptionPane.showMessageDialog(null,df2.format(d2));
		
		double d3 = 7634869.1;
		DecimalFormat df3 = new DecimalFormat("0,000,000.00");
		//JOptionPane.showMessageDialog(null,df3.format(d3));
		
		
		String inStr = JOptionPane.showInputDialog("Enter a number in the range of 10 through 24");
		int inNum = Integer.parseInt(inStr);
		while (inNum < 10 || inNum > 24){
			inStr = JOptionPane.showInputDialog("Enter a number in the range of 10 through 24");
			inNum = Integer.parseInt(inStr);
		}
		JOptionPane.showMessageDialog(null, "The input number is right");
		
		
		String str = JOptionPane.showInputDialog("Enter Y or N");
		char ch = str.charAt(0);
		while (!(ch =='y' || ch =='Y' || ch == 'n' || ch == 'N')){
			str = JOptionPane.showInputDialog("Enter Y or N");
			ch = str.charAt(0);	
		}
		
		String str = JOptionPane.showInputDialog("Enter YES or NO");
		String str2 = str.toLowerCase();
		while (!(str2.equals("yes") || str2.equals("no"))){
			str = JOptionPane.showInputDialog("Enter YES or NO");
			str2 = str.toLowerCase();
		}
		
		for(int count = 1; count <=50; count++){
			System.out.println(count+". I love program");
		}
		
		for (int i = 0; i<10; i++) 
			System.out.println((i+1)+". Oleh");
		
		for(int i =1; i<=49; i+=2)
			System.out.println(i);
		
		for (int i = 0; i <= 100; i+=5)
			System.out.print(i+" ");
		
		int sum = 0;
		for (int i =0; i <7; i++){
			System.out.println("Please enter a number");
			Scanner sc = new Scanner(System.in);
			sum += sc.nextInt();
			}	
		System.out.println(sum);
		
		File f = new File("C:\\Users\\XTreme.ws\\Desktop\\test.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("Oleh");
		pw.println("Ulyana");
		fw.close();
		
		Scanner sc = new Scanner(f);
		while (sc.hasNext()){
			System.out.println(sc.nextLine());
		}
		
		Random rd = new Random();
		System.out.println(rd.nextInt());
		System.out.println(rd.nextInt(9));
		System.out.println(rd.nextInt(9)+1);
		System.out.println(rd.nextDouble());
		
		
		File f = new File("C:\\Users\\XTreme.ws\\Desktop\\test.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		for(int i=0; i<3; i++)
		pw.println(JOptionPane.showInputDialog("Enter name 3 times"));
		fw.close();
		
		Scanner sc = new Scanner(f);
		while (sc.hasNext()){
			System.out.println(sc.nextLine());
		}
		
		
		int [] emloyeeNumber = new int [100];
		double [] payRate = new double [25];
		float [] miles = new float[14];
		char [] letters =new char [1000];
		double [] ar = {1.7,6.4,8.9,3.1,9.2};
		System.out.println(ar.length);
		
		
		int [] a = {1,2,3,4,5,6,7};
		int [] b = new int [7];
		
		for (int i =0; i < a.length; i++){
			b[i] = a[i];
		}
		
		for (int j = 0; j < b.length; j++){
			System.out.print(b[j]+",");
		}
		
		double [] values;
		String str = JOptionPane.showInputDialog("Please enter a size of array:");
		int size = Integer.parseInt(str);
		values = new double [size];
		System.out.println("\n"+size);
		
		int [] array =new int [9];
		for (int g= 0; g < array.length; g++){
			array[g] = -1;
		}
			
		int [] numbers1 = {1,3,6,9};
		int [] numbers2 = {2,4,6,8};
		int result = numbers1[0]*numbers2[3];
		System.out.println(result);
		
		int array [] = new int[7];
		int array [] = {1,2,3,4,5,6,7};
		zero(array);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		long input = sc.nextLong();
		long sum =0;
		long s=0;
		if (input >= 0 & input <= 9){
		while (input>0){
		    s = input%10;
			sum +=s;
			input = input/10;
		}
		return sum;
		} else {
			System.out.println("Error! The number is incorrect");
		}
		
		*/
		
		System.out.println(getSum("455"));
		
		System.out.println(3*3*3*3*3);
		System.out.println(122/64);
		
		Random ran = new Random();
		int i = ran.nextInt();
		System.out.println(i);
		
		for (int j = 0; j < 5; j++)
		myName();
		
		System.out.println( 121%161 );
		
		System.out.println(myTest("test"));
		
		}
	
		public static String myTest(String a){
			System.out.println("Empty method");
			return a;
		}
		
		
		public static void myName (){
			System.out.println("My name is Oleh");
		}

		public static int getSum (String number){
			
			int sum = 0;
					
				    for (int i=0; i < number.length(); i++)
				     {
				    	if (number.charAt(i)<'0' || number.charAt(i) > '9')
				    		return -1;
				       sum += number.charAt(i)-'0';
				     } return sum;
				    
			/*
			try {
				for (int i=0; i < number.length(); i++)
					{
						num	= Integer.parseInt(""+number.charAt(i));
						sum += num;
					} 
				return sum;
				}
				catch (Exception e) {return -1;}
			*/
		}
			
					
}