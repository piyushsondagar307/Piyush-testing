
public class SecondLargestElement 
{
	 public static void main(String[] args) {
	        int[] array = {1, 5, 2, 7, 3, 9, 8, 4};
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int value : array) {
	            if (value > largest) {
	                secondLargest = largest;
	                largest = value;
	            } else if (value > secondLargest && value != largest) {
	                secondLargest = value;
	            }
	        }

	        System.out.println("Second largest element: " + secondLargest);
	    }
	}

