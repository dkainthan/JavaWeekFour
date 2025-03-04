import java.util.*;
public class Election {
    public static void main(String[]args) {
        double Awbrey_nyVotes; 
        double Awbrey_njVotes; 
        double Awbrey_conneticutVotes; 
        double Martinez_nyVotes; 
        double Martinez_njVotes;
        double Martinez_conneticutVotes; 
        double totalAwbrey; 
        double totalMartinez; 
        double percentageAwbrey; 
        double percentageMartinez; 
        double totalVotes;

        Scanner input = new Scanner(System.in); 
        System.out.println("Enter Awbrey's New York Votes: "); 
        Awbrey_nyVotes = input.nextDouble();

        System.out.println("Enter Awbrey's New Jersey Votes: "); 
        Awbrey_njVotes = input.nextDouble();

        System.out.println("Enter Awbrey's Conneticut Votes: "); 
        Awbrey_conneticutVotes = input.nextDouble();

        
        System.out.println("Enter Martinez's New York Votes: "); 
        Martinez_nyVotes = input.nextDouble();

        System.out.println("Enter Awbrey's New Jersey Votes: "); 
        Martinez_njVotes = input.nextDouble();

        System.out.println("Enter Awbrey's Conneticut Votes: "); 
        Martinez_conneticutVotes = input.nextDouble();


        totalAwbrey = Awbrey_nyVotes + Awbrey_njVotes + Awbrey_conneticutVotes; 
        totalMartinez = Martinez_nyVotes + Martinez_njVotes + Martinez_conneticutVotes; 
        totalVotes = Awbrey_nyVotes + Awbrey_njVotes + Awbrey_conneticutVotes + Martinez_nyVotes + Martinez_njVotes + Martinez_conneticutVotes; 
        percentageAwbrey = (totalAwbrey/totalVotes) * 100; 
        percentageMartinez = (totalMartinez/totalVotes) * 100; 

       System.out.println("Candidate                    Votes       Percentage"); 
       System.out.println("Awbrey                    " + totalAwbrey + "     " + percentageAwbrey);  
       System.out.println("Martinez                  " + totalMartinez + "    " + percentageMartinez); 
       System.out.println("Total Votes:      " + totalVotes); 


    }
    
}
