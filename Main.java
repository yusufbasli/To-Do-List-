import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. ArrayList for storing missions.
        ArrayList<String> missions = new ArrayList<>();

        // 2. Building a scanner for user's inputs.
        Scanner scanner = new Scanner(System.in);

        boolean programActive = true;
        // printing Menu to the screen.
        while (programActive) {
        System.out.println("------To-Do List Tracker-----");
        System.out.println(" 1 : Add mission ");
        System.out.println(" 2 : List active missions ");
        System.out.println(" 3 : Close ");
        System.out.println("------- your choose :---------");
        // taking user input.
        int input = scanner.nextInt();
        scanner.nextLine();
        switch(input) {
        // Adding missions.
        case 1 : 
        	System.out.println("Please write down the missions you want to add.");
        	String nextMission = scanner.nextLine();
        	missions.add(nextMission);
        	System.out.println("'" + nextMission + " succuesfully added to the list.' ");
        	break;
        case 2 :
        	System.out.println("Here is your To-Do List :");
        	if (missions.isEmpty()) {
        		System.out.println("Your To-Do List is empty!");
        	}
        	else {
        	for (int i = 0; i < missions.size() ; i++) {
        		System.out.println((1 + i) + "." + missions.get(i));
        	}
        	}
        	break;
        case 3 :
        	programActive = false ;
        	break;
        
        default :
        	System.out.println(" Please choose from only 1 , 2 ,3 !");
        	break;
        	
        }  
        }
        scanner.close();
    }
}

