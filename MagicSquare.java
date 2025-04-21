package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquare{
    private Scanner sc = new Scanner(System.in); 
    private int[][] square = new int[][];
    public void readSquare(n) {
        for(int i = 0; i < n;i++) {
            for(int j = 0; j < n;j++) {
                int value = sc.nextInt();
                value = square[i][j];            }
        }
        if(value == "\n")
            break;
}
