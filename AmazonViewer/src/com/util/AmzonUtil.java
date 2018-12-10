package com.util;

import java.util.Scanner;

public class AmzonUtil {
	public static int validate(int min, int max) {
		Scanner sc = new Scanner(System.in);
		
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("Opcion no valida!");
			System.out.println("Try Again");
		}
		
		int response = sc.nextInt();
		
		while(response < min || response > max) {
			System.out.println("No es una  opcion valida");
			System.out.println("Try Again");
			
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("Opcion no valida!");
				System.out.println("Try Again");
			}
			response = sc.nextInt();
		}
		System.out.println("respuesta:" + response + "\n");
		return response;
	}

}
