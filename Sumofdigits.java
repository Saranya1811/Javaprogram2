package newproject1;
import java.util.Scanner;

public class Sumofdigits {
   public static void main(string args) [])
{
	int number,digit,sum=0;
	Scanner sc = new Scanner(system.in);
	System.out.println("enter the number:");
	number=sc.nextInt();
	while(number>0)
	{
		digit=number%10;
		sum=sum+digit;
		number=number/10;
		}
	System.out.println("sum of digit:"+sum);
	
}
}
