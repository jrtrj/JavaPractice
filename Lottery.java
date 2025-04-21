package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Lottery {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private Random random = new Random();
    public void createArray(){
        for(int i = 1; i <= 49;i++) {
            numbers.add(i);
        }
    }
    int count = 0;
    public void findLottery() {
        while(count < 6) {
            int index = random.nextInt(numbers.size());
            int element = numbers.remove(index);
            System.out.println(element+" ");
            count++;
        }
    }
}
