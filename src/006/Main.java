public class Main{
    public static void main(String [] args){
        // //Que1. Print all the factors of a number??
        // // x = 16 -> 1 2 4 8 16


        // int x = 16;

        // for(int i  = 1; i <= x; i++) {
        //     if(x % i == 0) {
        //         System.out.print(i + " ")
        //     }
        // }

        // //Que2. Count all the factors of a number??
        // // x = 16 -> 1 2 4 8 16 (ans = 5)  (DRY RUN)

        // int x = 7;
        // int count = 0;

        // for(int i  = 1; i <= x; i++) {
        //     if(x % i == 0) {
        //         count++;
        //     }
        // }

        // System.out.println("Factors: " + count);


        //Que3. Prime or not?
        // x = 16 -> 1 2 4 8 16 (ans = 5)  (DRY RUN)

        // int x = 7;
        // int count = 0;

        // for(int i  = 1; i <= x; i++) {
        //     if(x % i == 0) {
        //         count++;
        //     }
        // }

        // if(count == 2) {
        //     System.out.println("Prime");
        // }else {
        //     System.out.println("Not Prime");
        // }
        

        /*
        Learnings :::

        char ch = 'a' --> 'A' ??
        char -> how to check -> alphabets, digits, symbols  ch = 'f' -> alphabet , ch = '8' -> digit
        char ch = 'B' --> 'b' ??
        
        .charAt() / .length()
         */
        
        char ch = 'y';
        // ch = Character.toUpperCase(ch);
        // System.out.println(ch);

        System.out.println("Check if is upper case: " + Character.isUpperCase(ch));
        System.out.println("Check if is lower case: " + Character.isLowerCase(ch));


        char ch2 = '7';
        System.out.println("Check if is digit: " + Character.isDigit(ch2));

    }
}