package com.bridgelab.day5;

public class Distance {
    public static void main(String[] args) {
        //Parse x and y co-ordinates from command-line arguments
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        //compute distance to ( 0 , 0 )
        double dist = Math.sqrt( x * x + y * y);

        System.out.println("Distance from ( " + x + " , " + y + " ) to ( 0, 0 ) :: " + dist);
    }
}
