public class FactorialFunction{

    public static int factorial(int x){
        int factorial = 1;

        for(int i = 1; i <= x; i++){
            factorial = factorial * i;
        }

        return factorial;
    }
    
    public static void main(String [] args){
        //factorial
        int n = 7;
        int r = 4;

        //with function
        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nmrFactorial = factorial(n-r);

        int ncr = nFactorial / (rFactorial * nmrFactorial);

        System.out.println("nCr = " + ncr);
    }
}