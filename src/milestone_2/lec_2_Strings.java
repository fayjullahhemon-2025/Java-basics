package milestone_2;

import java.util.Locale;

public class lec_2_Strings {
    public static void main(String[] args) {
        System.out.println("--String print---");
        String hello = "Hello world!";
        System.out.println(hello);
        System.out.println("---String length--");
        String greetings = "Welcome to my repo";
        System.out.println(greetings.length());

        System.out.println("---String toUpperCase() method--");
        String upperCase = greetings.toUpperCase();
        System.out.println(upperCase);
        System.out.println("---String toLowerCase() method--");
        String lowerCase = upperCase.toLowerCase();
        System.out.println(lowerCase);
        System.out.println("---String indexOf() method---");
        System.out.println(greetings.indexOf("my"));
        System.out.println("---String charAt(index) method---");
        System.out.println(greetings.charAt(8));
        System.out.println("---String equals() method---");
        System.out.println("---equals() method check  whether 2 string is same or not---");
        String name1 = "Fayjullah";
        String name2  = "Emon";
        String name3 = "Fayjullah";
        System.out.println(name1.equals(name3));
        System.out.println(name1.equals(name2));
        System.out.println("---String trim() method---");
        System.out.println("---String trim() method removes the whitespace before and after string---");
        System.out.println("---before using trim() method---");

        String x = "   Hello   ";
        System.out.println(x.length());
        System.out.println("---after using trim() method---");
        String trimmedTxt = x.trim();
        System.out.println(trimmedTxt.length());

        System.out.println("--------String Concatination-------");
        System.out.println("hello " +  name1 + " " + greetings);
    }
}
