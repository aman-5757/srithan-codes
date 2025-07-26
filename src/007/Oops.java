class VolleyballTeamForm{
    String name;
    int age;
    int standard;
    String phone;

    public VolleyballTeamForm(){
        
    }

    public VolleyballTeamForm(String n, int a, int s, String p){        //constructor
        name = n;
        age = a;
        standard = s;
        phone = p;
    }

    Scanner scn = new Scanner(System.in);
}



public class Oops{
    public static void main(String [] args){
        VolleyballTeamForm respose1 = new VolleyballTeamForm("Aman", 52, 8, "+919311575760");
        VolleyballTeamForm respose2 = new VolleyballTeamForm("Srithan", 15, 9, "+1636317");
        System.out.println(respose1.name);
        System.out.println(respose2.name);


    }
}