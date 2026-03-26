package milestone_2;

public class lec_3_numbers {
    public static void main(String[] args) {
        int x = 54;
        int y = 87;
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.round(4.2));
        System.out.println(Math.round(4.7));
        System.out.println(Math.ceil(4.2));
        System.out.println(Math.floor(4.9));
        System.out.println(Math.abs(-1999));
        System.out.println(Math.pow(2,3));
        System.out.println("---Math.random() method----");
        System.out.println("---Math.random() method generates random numbers between 0.00 to 1 but 1 is not included. range = [0 to 1)");
        System.out.println(Math.random());
        System.out.println("Generating number between 0 to 10");
        System.out.println((int)(Math.random()*11));
        System.out.println("Generating number between 0 to 20");
        System.out.println((int)(Math.random()*21));
        System.out.println("Generating number between 0 to 100");
        System.out.println((int)(Math.random()*101));


    }
}
