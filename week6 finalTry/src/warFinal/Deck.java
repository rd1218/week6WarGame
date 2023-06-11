package warFinal;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//Note: Make use of modifiers
	
	private List<Card> cards;
	
	
/*In the constructor, when a new Deck is instantiated, 
 * the Cards field should be populated with the standard 52 cards. */
	public Deck() {
		
		cards = new ArrayList<Card>();
		for(int s = 1; s < 5; s++) {
		for(int i = 2; i < 15; i ++) {
			cards.add(new Card(s,i));
			}
		}
	}

/* Methods: Shuffle to randomize cards, draw to remove and return
 * the top care of the cards field.
 */
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}

	public Card draw(){
			Card card = this.cards.remove(0);
			return card;
	}	

}
