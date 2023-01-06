package quation1;

public class Quastion2 {
    /*  2.1 Declare two static variables
        2.2 Declare one static method
        2.3 Call both static variables into the static method inside the print
        statement. 2.4 Declare the Main method.
        2.5 Call the static method into the Main method and Run the programme. */

        static int num = 100;   //Static variable v1
        static String name1 ="Minesh";  //Static variable v2

        //static method

        static  void  m1() { //static method
            System.out.println("number is :" +num);           // called static variable to print
            System.out.println("Name is :" +name1);   // called static variable to print

        }
        //Main method
        public static void main(String[] args ) {
            m1();                    //calling Static method

        }
    }

