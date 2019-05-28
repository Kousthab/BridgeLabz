package com.bridgelabz.ds;

import java.util.Scanner;

public class CalenderQueue {
	
		public static void main(String[] args) {
			/*int month=Integer.parseInt(args[0]);
			int year=Integer.parseInt(args[1]);*/
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Month: ");
			int month=s.nextInt();
			System.out.println("Enter Year: ");
			int year=s.nextInt();
			Week<Integer,Integer> q=new Week<>();
			printCalendar(month,year,q);
			s.close();
		}

		private static void printCalendar(int month, int year, Week<Integer, Integer> q) {
			creatCalendar(month,year,q);
			System.out.println(Calender.months[month-1]+", "+year);
		    System.out.println("sun\tmon\ttue\twed\tthr\tfri\tsat");
		    int dayOfWeek=Calender.findFirstDay(1,month,year);
		    int i=0,k=0;
			for(int j=1;j<=Calender.noOfDaysOfMonths[month-1]+dayOfWeek;j++)
			{
				if(i<dayOfWeek)
				{
					System.out.print(" \t");
					i++;
				}
				else
					System.out.print(q.dequeue()+"\t");
				k++;
				if(k>6)
			    {
					System.out.println();
					k=0;
				}
			}
			
		}
		private static void creatCalendar(int month, int year, Week<Integer, Integer> q)
		{
			if(Calender.isLeapYear(year))
		    {
		    	Calender.noOfDaysOfMonths[1]=29;
		    }
		    int dayOfWeek=Calender.findFirstDay(1,month,year);
			for(int j=1;j<=Calender.noOfDaysOfMonths[month-1];j++)
			{
				q.enqueue(dayOfWeek,j);
				dayOfWeek++;
				if(dayOfWeek>6)
				     dayOfWeek=0;
			}
		}
	}
	class WeekDay<D,DT>
	{
		D day;
		DT date;
		WeekDay<D,DT> Next;
	}
	class Week<D,DT>
	{
		WeekDay<D,DT> head;
		public void enqueue(D day,DT date)
		{
			WeekDay<D,DT> n=new WeekDay<>();
			n.day=day;
			n.date=date;
			
			if(head==null)
				head=n;
			else
			{
				WeekDay<D,DT> n1=head;
				while(n1.Next!=null)
				{
					n1=n1.Next;
				}
				n1.Next=n;
			}
		}
		public DT dequeue()
		{
			WeekDay<D,DT> n=head;
			head=head.Next;
			DT temp=n.date;
			n=null;
			return temp;
		}

}

