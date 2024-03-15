
public class Max_min_array
{
	 public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;

	        for (int value : array) {
	            if (value > max) {
	                max = value;
	            }
	            if (value < min) {
	                min = value;
	            }
	        }

	        System.out.println("Maximum value in the array: " + max);
	        System.out.println("Minimum value in the array: " + min);
	    }
}
