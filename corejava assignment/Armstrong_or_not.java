import java.util.Scanner;
public class Armstrong_or_not
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int n1=n;
		int n2=n;
		
		do {
			n/=10;
			count++;
			
		}while(n>0);
		int sum=0;
		do {
			int rem=n1%10;
			int pd=1;
			for(int i=1;i<=count;i++)
			{
				pd*=rem;
				sum+=pd;
				n1/=10;
			}
		}while(n1>0);
		if(n2==sum) {
			System.out.println("armstrong number");
		}else {
			System.out.println("not armstrong number");
		}
	}
}
