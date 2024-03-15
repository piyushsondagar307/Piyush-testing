
public class UpdateArrayElement 
{
	 public static void main(String[] args) {
	        // Original array
	        int[] array = {1, 2, 3, 4, 5};
	        
	        // Index of the element to update
	        int indexToUpdate = 2;
	        
	        // New value to replace the element
	        int newValue = 10;

	        // Update the specific array element
	        if (indexToUpdate >= 0 && indexToUpdate < array.length) {
	            array[indexToUpdate] = newValue;
	            System.out.println("Array after updating:");
	            for (int i : array) {
	                System.out.println(i);
	            }
	        } else {
	            System.out.println("Invalid index provided.");
	        }
	    }
}
