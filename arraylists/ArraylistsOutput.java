
import java.util.ArrayList;

public class ArraylistsOutput {
    public static void main (String[] args) {

    // creates an ArrayList of undefined length
    ArrayList<String> names = new ArrayList<String>();

    //use the add method of ArrayList class to add Strings to its length 
    names.add("Abraham");
    names.add("George");
    names.add("Ronald");
    names.add("Barack");
    names.add("Theodore");

    // creates an ArrayList of ages
    ArrayList<Integer> ages = new ArrayList<Integer>();

    ages.add(42);
    ages.add(32);
    ages.add(55);
    ages.add(33);
    ages.add(25);

    //outputs each item from the ArrayList using the (size instead of length) and the get(int index) method
     for (int i =0; i < names.size(); i ++) {
        System.out.println(names.get(i));
    }

     for (int i=0; i < ages.size(); i ++) {
        System.out.println(ages.get(i));
    }
    
    } // end of main
    
} // end of class

