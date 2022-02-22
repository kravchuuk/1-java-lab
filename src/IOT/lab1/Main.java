package IOT.lab1;

public class Main {

    public static void main(String[] args) {
        Crank1 crank1 = new Crank1();
        Crank1 crank2 = new Crank1(700, "50*60*50", "mechanical");
        Crank1 crank3 = new Crank1(5000, "Dnipro M", "Black", 25, 600 , "60*50*60", "hydraulic");

        System.out.println(crank1.toString());
        System.out.println(crank2.toString());
        System.out.println(crank3.toString());
    }

    }