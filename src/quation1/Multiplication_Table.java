package quation1;

import java.util.Scanner;

public class Multiplication_Table {

    /*Write a Java program that takes a number as input and prints its
                 multiplication table up to 10.*/


        public static void main(String [] args) {    //Main method
            Scanner sc =new Scanner(System.in);
            System.out.println("Input the Number: ");       //Input any number
            int a =sc.nextInt();
            for (int i = 0; i < 10; i++) {                  //Multiplication formula
                System.out.println(a + "*" + i + " = " + (a * i));    //print table

            }
        }
    }


