import java.util.Scanner;
public class Prime_number_or_not 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numer");
		int n =sc.nextInt();
		
		
		int flag=0;
		
	  for(int i=2;i<n/2;i++) {
		if(n%i==0) 
			flag++;
			break;
		
		}
		{	
			if(flag==0&&n!=1)
			System.out.println("primeno");
		else
			System.out.println("not primeno");}

	}	
}
