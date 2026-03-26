package milestone_2;

public class lec_1_operator {
    public static void main(String[] args) {
        System.out.println("Arithmetic operator");
        int a = 5;
        int b = 5;
        System.out.println("Sum of a+b = "+ (a+b));
        System.out.println("Substraction of a-b = "+ (a-b));
        System.out.println("Multiplication of a x b = "+ (a*b));
        System.out.println("Division of a / b = "+ (a/b));
        System.out.println("Modulus of a % b = "+ (a%b));
        System.out.println("increment of a  = "+ (a++));
        System.out.println("increment of b  = "+ (++b));
        System.out.println("decrement of a  = "+ (a--));
        System.out.println("decrement of b  = "+ (--b));

        System.out.println("Assignment operator");
        a +=5;
        System.out.println("a = a+5 = "+a);
        a -=5;
        System.out.println("a = a-5 = "+a);
        a *=5;
        System.out.println("a =a*5 = "+a);
        a /=5;
        System.out.println("a = a/5 = "+a);
        a %=5;
        System.out.println("a = a%5 = "+a);
        b &=3;
        System.out.println("b = b&3 ="+b);// 5 = 0101 & 3 = 0011 = 0001
        System.out.println("explanation: 5 = 0101 & 3 = 0011 = 0001");
        b |=3;
        System.out.println(b); // 1 = 0001 | 3 = 0011 = 0011 = 3
        System.out.println("explanation: 1 = 0001 | 3 = 0011 = 0011 = 3");
        b ^=2;
        System.out.println(b);// 3 = 0011 ^ 2=0010 = 0001 = 1
        System.out.println("explanation : 3 = 0011 ^ 2=0010 = 0001 = 1");
        int c = 10;
        c >>=2;
        System.out.println(c); // 10 = 1010 right shifted by 2 means the left bits shifted 2 time by right. answer should be 2
        System.out.println("10 = 1010 right shifted by 2 means the left bits shifted 2 time by right. answer should be 2");
        c <<=2;
        System.out.println(c);// 2 = 0010 left shifted by 2 means the right bits shifted 2 times by left. the answer should be 8
        System.out.println("2 = 0010 left shifted by 2 means the right bits shifted 2 times by left. the answer should be 8");

        System.out.println("---Comparison Operators---");
        a = 5;
        b = 4;
        System.out.println("5 is greater than 4 = "+(a>b));
        System.out.println("5 is less than 4 = "+(a<b));
        System.out.println("5 is greater than or equal to 4 = "+(a>=b));
        System.out.println("5 is less than or equal to 4 = "+(a<=b));
        System.out.println("5 is equal to 4 = "+(a==b));
        System.out.println("5 is not equal to 4 = "+(a!=b));

        System.out.println("---Logical operator----");
        System.out.println("And operator");
        System.out.println(" true and true = "+ (true && true));
        System.out.println(" true and false = "+ (true && false));
        System.out.println(" false and false = "+ (false && false));
        System.out.println(" false and true = "+ (false && true));
        System.out.println(" Or operator ");
        System.out.println(" true or true = "+ (true || true));
        System.out.println(" false or true = "+ (false || true));
        System.out.println(" false or false = "+ (false || false));
        System.out.println(" true or false = "+ (true || false));

        System.out.println(" Not operator = ");
        System.out.println(" not(true or false) =  "+ !(true || false));



    }
}
