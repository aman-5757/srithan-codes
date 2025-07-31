public class Calculator{
    //functions & methods  --> main()
    //println()

    /*
    functions: 1. inbuilt :: println() / next() /nextInt() / nextLine()
                2. user defined :: where we write logic to solve something  (FOCUS)
    
    */

    public static int add(int a, int b){
        return a + b;
    }

     public static int multiply(int a, int b){
        return a * b;
    }

     public static int divide(int a, int b){
        return a / b;
    }

     public static int substract(int a, int b){
        return a - b;
    }

    public static int square(int a){
        return a * a;
    }

     public static int factorial(int x){
        int factorial = 1;

        for(int i = 1; i <= x; i++){
            factorial = factorial * i;
        }

        return factorial;
    }


    public static void main(String [] args){
        int a = 40;
        int b = 4;

        System.out.println("Add: " + add(a,b));
        System.out.println("Divide: " + divide(a,b));
    }
}