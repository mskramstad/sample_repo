package src;

import java.util.ArrayList;

public class StringsAndArrays {
    
    public static void main (String[] args) {
        String[] array1 = new String[2];
        array1[0] = "mikesdfsdfsdfsdfd";
        array1[1] = "skramstad";
        
        ArrayList<String> array2 = new ArrayList<String>();
        array2.add("Abraham");
        array2.add("Lincoln");
        
        int letters1 = array1[0].length() + array1[1].length();
        int letters2 = array2.get(0).length() + array2.get(1).length();
        
        if (letters1 > letters2)
        System.out.println("array is larger than ArrayList");
        else
        System.out.println("ArrayList is larger than array");
          
        
    }
}