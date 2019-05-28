package com.bridgelabz.ds;

public class SBPUsingSS {
	
	
	//parentheses Pair checking
	 boolean isMatchingPair(char c1,char c2){
		if(c1=='('&&c2==')')
			return true;
		else if(c1=='{'&&c2=='}')
			return true;
		else if(c1=='['&&c2==']')
			return true;
		else
			return false;
	}
	
	boolean isBalancedParen(String exp){
		char[] ch=exp.toCharArray();
		SimpleStack ss=new SimpleStack();
		
		for(int i=0;i<exp.length();i++){
			//if either opening braces  push to stack
			if(ch[i]=='('||ch[i]=='{'||ch[i]=='['){
				ss.cpush(ch[i]);
			}
			//if either closing brace(s), follows:
			if(ch[i]==')'||ch[i]=='}'||ch[i]==']'){
				//if ')' without '(' check
				if(ss.isEmpty()){
					return false;}
				else if(isMatchingPair(ss.cpop(),ch[i])!=true){
					return false;}
			}
			
		}
		//balanced
		if(ss.isEmpty())
			return true;
		//Not Balanced
		else{
			return false;
		}
		
	}

}
