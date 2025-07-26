public class Main{
    public static void main(String [] args){
        // print vowels
        String s = "beautIFul";
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u' 
            || curr == 'A' || curr == 'E' || curr == 'O' || curr == 'I' || curr == 'U'){
                System.out.println(curr + "-" + i);
            }
        }

    }
}