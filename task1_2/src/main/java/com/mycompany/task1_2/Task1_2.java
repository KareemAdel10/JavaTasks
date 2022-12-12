package com.mycompany.task1_2;
import java.util.Scanner;

import java.util.Scanner;

public class Task1_2
{
   public static void main(String[] args)
   {
      int n, r;
      double nCr, nPr;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the Value of n: ");
      n = input.nextInt();
      System.out.print("Enter the Value of r: ");
      r = input.nextInt();
      
      nPr = (fact(n)) / (fact(n-r));
      nCr = nPr/fact(r);
      
      System.out.println("\nnCr = " +nCr);
      System.out.println("nPr = " +nPr);
   }
   public static int fact(int num)
   {
      int fact=1;
      for(int i=1; i<=num; i++)
         fact *= i;
      return fact;
   }
}
