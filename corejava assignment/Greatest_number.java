import java.util.Scanner;
public class Greatest_number 
{
	
		 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 { System.out.println("enter the first number");
		 int num1=sc.nextInt();
		  System.out.println("enter the second number");
	   int num2=sc.nextInt();
	   System.out.println("enter the third number");
	   int num3=sc.nextInt();
	   
	 
	   if((num1==num2)&&(num2==num3)&&(num3==num1)) System.out.println(num1+" all number are same");
	  if ((num1>num2)&&(num1>num3))  System.out.println ("  first number is greater  " );
	  if ((num2>num1)&&(num2>num3))  System.out.println(" second number is greater");
	  if ((num3>num1)&&(num3>num2))  System.out.println(" third number is greater");

	}
	}
	}





