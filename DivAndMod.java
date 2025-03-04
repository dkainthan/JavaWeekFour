import java.util.*;
public class DivAndMod { 
    public static void main(String[]args){
        int num1; 
        int num2; 
        int answer1;
        int answer2; 
        int answer3;
        int answer4; 

        Scanner input = new Scanner(System.in); 
        System.out.println("Enter an integer"); 
        num1 = input.nextInt();

        System.out.println("Enter an integer: "); 
        num2 = input.nextInt(); 
        System.out.println("Enter a second integer: "); 

        answer1 = num1/num2; 
        answer2 = num1 % num2; 
        answer3 = num2/num1;
        answer4 = num2 % num1;

        System.out.println(answer1); 
        System.out.println(answer2); 
        System.out.println(answer3); 
        System.out.println(answer4); 
        




    
        
    }
    
}
