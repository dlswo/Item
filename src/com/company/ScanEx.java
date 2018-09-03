package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ScanEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input");

        //짜장면,냉면,햄버거,떡볶이
        String str = scanner.nextLine();

        String[] arr = str.split(",");

        System.out.println(Arrays.toString(arr));

    }
}
