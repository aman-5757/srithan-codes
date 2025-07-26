import java.util.Scanner;

public class PrintFactors {
    public static void main(String [] args) {
        //Que1::: input( x, y): check y is factor of x or not

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();

        if( x % y == 0 ){
            System.out.println("Yes, y is factor of x (x is completely divisible by y)");
        }else {
            System.out.println("No");
        }

        //Que2::: input( x, y): from 1 to x print which is divisble by y
        //eg .x = 10 and y = 3:  3 6 9

        //Algorithm: steps or process to solve a problem
        /*
        1 . take input for x
        2 . take input for y

        3. loop from i = 1 to x
            3.1: i % y == 0
        
        */

    }
}