import java.util.ArrayList;

//WAP to iterate through all elements in an array list.


public class Question19Demo 
{
	 public static void main(String[] args) 
	 {
		  // Create a list and add some colors to the list
		  ArrayList<String> list_Strings = new ArrayList();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println("Arraylist: "+list_Strings);
		  // Print the list
		  for (String element : list_Strings) 
		  {
		    System.out.println(element);
		    }
	 }
}