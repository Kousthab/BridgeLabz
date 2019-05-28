package com.bridgelabz.fp;


import java.util.Random;
import java.util.Scanner;

public class TicTacToeRunner {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int [] board={0,1,2,3,4,5,6,7,8};
		/**
		 * Getting Two inputs one from Computer and other from Us
		 */
		while(true) {
			 int ip=s.nextInt();
			 if(board[ip]!='X' && board[ip]!='O') {
				 board[ip]='X';
			if (TicTacToe.checkall('X')==true){
				System.out.println("_____Xwins_____");
		break;
			}	 
				
			 while(true) {
			 Random rand=TicTacToe.random();
			 int oppent=rand.nextInt(8);
			 if(board[oppent]!='X' && board[oppent]!='O' ) {
				 board[oppent]='O';
				 if (TicTacToe.checkall('O')==true){
						System.out.println("_____Owins_____");
					break;
				 }break;
				 }
		 }
			 }else {
				 System.out.println("THE SPOT IS TAKEN");}
			 }TicTacToe.show(board);
			 
		s.close();

	}
		
		
}


