import java.util.Scanner;

// Maurice walked us through much of this after class

public class Lab2AdventureState {
	
	public static void main(String[] args) {
		int state = 0;
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		boolean continueGame = true;
		
		while (continueGame) {
			switch (state) {
			case 0:
				System.out.println("Welcome! There is a door!  1. Open Door \t 2. Do not open door");
				choice = scan.nextInt();
				if (choice == 1) {
					//change state = 1
					state = 1;
				} 
				else {
					//change state = 2
					state = 2;
					break;
				}

			case 1:
				System.out.println("Door is open 1. Turn on light \t 2. Stay in the dark.");
				if (choice == 1) {
					//change state = 2
					state = 2;
					break;
				} 
				else {
					state = 5;
					break;
				}

			case 2:
				System.out.println("Storm hit. You were struck by lightning - GAME OVER");
				state = 4;
				break;

			case 3:
				System.out.println("You found the pot of gold! YOU WIN");
				state = 4;
				break;

			case 4:
				//GAME OVER
				continueGame = false;
			}
		}
		
		
		
		scan.close();
	}

}
