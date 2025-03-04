import java.util.*; 
public class AccountSetup {
    public static void main(String[]args){
        String name; 
        String password; 
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter your name: "); 
        name = input.nextLine();

        System.out.println("Enter your password: "); 
        password = input.nextLine();

        System.out.println("Your name is " + name); 
        System.out.println("Your password is " + password); 

    }
}
