package com.bridgelab.day4;

import java.util.Random;

public class FlipCoinPercentage {
    public static void main(String[] args)
    {
        Random r = new Random();
        double percentHeads = 0;
        double percentTails = 0;
        int heads = 0, talis = 0;
        for (int i = 0; i < 10; i++){
            int result = r.nextInt(0,2);
            if (result == 1){
                heads++;
            }else {
                talis++;
            }
        }
        percentHeads = heads / (double) 10 * 100;
        percentTails = talis / (double) 10 * 100;

        System.out.println("Percentage for the Heads :: " + percentHeads);
        System.out.println("Percentage for the Tails :: " + percentTails);
    }
}
