
/**
 *
 * @author m
 */
public class CountingPieces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int cols = 5;
    int rows = 4;
    Piece [] [] board = new Piece[5][5];
    board[0][0] = new Piece();
    board[0][1] = new Piece();
    board[1][0] = new Piece();
    board[0][0].setAlive(false);
    board[0][0].setValue(5);
    board[1][0].setAlive(true);
    
    int [] [] values = { {5,5,1,5},
            {1,2,0,7}, {8,3,4,2}, {2,3,1,5}, {1,2,3,1} };
    System.out.println("The sum of matrix is " + getSum(values));
    //int [] [] newValues = updateMatrix(values, 5, 0);
    //System.out.println("The sum of matrix is " + getSum(newValues));
    System.out.println("the values around " + getValuesAround(values, 1,1));
    }
    
    
    public static int getSum(int [] [] values) {
        int sum = 0;
        for (int i =0; i < values[0].length; i++){
        for (int j =0; j < values.length; j++){
           sum += values[j][i];
        }
        }
        return sum;
    }
    
    public static int[][] updateMatrix(int [] [] values, int x, int y) {
        for (int i =0; i < values[0].length; i++){
        for (int j =0; j < values.length; j++){
           if (values[j][i] == x)
               values[j][i] = y;
           //System.out.print(values[j][i]+ " " );
        }
       //System.out.println();
        }
        return values;
    }

    public static void displayMatrix(int [][] values) {
    for (int i =0; i < values[0].length; i++){
        for (int j =0; j < values.length; j++){
           System.out.print(values[j][i]+ " " );
        }
        System.out.println();
        }
    }

  
    public static int getValuesAround(int [][] values,int x, int y) {
        int sum = 0;
        if ( (x >= 0) || (x < values.length) )
        sum += values[x-1][y-1]; //0,0
        
        sum += values[x][y-1]; // 1,0
        if (x >= 0)
        sum += values[x-1][y]; // 0,1
        sum += values[x+1][y]; //2,1
        sum += values[x][y+1]; //1,2
        sum += values[x+1][y+1]; //2,2
        sum += values[x+1][y-1];
        if (x >= 0)
        sum += values[x-1][y+1];
        return sum;
    }
    
    public static void showMe(int val) {
    System.out.println(val);    
    }
    
}
