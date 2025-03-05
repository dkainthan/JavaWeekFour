import java.util.*; 

public class TimeConversion {
    public static void main(String[]args) {
        int minTime;
        int hour; 
        int minutes;
        
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the time in minutes: "); 
        minTime = input.nextInt(); 

        hour = minTime / 60; 
        minutes = minTime % 60; 
        
        if (minutes > 10) {
            System.out.println("The time is:  " + hour + ":"+ minutes); 
        }
        
        if (minutes < 10) {
            System.out.println("The time is:  " + hour + ":"+ "0" + minutes); 
        }
    

    }
    
}
