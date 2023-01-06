package quation1;

import java.util.Scanner;

public class Circle_Area {
       /* Write a program to enter any radius value of the circle and find out the
        area.(Formula of Area A=PI*r*r).*/

        public static void main(String [] args){                  // main method
            Scanner in = new Scanner(System.in);               //scanner used to enter radius
            System.out.println("Enter the radius :" );
            double r =in.nextDouble();
            double pi=3.14;                    // value of pi declared in float
            double area =pi * r *r;            // formula for area
            System.out.println("The area of circle :="+area);    //print the statement
        }
    }


