package game;

import java.util.Random;
import java.util.Scanner;

public class FindMe {

	public static void main(String[] args) {
		Scanner EnterDirection = new Scanner(System.in);
		Random randomPostion = new Random();
		int PositionX = randomPostion.nextInt(10) + 1;
		int PositionY = randomPostion.nextInt(10) + 1;

		int PlayerPosStartY = 5;
		int PlayerPosStartX = 5;
		
		System.out.println("\"look\" for the Treasure using the Magical Compass, to guide you to Unlimited wealth \n type \"Begin\" to commence your adventure");
		String Begin = EnterDirection.next("Begin");
		System.out.println("Grey foggy clouds float oppressively close to you, \r\n"
				+ "reflected in the murky grey water which reaches up your shins.\r\n"
				+ "Some black plants barely poke out of the shallow water.\r\n"
				+ "Try \"north\", \"south\", \"east\", or \"west\"\r\n" + " \n PLEASE Type \"Go\" then ENTER YOUR FIRST COMMAND!!");
		while (PlayerPosStartY != PositionY || PlayerPosStartX != PositionX) {
			String Direction = EnterDirection.nextLine();
			switch (Direction) {
			case "North":
				PositionY++;
				break;
			case "South":
				PositionY--;
				break;
			case "East":
				PositionX--;
				break;
			case "West":
				PositionX++;
				break;
			}

			int x = PositionX - PlayerPosStartX;
			int y = PositionY - PlayerPosStartY;
			float distance = (float) Math.sqrt(x * x + y * y);
			// DecimalFormat distance2 = new distance.DecimalFormat("#.00");

			System.out.println("The Dial reads '" + distance + "m'");
			System.out.println("North, South, East Weast?");
		}

		System.out.println();
		if (PlayerPosStartX == PositionX && PlayerPosStartY == PositionY) {
			System.out.println("You see a box sitting on the plain.   Its filled with treasure!  You win!  The end.");
		}
	}

}
