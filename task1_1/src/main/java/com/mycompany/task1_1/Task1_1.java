package com.mycompany.task1_1;
import java.util.Scanner;
public class Task1_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter the ascii number");
        int A= input.nextInt();
        char B= (char) A;
        System.out.println("the ascii equivalent character is => "+ B);
    }
}
