
public class Index_of_arrayelement 
{
	public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int searchElement = 30;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }
}
