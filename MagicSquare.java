import java.util.ArrayList;
import java.util.Scanner;
public class MagicSquare{
    private Scanner sc = new Scanner(System.in); 
    int n;
    private MagicSquare(int n) {
        this.n = n;
    }
    private int[][] square = new int[n][n];
    int value = 0;
    public void readSquare() {
        for(int i = 0; i < n;i++) {
            for(int j = 0; j < n;j++) {
                value = sc.nextInt();
                value = square[i][j];            }
        }
        if(value == "\n")
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
