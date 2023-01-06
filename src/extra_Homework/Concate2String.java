package extra_Homework;

public class Concate2String {
    /* Write a java program to concat 2 string.
          Expected output: I love jajava
          va I eat  */

        public static void main(String[] args)           //main method
        {
            String str1 = "I love jajava ";             //local variables
            String str2 = "va I eat";                   //local variables

            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);
            String str3 = str1.concat(str2);                     // Concatenate the two strings together.

            System.out.println("The concatenated string: " + str3); //print statement
        }

    }


