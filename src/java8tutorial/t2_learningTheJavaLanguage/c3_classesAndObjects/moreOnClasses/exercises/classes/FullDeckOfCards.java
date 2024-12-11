package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.moreOnClasses.exercises.classes;

public class FullDeckOfCards {

	static final String[] suits = {"C", "Q", "F", "P"};
	static final String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
	
	public static int getRandomNumber(int min, int max) {
		// max never comes out (exclusive upper bound)
	    return (int) ((Math.random() * (max - min)) + min);
	}
	
	private PlayingCard[] fullDeck = new PlayingCard[52];
	
	
	public FullDeckOfCards() {
		// shuffle cards and queue them
		for (String suit : suits) {
			for (String rank : ranks) {
				int position = 0;
				while (fullDeck[position]!=null) {
					System.out.println("position " + position + " already taken");
					// max never comes out (exclusive upper bound)
					position = getRandomNumber(1, 52);
				}
				System.out.println("placing " + suit + "-" + rank + " at position " + position);
				
				PlayingCard card = new PlayingCard(rank, suit);
				fullDeck[position] = card;
			}
		}
	}
	
	public void printCardDeck() {
		int position = 0;
		for (PlayingCard card : fullDeck) {
			System.out.println("position " + (++position) + " holds " + card.print());
		}
	}
}
