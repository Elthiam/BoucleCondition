package model;

import java.util.Scanner;

public class DeninezLeChiffre {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("Choisissez un nombre entre 0 et 10 svp:");
		
		int nombre = input.nextInt();
		System.out.println("vous avez entré: "+ nombre);
		
		int aleatoire = (int)(Math.random() * 10);
		System.out.println("le nombre aléatoire est: "+ aleatoire);
		

		
		if (nombre<aleatoire)
		{
			System.out.println("Trop Petit");
		}
		
		else if (nombre>aleatoire)
		{
			System.out.println("Trop Grand");
		}
		
		else 
			
		{
			System.out.println("c'est bon");
		}	

	}

}
