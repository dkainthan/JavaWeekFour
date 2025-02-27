//Diya Kainthan 2/27/2025 - Temp Converter

import java.util.*;
public class TempConverter {
    public static void main(String[]args){
        double fahrenheit;
        double celciusTemp;
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the Fahreniheit Temperature: ");
        fahrenheit = input.nextDouble();
        celciusTemp = 5.0/9.0 * (fahrenheit - 32.0); 
        System.out.println("Your temperature is " + celciusTemp + " in celcius");
    }
}
