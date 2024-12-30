package ArrayPractise;

import java.util.Scanner;

public class TakingInpFromKeyboard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* For Number
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("Given num is: " +num);*/

        //for double
        /*System.out.println("Enter decimal number:");
        double d = sc.nextDouble();
        System.out.println("Given double is: " +d);*/

        //integer data type cannot hold decimal
        //But decimal can hold integer data

        //String data
      /*  System.out.println("Enter your city");
        String city = sc.next();
        System.out.println("Enter your city: " +city);
*/

        //Can we take multiple values from the console

        //integer
        /*  System.out.println("Enter first number:");
        int num1 =sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Addition of 2 number " +(num1+num2));*/

        //String
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("your name is: "+name);

        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("your age is: "+age);

        //it can be any data
        System.out.println("Enter unknown value: ");
        Object value = sc.next();
        System.out.println(value);



    }

}
