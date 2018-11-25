package Problem7;

import java.util.Scanner;

public class TacketSeller {
	
	public static int totalTicket = 100;
	public static int calculate(int ticket){
		
		totalTicket -= ticket;
		return totalTicket;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int buyer = 0;
		int sold = 0;
		
		while(sold < totalTicket)
		{
			int ticket = in.nextInt();
			if(ticket > 4)
			{
				System.out.println("Each Buyer can as many as 4 tickets");
				continue;
			}
			else if(ticket > (totalTicket-sold))
			{
				System.out.println("The number of remaining tickets only : " + (totalTicket-sold));
				continue;
			}
				
			buyer++;
			sold += ticket;
			System.out.println("The number of remaining tickets : " + (totalTicket-sold));
			
		}
		
		System.out.println("The number of buyers : " + buyer);
	}

}
