import java.util.Scanner;

public class ReverseLoop {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        
        //reverse loop -> 5 4 3 2 1
        // for(int i = 5; i > 0; i--) {
        //     System.out.print(i + " ");
        // }

        //take input and print from x to 0 in reverse order
        System.out.print("Choose a number:: x ??");
        int x = scn.nextInt();
        for(int i = x; i > -1; i--) {
            System.out.print(i + " ");
        }

        //HW:: take input and print from x to 0 like: x.. x-2... x-4.. x-6... 
        //eg.: x = 11 -> 11 9 7 5 3 1
        //eg.: x = 12 -> 12 8 6 4 2 0



        //HW: 
        /*
        i/p: x
        like 
        x * 10 = 50 (x*i)
        x * 9 = 45
        x * 8 = 40
        */
    }
}