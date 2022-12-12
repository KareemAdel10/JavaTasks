
package com.mycompany.task3_1;
import java.util.Scanner;
public class Task3_1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter the sentence \n");
        String sent=input.nextLine();
        System.out.println("the entered sentence is \n"+sent);
        String srt=sent.replace(",", " ");
        System.out.println("the new sentence is \n"+srt);
           
    }
}
