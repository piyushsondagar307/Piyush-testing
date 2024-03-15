	import java.util.ArrayList;
public class RemovehirdElement 
{


	
	    public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("Element 1");
	        arrayList.add("Element 2");
	        arrayList.add("Element 3");
	        arrayList.add("Element 4");

	        if (arrayList.size() >= 3) {
	            arrayList.remove(2);
	            System.out.println("ArrayList after removing the third element:");
	            for (String element : arrayList) {
	                System.out.println(element);
	            }
	        } else {
	            System.out.println("ArrayList does not have a third element to remove.");
	        }
	    }
	

}
