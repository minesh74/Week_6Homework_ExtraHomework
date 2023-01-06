package quation1;

import java.util.Scanner;

public class Teperature_Value {

    /* Write a program to insert any temperature value in degree Fahrenheit and
            convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

        public static void main(String [] args){                         // main method
            float temp;
            System.out.println("Enter the Temperature in Fahrenheit :" ); //print the statement
            Scanner in = new Scanner(System.in);               //scanner used to enter Fahrenheit
            temp  =in.nextFloat();
            temp = (temp-32)*5/9;                                      // formula to convert F to c
            System.out.println("Temperature in Celcius is :="+temp);    //print the statement
        }
    }

