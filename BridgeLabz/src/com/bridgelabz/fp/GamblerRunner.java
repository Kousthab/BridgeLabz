package com.bridgelabz.fp;

import java.util.Scanner;

public class GamblerRunner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your goal");
		int goal=s.nextInt();
		Gambler gambler=new Gambler();
		gambler.gambler(goal);
		s.close();
	}

}
