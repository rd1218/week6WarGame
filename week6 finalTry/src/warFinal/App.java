package warFinal;

import java.util.ArrayList;
import java.util.List;


public class App {

	public static void main(String[] args) {
		
/*Instantiate a Deck and two Players, call the shuffle method on 
the deck.*/

		Deck newDeck = new Deck();
		List<Card> hand1 = new ArrayList<Card>();
		List<Card> hand2 = new ArrayList<Card>();
		
		Player playerA = new Player("Player 1", hand1);
		Player playerB = new Player("Player 2", hand2);

		newDeck.shuffle();
		
/*Using a traditional for loop, iterate 52 times calling the 
 * Draw method on the other player each iteration using the 
 * Deck you instantiated.*/
		
		
		for(int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
			playerA.draw(newDeck);
		} else {
		playerB.draw(newDeck);
		}
	}
		
		
/*Using a traditional for loop, iterate 26 times and call the 
 * flip method for each player.*/
		
		for(int f = 0; f < 26; f++) {
		
			playerA.flip();
			playerB.flip();		
			
			System.out.println("\n****************");
			
			
/*Compare the value of each card returned by the two player’s 
* flip methods. Call the incrementScore method on the player 
* whose card has the higher value. 
* Note: add sysout to keep track of scores*/
			
			if(playerA.flip().getValue() > playerB.flip().getValue() ) {
				playerA.incrementScore();
			} else if(playerB.flip().getValue() > playerA.flip().getValue()) {
				playerB.incrementScore(); 
			} else {
				
			}
			
			System.out.println(playerA.getName() + ": " + playerA.getScore() + " points.");
			System.out.println(playerB.getName() + ": " + playerB.getScore() + " points.");

			playerA.removeTopCard();
			playerB.removeTopCard();
			 
			System.out.println("\nPlayers hands: ");
			System.out.println("\nPlayer 1: ");
			playerA.describe();
				
			System.out.println("\nPlayer 2: ");
			playerB.describe();
		}
		
/* Print the final score of each player and either 
 * “Player 1”, “Player 2”, or “Draw” depending on which 
 * score is higher or if they are both the same.
 */
		if(playerA.getScore() > playerB.getScore()) {
			System.out.println("\nPlayer 1"+ " " + "Score:"+ playerA.getScore());
		} else if (playerA.getScore() < playerB.getScore()) {
			System.out.println("\nPlayer 2" + " " + "Score:"+ playerB.getScore());
		} else {
			System.out.println("\nDraw");
		}
		
		
	}

}
