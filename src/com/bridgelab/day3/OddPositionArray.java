package com.bridgelab.day3;

public class OddPositionArray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};

        for (int i = a.length - 1; i >= 0 ; i--){
            if(i % 2 != 0)
                System.out.println(a[i]);
        }
    }
}
