package com.bridgelabz.oops.DeckOfCards;

import java.util.Random;

public class Cards implements DeckOfCards {
	
	private String[] suits= {"Clubs","Diamond","Heart","Spades"};
	private String[] ranks= {"2","3","4","5","6","7","8","9","10","Ace","Queen","King","Jack"};
	private String[] cards=new String[52];
	@Override
	public String[] getCards() {
		int i=0;
		for(String suit:suits) {
			for(String rank:ranks) {
				cards[i]=rank+"-"+suit;
				i++;
			}
		}
		return cards;
	}
	@Override
	public void shuffleCards() {
		Random rand=new Random();
		
		for(int i=0;i<cards.length;i++)
		{
			int index=rand.nextInt(52);
			String temp=cards[index];
			cards[index]=cards[i];
			cards[i]=temp;
		}
		
	}
	@Override
	public String[][] distributeCards(int noOfPlayers, int noOfCards) {
		String[][] playerCards=new String[noOfPlayers][noOfCards];
		int k=0;
		for(int i=0;i<noOfPlayers;i++) {
			for(int j=0;j<noOfCards;j++) {
				playerCards[i][j]=cards[k];
				k++;
			}
		}
		return playerCards;
	}
	@Override
	public void showCards(String[][] playerCards) {
		int i = 1;
		for (String[] playerCard : playerCards) {
			System.out.println();
			System.out.println("player :" + (i++) + " cards : ");

			for (String card : playerCard) {
				System.out.print(card + "  ");
			}
			System.out.println();

}
		/*for(int i=0;i<playerCards.length;i++) {
			for(int j=0;j<playerCards.length;j++) {
				System.out.print(playerCards[i][j]);
			}
			System.out.println();
		}*/
		
		
	}
	

}
