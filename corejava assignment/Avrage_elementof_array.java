
public class Avrage_elementof_array 
{
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double average = 0;

        for (int value : array) {
            average += value;
        }

        average /= array.length;

        System.out.println("Average of array elements: " + average);
    }
}
