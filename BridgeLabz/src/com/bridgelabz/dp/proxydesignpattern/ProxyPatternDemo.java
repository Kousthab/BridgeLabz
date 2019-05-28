package com.bridgelabz.dp.proxydesignpattern;

public class ProxyPatternDemo {
	
	public static void main(String[] args) {
		CommandExecuter ce=new CommandExecutorProxy("John", "123");
		
		try {
			ce.runCommand("ls");
			ce.runCommand("rm");
		} catch (Exception e) {
			System.out.println("Exception Msg: "+e.getMessage());
			e.printStackTrace();
		}
	}

}
