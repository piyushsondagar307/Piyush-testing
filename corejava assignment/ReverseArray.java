
public class ReverseArray 
{
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - i - 1];
        }

        System.out.println("Reversed Array:");
        for (int i : reversedArray) {
            System.out.println(i);
        }
    }
}
