package milestone_3;
import java.util.Scanner;
public class lecture_1_if_else {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        String  userName = input.nextLine();
        String password = input.nextLine();
        String correctUserName = "Fayjullah123";
        String correctPassword = "Fah123hh@";
        if(userName.equals(correctUserName) && password.equals(correctPassword)){
            System.out.println("User Logged In Successfully");
        }
        else{
            System.out.println("Wrong credential");
        }
    }
}
