import java.util.*;
public class Election {
    public static void main(String[]args) {
        int Awbrey_nyVotes; 
        int Awbrey_njVotes; 
        int Awbrey_conneticutVotes; 
        int Martinez_nyVotes; 
        int Martinez_njVotes;
        int Martinez_conneticutVotes; 
        int totalAwbrey; 
        int totalMartinez; 
        double percentageAwbrey; 
        double percentageMartinez; 
        int totalVotes;

        Scanner input = new Scanner(System.in); 
        System.out.println("Enter Awbrey's New York Votes: "); 
        Awbrey_nyVotes = input.nextInt();

        System.out.println("Enter Awbrey's New Jersey Votes: "); 
        Awbrey_njVotes = input.nextInt();

        System.out.println("Enter Awbrey's Conneticut Votes: "); 
        Awbrey_conneticutVotes = input.nextInt();

        
        System.out.println("Enter Martinez's New York Votes: "); 
        Martinez_nyVotes = input.nextInt();

        System.out.println("Enter Awbrey's New Jersey Votes: "); 
        Martinez_njVotes = input.nextInt();

        System.out.println("Enter Awbrey's Conneticut Votes: "); 
        Martinez_conneticutVotes = input.nextInt();


        totalAwbrey = Awbrey_nyVotes + Awbrey_njVotes + Awbrey_conneticutVotes; 
        totalMartinez = Martinez_nyVotes + Martinez_njVotes + Martinez_conneticutVotes; 
        totalVotes = Awbrey_nyVotes + Awbrey_njVotes + Awbrey_conneticutVotes + Martinez_nyVotes + Martinez_njVotes + Martinez_conneticutVotes; 
        percentageAwbrey = totalAwbrey/totalVotes; 
        percentageMartinez = totalMartinez/totalVotes; 

       System.out.println("Awbrey's total votes are " + totalAwbrey + "and the percentage she has is " + percentageAwbrey); 

    }
    
}
