package com.bridgelabz.fp;

import java.util.Random;

public class TicTacToe {
	
	
	static int board[]= {0,1,2,3,4,5,6,7,8};
	  public static Random random() {
	    	Random rand =new Random();
	    	return rand;
	    }
	  /**
	   * Creating the Tic Tac Toe board
	   * @param board2
	   */
public	static void show(int[] board2) {
		System.out.println(board[0]+"  |  "+board[1]+"  |  "+board[2]);
		System.out.println("---|-----|----");
		System.out.println(board[3]+"  |  "+board[4]+"  | "+board[5]);
		System.out.println("---|-----|----");
		System.out.println(board[6]+"  |  "+board[7]+"  | "+board[8]);
return;	
}
/**
* 
* @param Character:-X\O
* @param spot1:-positions Spot1  
* @param spot2:-Positions Spot2
* @param spot3:-Positions Spot3
* @return :-Check all Character in three position are Same
*/
public static boolean checkline(char Character,int spot1,int spot2,int spot3) {
	if (board[spot1]==Character && board[spot2]==Character && board[spot3]==Character) {
		 return true;
	}
		return true;
}
/**
* Creating an Various conditions
* @param Character
* @return
*/
public static  boolean checkall(char Character) {
	if(checkline(Character,0,1,2)) {
		return true;
	}
	if(checkline(Character,3,4,5)) {
		return true;
	}
	if(checkline(Character,6,7,8)) {
		return true;
	}
	if(checkline(Character,0,3,6)) {
		return true;
	}
	if(checkline(Character,1,4,7)) {
		return true;
	}
	if(checkline(Character,2,5,8)) {
		return true;
	}
	if(checkline(Character,0,4,8)) {
		return true;
	}
	if(checkline(Character,2,4,6)) {
		return true;
	}


return true;

}
}
