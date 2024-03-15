
public class Pattern3 
{
	
	    public static void main(String[] args) {
	        int rows = 4;

	        for (int i = 1; i <= rows; i++) {
	            // Print spaces
	            for (int j = rows - i; j > 0; j--) {
	                System.out.print("   ");
	            }
	            
	            // Print left stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*     ");
	            }
	            
	            System.out.println();
	        }
	    }
	}


