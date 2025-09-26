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
        System.out.println(" 3 : Choose a mission number to remove it from the list ");
        System.out.println(" 4 : Close ");
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
        		System.out.println((1 + i) + ")" + missions.get(i));
        	}
        	}
        	break;
        case 3 : 
        	System.out.println("Please write the number of mission that you want to remove: ");
        	int inputRemove = scanner.nextInt();
        	scanner.nextLine();
        	// check if given number is in missions if yes remove it.
        	if (inputRemove > 0 && inputRemove <= missions.size() ) {
        		System.out.println(inputRemove + " . mission succesfully deleted.");
        		missions.remove(inputRemove - 1);
        	}
        	
        	else {
        		System.out.println("Given number is not in the list! ");
        	}
        
        
            break;
        case 4 :
        	System.out.println("Program closing thanks for using :) ");
        	programActive = false ;
        	break;
        
        default :
        	System.out.println(" Please choose from only 1 , 2 ,3 , 4 !");
        	break;
        	
        }  
        }
        scanner.close();
    }
}


