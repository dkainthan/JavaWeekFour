import java.util.*;
import java.text.NumberFormat; 
public class Sleep {
    public static void main(String[]args) {
        int birthYear; 
        int birthMonth; 
        int birthDay; 
        int todayYear; 
        int todayMonth; 
        int todayDay; 
        int daysAlive;
        int hoursSlept; 

        Scanner input = new Scanner(System.in); 
        NumberFormat number = NumberFormat.getIntegerInstance(); 
        System.out.println("Enter your birthyear: "); 
        birthYear = input.nextInt(); 

        System.out.println("Enter your birthmonth: "); 
        birthMonth = input.nextInt(); 

        
        System.out.println("Enter your birthday: "); 
        birthDay = input.nextInt();
        
        System.out.println("Enter today year: "); 
        todayYear = input.nextInt(); 

        System.out.println("Enter today month: "); 
        todayMonth = input.nextInt(); 

        System.out.println("Enter today day: "); 
        todayDay = input.nextInt(); 

        daysAlive = ((todayYear - birthYear) * 365) + ((todayMonth - birthMonth) * 30) + (todayDay - birthDay); 

        hoursSlept = daysAlive * 8; 

        System.out.println("You have been alive for " + (number.format(daysAlive) + " days")); 
        System.out.println("You have slept for " + (number.format(hoursSlept) + " hours")); 




    }
    
}
