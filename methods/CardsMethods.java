public class OutputMethods {
    public static void main (String[] args ) {
        
    printMessage("Cowabunga");
  
    System.out.println(x);
    
    } // end of main
    
    static void printMessage() {
        // receives no info. and returns no info.
        System.out.println("Print Message");
    }
    
    static void printMessage(String m) {
        // receives a message but returns no info.
        System.out.println(m);
    }
    
    static void squareIt(int n) {
        // receive a number but returns no info.
        int square = n * n;
        System.out.println(square);
    }
    
    static int getSquared(int n) {
       // receives a number and returns a number.
       int square = n * n;
       return square;
    } 
    
    
} // end of class