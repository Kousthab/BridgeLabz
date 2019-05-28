package com.bridgelabz.dp.proxydesignpattern;

public class CommandExecuterImpl implements CommandExecuter {

	@Override
	public void runCommand(String cmd) throws Exception {
		Runtime.getRuntime().exec(cmd);
		System.out.println("Command: "+cmd+"Executed");
		
	}

}
