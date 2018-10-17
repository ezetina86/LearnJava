package com.amazon;

import java.util.Scanner;

public class AmazonViewer {

	private static Scanner keyboardInput;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----------------------------------------");
		System.out.println("Amazon Viewer");
		System.out.println("Welcome!");
		System.out.println("Version BETA 2018.10.17-001");
		System.out.println("By: Enrique Zetina");
		System.out.println("-----------------------------------------");	

		int  exit =0;

		do {
			keyboardInput = new Scanner(System.in);

			System.out.println("");

			System.out.println("MENU");
			System.out.println("");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Exit");

			System.out.println("Choose one option: ");

			int input = keyboardInput.nextInt();

			switch(input) {
			case 0 :
				System.out.println("Bye!");
				System.out.println("Power by @ezetina");
				exit=0;
				break;				
			case 1:
				System.out.println("You're in Movies");
				System.out.println("");
				exit=1;
				break;
			case 2:
				System.out.println("You're in Series");
				System.out.println("");
				exit=1;
				break;
			case 3:
				System.out.println("You're in Books");
				System.out.println("");
				exit=1;
				break;
			case 4:
				System.out.println("You're in Magazines");
				System.out.println("");
				exit=1;
				break;
			default:
				System.out.println("Not valid option try again!");
				System.out.println("");
				exit=1;

			}
		}

		while (exit != 0);	

	}

}
