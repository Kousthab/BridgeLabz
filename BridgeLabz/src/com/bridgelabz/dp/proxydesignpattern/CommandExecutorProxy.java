package com.bridgelabz.dp.proxydesignpattern;

	

public class CommandExecutorProxy implements CommandExecuter {

	private boolean isAdmin;
	private CommandExecuter executor;
	
	public CommandExecutorProxy(String user, String pwd){
		if("John".equals(user) && "1234".equals(pwd)) isAdmin=true;
		executor = new CommandExecuterImpl();
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin){
			executor.runCommand(cmd);
		}else{
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.runCommand(cmd);
			}
		}
	}

}



