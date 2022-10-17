package com.bridgelab.day3;

public class SmallestElementInArray {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {1,2,67,87,9,998};
        //Initialize min with first element of array.
        int min = arr[0];
        //Loop through the array
        for (int j : arr) {
            //Compare elements of array with min
            if (j < min)
                min = j;
        }
        System.out.println("Largest element present in given array: " + min);
    }
}
