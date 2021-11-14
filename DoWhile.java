package com.example.demo;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int value;
       {
           System.out.println("input 5");
           value = scanner.nextInt();
       } while(value!=5);

        System.out.println("Your input is " +value);
    }
}
