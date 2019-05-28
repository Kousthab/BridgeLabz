package com.bridgelabz.oops.DeckOfCards;

public interface DeckOfCards {
	
	public abstract String[] getCards();
	public abstract void shuffleCards();
	public abstract String[][] distributeCards(int noOfCards,int noOfPlayers);
	public abstract void showCards(String[][] playerCards);

}
