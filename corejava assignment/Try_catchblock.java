
public class Try_catchblock
{
	public static void main(String[] args) {
        try {
            int result = 5 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
    }
}
