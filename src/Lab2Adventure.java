import java.util.Scanner;

public class Lab2Adventure {

	public static void main(String[] args) {
		boolean playing = true;
//		boolean slaying = true;
//		int Round = 1;
//		double swingCheck = (int) Math.floor(Math.random()*100);
//		boolean youhit = true;
//		double damageThisRound = (int) Math.floor(Math.random()*5 + 1);
//		double totalDamage = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is your name, combatant? ");
		String name = scan.nextLine();
		name = name.trim();
		
		System.out.print("\nHello " + name + ". Welcome to Dragon Slayer IX!\n\n");
		
		System.out.println("Let's get started by choosing your weapon.\n");
		
		while(playing){
			System.out.println("Do you choose [Butter Knife], [Slingshot], or [Crossbow]? ");
//			System.out.println(" or [Sword]?");
			String weaponChoice = scan.nextLine();
			
			if(!(weaponChoice.equalsIgnoreCase("Butter Knife")||weaponChoice.equalsIgnoreCase("Slingshot")
					||weaponChoice.equalsIgnoreCase("Crossbow")||weaponChoice.equalsIgnoreCase("Sword"))){
				System.out.println("You must pick a valid weapon from the list.");
				continue;
			}
			else if (weaponChoice.equalsIgnoreCase("Butter Knife")||weaponChoice.equalsIgnoreCase("Slingshot")){
				System.out.println("Questionable choice! You know you'll be fighting dragons right?\nAnyhoo...\n");
			} //make fun of the user for their poor choice of equipment
			
			System.out.println("You're immediately teleported to an arena where a mighty dragon awaits your challenge!");
			System.out.println("Do you [Fight] or [Run Away]? ");
			String playerChoice = scan.nextLine();  //two choices available.  Hint: you must Fight or you'll die
			
			if (playerChoice.equalsIgnoreCase("Fight")){
				System.out.println("That's the spirit!\n"); //#Encouragement
			} else if (playerChoice.equalsIgnoreCase("run")||playerChoice.equalsIgnoreCase("run away")){
				System.out.println("While attempting to run like a ninny, you were burninated forever...  --GAME OVER");
			} else{
				System.out.println("WRONG ANSWER! You were burninated forever...  --GAME OVER");
			}
		
			
			while (playerChoice.equalsIgnoreCase("Fight") || playerChoice == "Fight"){
				if (weaponChoice.equalsIgnoreCase("Butter Knife")||weaponChoice.equalsIgnoreCase("Slingshot")){
					System.out.println("The Dragon laughs at your attempt to attack with a " + weaponChoice +".");
					System.out.println("You are burninated. Further, the dragon took your " + weaponChoice + ". HA!");
					System.out.println("You lose!");
					break;
				} //Further penalize the player for their poor choice of weapons.  They lose the game.
				
				// section of code allowing for 2 options within core game play
				if (weaponChoice.equalsIgnoreCase("Crossbow")){
					System.out.println("Oh no! You only have 1 bolt left!");
					System.out.println("Take the shot?");
					playerChoice = scan.nextLine();
					
					if (playerChoice.equalsIgnoreCase("yes")||playerChoice.equalsIgnoreCase("y")){
						System.out.println("You fire your only bolt and it misses, flying past the dragon!");
						System.out.println("Lucky for you the bolt ricochets off of a rock and hits the dragon in the head.");
						System.out.println("You have slain the dragon! Congratulations!");
						playerChoice = "Not Fight";
					}
					else{
						System.out.println("The dragon takes your " + weaponChoice + " from you.  And then you were burninated.");
						System.out.println("You lose!");
						break;
					}
				}
				
//				//core game play begins here currently not fully functional
//				if (weaponChoice.equalsIgnoreCase("Sword")){
//					while (slaying){
//					    System.out.println("Round " + Round + ": You swing your sword at the dragon!");
//					    Round++;
//					    
//					    if (swingCheck > 25){
//					        System.out.println("You successfully hit the dragon and dealt " + damageThisRound + " damage!");
//					 
//					        totalDamage += damageThisRound;
//					        
//					        if (totalDamage >= 10){
//					            System.out.println("You have dealt " + totalDamage + " total damage during the battle!");
//					            System.out.println("You have slain the dragon!  YOU WIN!!!");
//					            slaying = false;
//					        }
//					    }
//					    else {
//					    	System.out.println("You missed! Thus, you were burninated.  GAME OVER");
//					    	slaying = false;
//					    }
//					}
//				}
				
				System.out.println("Battle another dragon? (y/n)");
				playerChoice = scan.nextLine();
				
				if (playerChoice.equalsIgnoreCase("yes")||playerChoice.equalsIgnoreCase("y")){
					System.out.println("Great! Would you like to choose a new weapon?");
					playerChoice = scan.nextLine();
					if (playerChoice.equalsIgnoreCase("yes")||playerChoice.equalsIgnoreCase("y")){
						System.out.println("Do you choose [Butter Knife], [Slingshot], [Crossbow], or [Sword]? ");
						weaponChoice = scan.nextLine();
					} else{
						System.out.println("Your " + weaponChoice + " should still work just fine!");
					}
					playerChoice = "Fight"; // back up to fight another dragon with specified weapon
				}
				else{
					System.out.println(">:-(\t...\t....");
					System.out.println("Oh no! ... A dragon snuck up and you were burninated! \n\n--GAME OVER--");
					playerChoice = "Not Fight"; // end game.  go to replay prompt
				}
			}
			
			System.out.print("\nWould you like to play again? ");
			playerChoice = scan.nextLine();
					
			if (playerChoice.equalsIgnoreCase("yes")||playerChoice.equalsIgnoreCase("y")){
				System.out.println("Great!\n");
				playing = true;  // back up to weapon selection
			}
			else{
				playing = false; // end game, go to goodbye statement
			}
		}
		
		System.out.println("Thanks for playing.");
		scan.close();
	} // end of program

}
