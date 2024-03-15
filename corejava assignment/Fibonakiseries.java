
public class Fibonakiseries 
{
	
	    public static void main(String[] args) {
	        int n = 10; // Number of terms in the series
	        int firstTerm = 0;
	        int secondTerm = 1;

	        System.out.println("Fibonacci Series:");

	        for (int i = 1; i <= n; ++i) {
	            System.out.print(firstTerm + " ");

	            // Compute the next term by adding the previous two terms
	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	    }
	}


