package extra_Homework;

public class Replace_Java {
   /* Write a java program which replace a “I@love@java” to “we love java”
    Expected output: We love java  */

        public static void main(String [] args){//Main method

            String  name =  "I@love@java";
            String  name1 = "We love java";
            System.out.println(name.replaceFirst("I","We")) ;      //String ReplaceFirst used
            System.out.println(name.replaceAll("@"," "));          //STRING Replaceall used

    }
}
