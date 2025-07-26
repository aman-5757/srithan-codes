

public class LogicalOperator{
    public static void main(String [] args) {
        int a = 5;
        int b = 10;
        int c = 20;


        boolean res1 = (a > b ) && (b > c);
        boolean res2 = (a > b ) || (b > c);
        boolean res3 = (a > b ) || (b < c);
        boolean res4 = (a != b ) && (b > c);


        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);


        String name = "Arya";
        int age = 22;

        if(name.charAt(0) == 'A' && age < 20){
            System.out.println("Bus A");
        }

        //login:: userdId and password

        //fb


        // Name starts with A and age is less < 20 --> Bus A
        // Name starts with A and age is greater equal to 20 --> Bus B
        

    }
}

