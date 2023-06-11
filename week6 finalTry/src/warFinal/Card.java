package warFinal;

public class Card {

/*Create the following fields: value, name. 
 * Note: included field suit for the suits such as Ace, CLubs, Hearts...
 * Note: Make use of modifiers
 */

	
	private int value; 
	private String name;
	private int suit; 

	
	public Card(int suit, int value) {
		this.suit = suit;
		this.value = value;
		this.name = name;
		
	} 

//Getters and setters used:
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}
	

/**Methods
 * Create describe method to print out card information.
 * Used a string builder for card description. 
 */
	public void describe() {
		System.out.println(toString());
		}
	
	public String toString() {
	StringBuilder cardDescription = new StringBuilder(); 
		
	if (value == 11) {
		cardDescription.append("Jack");
	} else if (value == 12) {
		cardDescription.append("Queen");
	} else if (value == 13) {
		cardDescription.append("King");
	} else if (value == 14) {
		cardDescription.append("Ace");
	} else {
		cardDescription.append(value);
	}
	
	cardDescription.append(" of ");

	if(suit == 1) {
		cardDescription.append("Diamonds");
	} else if (suit == 2) {
		cardDescription.append("Hearts");
	} else if (suit == 3) {
		cardDescription.append("Clubs");
	} else if (suit == 4) {
		cardDescription.append("Spades");
	} else {
		return name;
	}
	
	name = cardDescription.toString();	
	return name;
	}

}

