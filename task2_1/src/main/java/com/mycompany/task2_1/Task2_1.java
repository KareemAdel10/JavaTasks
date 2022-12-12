package com.mycompany.task2_1;
import java.util.Scanner; 
public class Task2_1 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array : ");
        int x = input.nextInt();
        int maximum;
        int []arr= new int[x];
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.println("enter the value of element no "+(i+1));
            arr[i]=input.nextInt();
        }
        maximum=arr[0];
        for(int i =0; i<arr.length ; i++)
        {
            if(arr[i]>maximum)
            {
                maximum=arr[i];
            }

        }
        System.out.println("The maximum element in the array is "+maximum);




    }

}