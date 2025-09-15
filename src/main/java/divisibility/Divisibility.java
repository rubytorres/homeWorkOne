package divisibility;

//This program reads in two numbers from the user, dividend and divisor, and prints out whether dividend is evenly divisible by divisor.
//
// For example, one run of the program may look like this:
//
//Enter the dividend: 10
//Enter the divisor: 5
//10 is divisible by 5!
//
//Because 5 goes into 10 twice. 10 is evenly divisible by 5.

//Your program should be able to produce the following output:
//
//Enter the dividend: 10
//Enter the divisor: 0
//10 is not divisible by 0


import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {

        int dividend;
        int divisor;

        //Creates a Scanner object to read user's input.
        Scanner input = new Scanner(System.in);


        //Prompt is given and the dividend is read.
        System.out.print("Enter the dividend: ");
        dividend = input.nextInt();
        //Prompt is given and the divisor is read.
        System.out.print("Enter the divisor: ");
        divisor = input.nextInt();

        //If the dividend is evenly divisible by the divisor, the program outputs the first message.
        //Otherwise, the next message is displayed.
        if(divisor == 0 || dividend % divisor != 0 ){
            System.out.println(dividend + " is not divisible by " + divisor);
        }
        else {
            System.out.println(dividend + " is divisible by " + divisor + "!");
        }
        //Closes Scanner
        input.close();


    }
}
