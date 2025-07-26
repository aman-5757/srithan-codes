import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);       //object of Scanner class :: we have to remember this statement

        //if - else :: conditional statement
        System.out.println("Enter your age..");
        int age = scn.nextInt();

        if(age >= 18){
            System.out.println("You can vote..");
        }else {
            System.out.println("You cannot vote..");
        }









        //String input
        // System.out.println("Enter your name..");
        // String name = scn.nextLine();
        // System.out.println("Name is :: " + name);


        // System.out.println("Provide first value..");
        // int a = scn.nextInt();
        // System.out.println("Provide second value..");
        // int b = scn.nextInt();
        // System.out.println("Provide third value..");
        // int c = scn.nextInt();

        // int result = (a + b + c);

        // System.out.println("Sum = " + result );
    }
}


