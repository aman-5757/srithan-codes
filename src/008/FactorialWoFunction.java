public class FactorialWoFunction{
    public static void main(String [] args){

        //factorial

        int n = 7;
        int r = 4;

        //without function

        int nFactorial = 1;

        for(int i = 1; i <= n; i++){
            nFactorial = nFactorial * i;
        }

        int rFactorial = 1;

        for(int i = 1; i <= r; i++){
            rFactorial = rFactorial * i;
        }

        int nmrFactorial = 1;

        for(int i = 1; i <= n-r; i++){
            nmrFactorial = nmrFactorial * i;
        }

        int ncr = nFactorial / (rFactorial * nmrFactorial);

        System.out.println("nCr = " + ncr);




    }
}