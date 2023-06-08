import java.util.ArrayList;

public class ArraysEverything {
	
    public static void main (String[] args) {

    int[] a = new int[5];
    a[0] = 5;
    a[1] = 2;
    a[2] = 3;
    a[3] = 4;
    a[4] = 1;
    String[] b = new String[5];
    b[0] = "Supercalifragilisticexpealidotious";
    b[1] = "Elton";
    b[2] = "Erwin";
    b[3] = "Tony";
    b[4] = "Jenny";
    boolean[] c = new boolean[5];
    c[0] = false;
    c[1] = false;
    c[2] = false;
    c[3] = false;
    c[4] = false;

    Stock[] stocks = new Stock[5];
    stocks[0] = new Stock("Apple", "APPL", 115.62);
    stocks[1] = new Stock("Google", "GOOG", 535.07);
    stocks[2] = new Stock("Microsoft", "MSFT", 48.85);
    stocks[3] = new Stock("Facebook", "FB", 74.43);
    stocks[4] = new Stock("Toshiba", "TYO", 495.20);

    int lengthOfA = a.length;
    int lengthOfB = b.length;
    int lengthOfC = c.length;
    int lengthOfStocks = stocks.length;
    
    int lastItemOfAArray = a[a.length-1];
    String lastItemOfBArray = b[b.length-1];
    boolean lastItemOfCArray = c[c.length-1];
    Stock lastItemOfStocksArray = stocks[2];

    System.out.println(lastItemOfStocksArray);

    int sumOfAArray = a[0] + a[1] + a[2] + a[3] + a[4];
    
    //iterate through array
    int sumOfAArray2 = 0;
    for (int i=0; i < a.length; i ++)
    sumOfAArray2 += a[i];
    
    //counts up all letters in string
    int letters = 0;
    for (int i=0; i < b.length; i++)
    letters += b[i].length();
    System.out.println("Number of letters: " + letters);
    
    // count up true and false
    int trueCounter = 0;
    int falseCounter = 0;
    for (int i=0; i < c.length; i ++) {
      if (c[i] == true) 
      trueCounter++;
      else
      falseCounter++;
    }
    System.out.println("True: " + trueCounter);
    System.out.println("False: " + falseCounter);
    
   
   System.out.println("#########################################");
   
   ArrayList<Integer> prices = new ArrayList<>();
   prices.add(10);
   prices.add(10);
   prices.add(10);
   prices.add(10);
   prices.add(0);
   prices.add(0);
   prices.add(0);
   System.out.println(prices.size());
   prices.set(0,20);
   prices.remove(0);
   System.out.println(prices.get(0));
   
   System.out.println("#########################################");
   ArrayList<Stock> moreStocks = new ArrayList<>();
   moreStocks.add(new Stock("Apple", "APPL", 115.62));
   moreStocks.add(new Stock("Apple", "APPL", 115.62));
   moreStocks.add(new Stock("Apple", "APPL", 115.62));

  
    } // end main
    
} // end class

