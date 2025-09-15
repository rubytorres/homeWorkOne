package factorial;
/*
Write a program that prints a factorial to the screen.

The factorial of a number is found by multiplying itself by all positive integers less than it (excluding 0). For example, 4 factorial, written as 4!, can be computed as follows:

4! == 4 * 3 * 2 * 1 == 24
After taking user input for the factorial they want to find, print out the factorial to the console.
Remember to use a for loop! Java does not have a built in factorial operator.
Example Output:
What number would you like to compute the factorial for? 4
24
*/

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        //Initializes total to 1 to keep track of the integers being multiplied.
        int total = 1;
        int number;

        //Asks the user to give a number.
        Scanner input = new Scanner(System.in);
        System.out.print("What number would you like to compute the factorial for? ");
        number = input.nextInt();

        //Multiples all positive integers from 1 to number.
        for(int i = 1; i <= number; i++){
            total *= i;
        }
        //Prints total
        System.out.println(total);
        input.close();

    }
}
