package isDivisible;

//Write a method that returns whether a is divisible by b.
//
//Your method signature should be
//
//public boolean isDivisible(int a, int b)

public class IsDivisible {


    public boolean isDivisible(int a, int b) {

        //Checks if divisor is 0 to avoid Arithmetic Exception.
        if(b == 0){
            return false;
        }
        //Checks if a is divisible by b.
        return a % b == 0;

    }

    /*public static void main(String[] args) {
        IsDivisible number = new IsDivisible();
        int a = 10;
        int b = 0;
        System.out.println(number.isDivisible(a, b));

    }*/
}
