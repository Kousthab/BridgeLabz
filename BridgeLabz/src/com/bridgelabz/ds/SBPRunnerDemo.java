package com.bridgelabz.ds;

public class SBPRunnerDemo {
	
	public static void main(String[] args) {
		String exp="(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
		SBPUsingSS sbp=new SBPUsingSS();
		boolean rs=sbp.isBalancedParen(exp);
		if(rs)
			System.out.println("Expression is balanced");
		else
			System.out.println("Expression is not balanced");
	}
	
}
