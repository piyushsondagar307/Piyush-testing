
public class Multiple_catchdemo
{
	  public static void main(String[] args) {
	        try {
	            int[] arr = new int[5];
	            arr[5] = 10 / 0; // ArrayIndexOutOfBoundsException
	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception occurred.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index Out Of Bounds Exception occurred.");
	        }
	    }
}
