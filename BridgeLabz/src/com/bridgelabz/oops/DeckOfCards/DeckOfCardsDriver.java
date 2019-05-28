package com.bridgelabz.oops.DeckOfCards;


import java.util.Scanner;

public class DeckOfCardsDriver {
	public static void main(String[] args) {
		Cards c=new Cards();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of players: ");
		int nplayers=s.nextInt();
		System.out.println("Enter the number of Cards: ");
		int scards=s.nextInt();
		c.getCards();
		c.shuffleCards();
		String[][] playerCards=c.distributeCards(nplayers,scards);
		//Arrays.sort(playerCards);
		c.showCards(playerCards);
		s.close();
		
		
		
	}

}
