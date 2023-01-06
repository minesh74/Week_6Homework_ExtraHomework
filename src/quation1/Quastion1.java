package quation1;

public class Quastion1 {

        /* 1.1 Declare two instance variables.
           1.2 Declare one instance method.
           1.3 Call both instance variables into the instance method inside the print statement
           1.4 Declare the Main method.
           1.5 Call the above instance method into the Main method and Run the programme.*/
        String name = "Minesh"; //Instance variable v1
        String surname = "Patel";  //Instance variable v2


        public static void main(String [] args ){     // Main method declared
            Quastion1 t = new Quastion1();            //Object created
            t.m1();                                   //calling Instance method


        }
        //Instance Method
        public  void m1(){
            System.out.println("My name is :" +name);     // called Instance variable v1 to print
            System.out.println( " My surname is :" +surname);  // called Instance variable v2 to print

        }
    }


