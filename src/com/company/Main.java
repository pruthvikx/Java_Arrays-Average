package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Lets make an array of integer
        int[] myArray = getArray(5);

        for (int i = 0;i < myArray.length; i++){
            System.out.println("Array elements : " + myArray[i]);
        }
        System.out.println("The average is "+ getAverage(myArray));

    }
    public static int[] getArray(int array){
        System.out.println("Enter numbers for array : " + array);
        int[] newArray = new int[array];

        for (int i = 0;i < newArray.length; i++){
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }
    public static double getAverage(int[] num){
        int sum = 0;
        for (int i = 0;i < num.length;i++){
            sum += num[i];
        }

        return (double) sum / (double) num.length;
    }

}
