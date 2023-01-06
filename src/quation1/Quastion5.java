package quation1;

public class Quastion5 {
     /*Write a program for a calculator with addition, subtraction, multiplication
        and division methods all with parameters and use string concatenation
        methods.(Note: Two static and Two instance methods.)*/


        int a = 50;            // Instance variable v1
        int b = 10;          // Instance variable v2
        static int c = 10;  //Static variable v1
        static int d =2;   //Static variable v2
        //Instance method
        public void m1(){
            System.out.println("Addition :" +(a+b));
            System.out.println("Subtraction :" +(a-b));
        }
        //Instance method
        public void m2() {
            System.out.println("Multiplication :" + (a * b));
            System.out.println("Division :" + (a / b));
        }
        //static method
        public static void m3(){
            Quastion5 t=new Quastion5();//Object
            System.out.println( t.  c*d);                   //print statement
            System.out.println( t.c/d);                      //print statement
        }
        //static method
        public static void m4() {
            Quastion5 t=new Quastion5();                      //Object
            System.out.println( t.c+d);               //print statement
            System.out.println( t.c-d);               //print statement
        }
        public static void main(String [] args ){  // Main method
            Quastion5 t=new Quastion5();       //object
            m3();                              // calling static method
            m4();                              // calling static method
            System.out.println("------------------------------------------");
            t.m1();                            //calling Instance method
            t.m2();                             //calling Instance method

        }
    }


