public class SortingArrays {
    
    public static void main (String[] args) {
    
        int [] arr = {34,12,99,73,5,66,44,20,9,1};
        outputArr(selectionSort(arr));
        
        //binarySearch(,0,9,34);
    }
    
    public static void outputArr(int [] a) {
        for (int i=0; i < a.length; i ++) {
        if (i != a.length - 1)    
        System.out.print(a[i] + ",");
        else
        System.out.println(a[i]);
        }
    }
    
    public static void binarySearch(int[ ] array, int lowerbound, int upperbound, int key)
       {
           int position;
           int comparisonCount = 1;    // counting the number of comparisons (optional)
    
         // To start, find the subscript of the middle position.
         position = ( lowerbound + upperbound) / 2;
    
         while((array[position] != key) && (lowerbound <= upperbound))
         {
             comparisonCount++;
             if (array[position] > key)             // If the number is > key, ..
             {                                              // decrease position by one. 
                  upperbound = position - 1;   
             }                                                             
                  else                                                   
            {                                                        
                  lowerbound = position + 1;    // Else, increase position by one. 
            }
           position = (lowerbound + upperbound) / 2;
         }
         if (lowerbound <= upperbound)
         {
               System.out.println("The number was found in array subscript" + position);
               System.out.println("The binary search found the number after " + comparisonCount +
                     "comparisons.");
               // printing the number of comparisons is optional
         }
         else
              System.out.println("Sorry, the number is not in this array.  The binary search made "
                     +comparisonCount  + " comparisons.");
      }
    
    
    public static void insertionSort(int [] arr) {
          int n = arr.length;
          for (int j = 1; j < n; j++) {
                int key = arr[j];
                System.out.println("key: " + key);
                int i = j-1; 
                System.out.println("i: " + i);
                while ( (i > -1) && ( arr [i] > key ) ) { // true
                    arr [i+1] = arr [i]; 
                    i--;
                    System.out.println("i2: " + i);
                }
                arr[i+1] = key;
                outputArr(arr);
            }
            
    }
    
    public static int [] selectionSort (int [] arr) {
          int i, j, minIndex, tmp;
          int n = arr.length;
          for (i = 0; i < n - 1; i++) {
                minIndex = i;
                for (j = i + 1; j < n; j++)
                      if (arr[j] < arr[minIndex])
                            minIndex = j;
                if (minIndex != i) {
                      tmp = arr[i];
                      arr[i] = arr[minIndex];
                      arr[minIndex] = tmp;
                }
          }
          return arr;
    }
    
    public static void mergeSort(int[] array) {
            if (array.length > 1) {
                // split array into two halves
                int[] left = leftHalf(array);
                int[] right = rightHalf(array);
                
                // recursively sort the two halves
                mergeSort(left);
                mergeSort(right);
                
                // merge the sorted halves into a sorted whole
                merge(array, left, right);
            }
        }
        
        // Returns the first half of the given array.
        public static int[] leftHalf(int[] array) {
            int size1 = array.length / 2;
            int[] left = new int[size1];
            for (int i = 0; i < size1; i++) {
                left[i] = array[i];
            }
            return left;
        }
        
        // Returns the second half of the given array.
        public static int[] rightHalf(int[] array) {
            int size1 = array.length / 2;
            int size2 = array.length - size1;
            int[] right = new int[size2];
            for (int i = 0; i < size2; i++) {
                right[i] = array[i + size1];
            }
            return right;
        }
        
        // Merges the given left and right arrays into the given 
        // result array.  Second, working version.
        // pre : result is empty; left/right are sorted
        // post: result contains result of merging sorted lists;
        public static void merge(int[] result, 
                                 int[] left, int[] right) {
            int i1 = 0;   // index into left array
            int i2 = 0;   // index into right array
            
            for (int i = 0; i < result.length; i++) {
                if (i2 >= right.length || (i1 < left.length && 
                        left[i1] <= right[i2])) {
                    result[i] = left[i1];    // take from left
                    i1++;
                } else {
                    result[i] = right[i2];   // take from right
                    i2++;
                }
            }
    
    
    }
       
        
    }
    
