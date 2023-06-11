package warFinal;

import java.util.List;

public class Player {
	
	//Note: Make use of modifiers	
	
/* Create the following fields: hand, score, name. Make sure you
*set the the constructor to zero for score. For hand don't forget
*list of card to set up.
*/


	private List<Card> hand;
	private int score;
	private String name;
	private int topCard;
	

	public Player(String name, List<Card> hand) {
		this.name = name;
		this.hand = hand;
		getHand();
	}
	
	
/**Methods: describe to print out information about the player and
 * calls the describe method for each card, flip to remove card and
 * return top card of the hand. draw to take deck as argument and 
 * method on deck, adding returned card to hand field.
 * Increment score to add 1 to player's score field.
 */

	public void describe() {
		System.out.println(name + " has " + score + " points.");	
		if (hand.isEmpty()) {
			System.out.println(name + " has no cards");
		} else {
			System.out.println(name + " cards: ");
		for(Card card: hand) {
			card.describe();
		}
	}
	}
	

	public Card flip() {
		int topCard = 0;
		if (topCard < hand.size()) {
			return hand.get(topCard++);
		} else {
			return null;		
	}
	}
	
	public Card removeTopCard() {
		return hand.remove(topCard);
	}
	

	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}
	

	public int incrementScore() {
		return score ++;
	}
	
//Getters and Setters
	
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 	

}