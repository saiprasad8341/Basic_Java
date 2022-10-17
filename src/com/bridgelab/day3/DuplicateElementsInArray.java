package com.bridgelab.day3;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.print("Duplicate elements in given array :: ");
        //Searches for Duplicate elements
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.print( " " + arr[j] + " ");
                }
            }
        }
    }
}
