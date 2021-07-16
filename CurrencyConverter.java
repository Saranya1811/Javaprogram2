package newproject2;
import java.util.*;

import java.text.DecimalFormat;

 
public class CurrencyConverter{
 
	
public static void main(String[] args) {

 
	double amount, dollar,  code, euro, rupee;
 

	DecimalFormat f = new DecimalFormat("##.##");
 

	Scanner sc = new Scanner(System.in);
 
	
System.out.println(" Welcome to the Currency Converter");
	
 
	System.out.println("which currency You want to Convert ? ");

	
	System.out.println("1:Ruppe \t2:Dollar n3:Euro  ");

	code = sc.nextInt();
	
	
System.out.println("How much Money you want to convert ?");

	amount = sc.nextFloat();
 
	
if (code == 1) {
 
	
dollar = amount / 70;
	
System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");
 

	euro = amount / 80;


	System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");
 
	
}
 else if (code == 2)
 {
	

	rupee = amount * 70;
	
System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");

 
 
	euro = amount * 0.87;

	System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");

 
	}
 else if (code == 3) 
{
 

	rupee = amount * 88;

	System.out.println("Your " + amount  + f.format(rupee) + " Ruppes");
 

	dollar = amount * 1.26;
	System.out.println("Your " + amount + f.format(dollar) + " Dollar");
 
	
euro = amount * 1.10;
	
System.out.println("Your " + amount + f.format(euro) + " Euro");
 

	}
 else 
{
	
System.out.println("Invalid input");

	}
	
	
System.out.println("Thank you for choosing currency convertor");


	}

 
}





