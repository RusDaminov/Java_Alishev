package com.example.demo;

public class Break_Continue {
    public static void main(String[] args) {
//        int i = 0;
//        while(true){
//            if(i==16)
//                break;
//            System.out.println(i);
//            i++;
//        }
    for(int i = 0; i<=15; i++){
        if(i%2==0){
            continue;
        }
        System.out.println("this number is odd "+i);
    }
    }
}
