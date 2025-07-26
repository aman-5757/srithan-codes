public class StringLoop {
    public static void main(String [] args) {
        //Que 1. s-> HelloWorld
        /*
        output: H
                e
                l
                l
                o
                W
                o
                r
                l
                d
        */

        String s = "abc";
        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }
}