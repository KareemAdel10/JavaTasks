package com.mycompany.task2_2;
import java.util. Scanner;
public class Task2_2 {
    public static void main(String[] args) 
    {
       Scanner input =new Scanner(System.in);
          System.out.println("Pls enter the number of rows  ");
        int x = input.nextInt();
        System.out.println("Pls enter the number of colums : ");
        int y = input.nextInt();
        double [][] arr = new double[x][y];
        for (int row = 0 ; row <arr.length ; row ++)
        {
            for ( int col=0 ; col<arr[0].length ; col++ )
            {
                System.out.println("enter the value of row no " + (row+1) +" and col no " + (col+1));

                 arr[row][col]=input.nextInt();
                 System.out.println(arr[row][col]);
            }
        }
        System.out.println("the transposed array is");
         for (int row = 0 ; row <arr.length ; row ++)
        {
            for ( int col=0 ; col<arr[0].length ; col++ )
            {
                System.out.println(arr[col][row]);//the 2d transpose
            }
        }



    }
 
}