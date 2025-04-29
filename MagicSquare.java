import java.util.ArrayList;
import java.util.Scanner;
public class MagicSquare{
    private Scanner sc = new Scanner(System.in); 
    private List<String> strSquare = new ArrayList<>();
    private List<List<Integer>> square = new ArrayList<>();
    private int n;
    public MagicSquare(int n) {
        this.n = n;
    }
    System.out.println("Enter the square values");
    public void readSquare() {
        for(int i = 0; i < n;i++) {
            strSquare.add(sc.next());     
        }
        if()
            break;
    }
    private int[] sumRow = new int[n];
    private int[] sumCol = new int[n];
    private int[] sumDiagnoal = new int[n];

    public boolean isMagicSquare(int[][] square) {
         for(int i = 0; i < n;i++) {
            for(int j = 0; j < n;j++) {
                int sum += square[i][j];
            }
         sumRow[i] = sum; 
         }
    }
