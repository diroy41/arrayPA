package com.perscholas.model;

import java.util.Arrays;
import java.util.Scanner;

//Ahmed Ali RTT-57 4/14/2023
public class task11 {
    public static void main(String[] args) {
        System.out.println("How many favorite things do  you have?");
        Scanner sc = new Scanner(System.in);
        int favoriteThings = sc.nextInt();

        String[] arr = new String[favoriteThings];

        Scanner sc2 = new Scanner(System.in);


        for (int i = 0; i<=favoriteThings-1;i++){
            System.out.println("Enter your thing:");
            arr[i] = sc2.nextLine();
        }

        System.out.println("Your favorite things are: " + Arrays.toString(arr));

    }
}
