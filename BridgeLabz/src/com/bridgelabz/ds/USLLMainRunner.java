package com.bridgelabz.ds;

import java.util.Scanner;

public class USLLMainRunner {

	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		GenericSLL<String> usll=new GenericSLL<String>();
		String d=DSUtility.readFileAsString("/home/user/BridgeLabz-workspace/mno.txt");
		String s[]=d.split("\\W+");
		for(String x:s){
			usll.insert(x);
		}
		usll.show();
		System.out.println();
		System.out.println("Enter the Item you Want to search: ");
		String item=scanner.next();
		
		System.out.println(usll.search(item));
		
		if(usll.search(item)==true){
			usll.delete(item);
		}
		else{
			usll.insert(item);
		}
		usll.show();
		/*File file=new File("C:\\Users\\koust\\Desktop\\abc1.txt");
		//flag is set to true so that it will not override
		FileOutputStream fos=new FileOutputStream(file,true);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(usll);
		oos.close();
		fos.close();*/
		scanner.close();
	}

}
