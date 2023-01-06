package quation1;

public class Quastion3 {

    /* 3.1 Declare one instance and one static variable.
       3.2 Declare one instance method.
       3.3 Declare one static method.
       3.4 Call both instance and static variables
           into both instance and static methods inside the print statement.
       3.5 Declare the Main method.
       3.6 Call both instance and static methods into the Main method and run the programme.    */


        String name = "Minesh"; //Instance variable v1
        static String surname = "Patel";  //Static variable v2


        public static void main(String[] args) {     // Mian method declared
            Quastion3 t = new Quastion3();           // Object
            t.m1();  //calling Instance method       //Instance method called
            m2();                                    //static method called
        }
        //Instance Method

        public void m1() {
            System.out.println(name);     // called Instance variable v1 to print
            System.out.println(surname);  // called static variable v2 to print

        }
        //Static method
        public static void m2() {
            Quastion3 t=new Quastion3();     //object
            System.out.println(t.name);     // called Instance variable v1 to print
            System.out.println(surname);  // called static variable v2 to print
        }
    }


