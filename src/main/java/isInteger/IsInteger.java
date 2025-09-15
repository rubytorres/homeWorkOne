package isInteger;

import java.util.Scanner;

public class IsInteger {

//    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all of the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//
    int integer;

    public boolean isInteger(String str){
       //Checks if string can be converted to an integer and returns true.
        try {
           Integer.parseInt(str);
           return true;

       }
       //Catches NumberFormatException if String cannot be written as an integer and returns false.
       catch(NumberFormatException e){
           return false;
       }
    }

    /*public static void main(String[] args) {
        IsInteger string = new IsInteger();
        System.out.println(string.isInteger("Ruby"));
        System.out.println(string.isInteger("89st"));
        System.out.println(string.isInteger("89"));
    }*/


}
