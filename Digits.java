//************ Diya Kainthan 2/25/2025 Digits.java - prints out different digit`s of a three digit number***** */
public class Digits {
public static void main(String[]args) {
    int number;
    int ones; 
    int tens; 
    int hundreds; 
    int thousands;
    number = 2580;
    ones = number % 10;
    tens = (number / 10) % 10; 
    hundreds =((number / 10) /10) % 10;
    thousands = (((number/10)/10)/10) % 10; 
    System.out.println("The ones digits is " + ones + " The tens digits is " + tens + " The hundreds digits is " + hundreds + " The thousands place is" + thousands); 

}
}
