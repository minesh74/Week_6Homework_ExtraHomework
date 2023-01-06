package quation1;

public class Test_1 {

        String name = "Minesh";
        static int age = 45;
        public void m1() {                                 //Instance method
            Test_1 t=new Test_1();
            System.out.println(" My name is :" +name);
            System.out.println(" My age is :" +Test_1.age);
            System.out.println(age);
        }
        static void m2() {                                       //static method
            Test_1 t=new Test_1();
            System.out.println(t.name);
            System.out.println(age);
            System.out.println(Test_1.age);  //through class
        }
        public static void main(String [] args) {                       //main method
            Test_1 t = new Test_1();   // class through
            m2();             // direct access
            t.m1();          //through class

        }

    }
