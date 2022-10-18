package com.bridgelab.day5;

public class WindChill {
    public static void main(String[] args) {

        // get command-line arguments
        double t = Double.parseDouble(args[0]); // temperature (F)
        double v = Double.parseDouble(args[1]); // velocity of wind (mph)

        // careful to add all three * signs:
        double windChillTemp = 35.74 + 0.6215 * t +
                (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        // print the result
        System.out.println(windChillTemp); // windchill (F)
        // Note - try using Math.round to produce more practical result
    }
}
