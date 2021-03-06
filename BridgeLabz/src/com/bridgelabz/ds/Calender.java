package com.bridgelabz.ds;

import java.util.Scanner;

public class Calender {
	
	static String months[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
	static int noOfDaysOfMonths[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	static int cal[][]=new int[6][7];
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	/*int month=Integer.parseInt(args[0]);
	int year=Integer.parseInt(args[1]);*/
	int month=s.nextInt();
	int year=s.nextInt();
	printCalendar(month,year);
	s.close();
}

private static void printCalendar(int month, int year) {
    creatCalendar(month,year);
    System.out.println();
    System.out.println(months[month-1]+", "+year);
    System.out.println("sun\tmon\ttue\twed\tthr\tfri\tsat");
    for(int i=0;i<6;i++)
    {
    	for(int j=0;j<7;j++)
    	{
    		if(cal[i][j]==0)
    			System.out.print(" \t");
    		else if(cal[i][j]<10)
    			System.out.print("0"+cal[i][j]+"\t");
    		else
    			System.out.print(cal[i][j]+"\t");
    	}
    	System.out.println();
    }
}
public static int findFirstDay(int day, int month, int year) {
	int y=year-(14-month)/12;
	int x=y+y/4-y/100+y/400;
	int m=month+12*((14-month)/12)-2;
	int d=(day+x+(31*m)/12)%7;
	return d;
}

public static boolean isLeapYear(int year) {
	return (year%400==0 || (year%100!=0&&year%4==0));
}

private static void creatCalendar(int month, int year)
{
	if(isLeapYear(year))
    {
    	noOfDaysOfMonths[1]=29;
    }
    int firstdayOfWeek=findFirstDay(1,month,year);
    int d=0;
    s:
	for(int i=0;i<6;i++)
	{
		for(int j=firstdayOfWeek;j<7;j++)
		{
			d++;
			cal[i][j]=d;
			if(d==noOfDaysOfMonths[month-1])
				break s;
		}
		firstdayOfWeek=0;
	}
}

}
