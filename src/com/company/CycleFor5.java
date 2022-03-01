package com.company;


public class CycleFor5 {
    public static void main(String[] args) {

        for (int i=0; i<10;i++){
            i++;
          System.out.print(i);
            System.out.print(",");
            i--;
            System.out.print(i);
            System.out.print(",");
        }
    }
}

