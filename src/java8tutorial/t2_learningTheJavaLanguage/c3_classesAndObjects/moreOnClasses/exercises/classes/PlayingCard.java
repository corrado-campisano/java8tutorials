package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.moreOnClasses.exercises.classes;

public class PlayingCard {
	private String rank; 
	private String suit;
	
	public PlayingCard(String rank, String suit) {
		this.setRank(rank); this.setSuit(suit);
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String print() {
		return suit + " - " + rank;
	}
}
