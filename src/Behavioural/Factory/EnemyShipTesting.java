package Behavioural.Factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("What type of ship? (u/r)");
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;
		
		if (userInput.hasNextLine()){
			String typeOfShip = userInput.nextLine();
			//Client doesn't have to worry about creating object. That onus is 
			//taken by the factory object. 
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
			
			if(theEnemy != null){
				doStuffEnemy(theEnemy);
				
			} else {
				System.out.print("Please enter U, R, or B next time");
			}
		
		}
		userInput.close();
	}
	
	private static void doStuffEnemy(EnemyShip theEnemy) {
		theEnemy.displayEnemyShip();
		theEnemy.followHeroShip();
		theEnemy.enemyShipShoots();
	}

}
