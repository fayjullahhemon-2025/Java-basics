public class lec_3_variables {
    public static void main(String[] args) {
        System.out.println("numbers----------->");
        System.out.println("---int----");
        int a = 7;
        System.out.println("a = "+a);
        System.out.println("---float----");
        float b = 7.5f;
        System.out.println("b = "+b);
        System.out.println("----double----");
        double c = 7.8000;
        System.out.println("c = "+c);
        System.out.println("Text---->");
        System.out.println("----Character---->");
        char d = 'A';
        System.out.println("d = "+d);
        System.out.println("---String----");
        String e = "Hello world!";
        System.out.println("e = "+e);
        System.out.println("----Multiple variables------");
        System.out.println("a+b+c = "+ a+b+c); //do wrong sum
        /**
         * Java is following its Operator Precedence rules. In Java,
         * the + operator works from left to right.
         * **/
        System.out.println("a+b+c = "+ (a+b+c)); //do right sum
        System.out.println(a+b+c);

    }
}
