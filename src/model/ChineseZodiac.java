package model;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("entrez une ann�e svp:");		
		int year = input.nextInt();	
		System.out.println("Vous avez entr� "+ year);
		
		int x = year % 12;
		switch (x) {
		
		case 0:
			System.out.println("Vous �tes un : Singe");
		break;
		
		case 1:
			System.out.println("Vous �tes un : Rosster");
		break;
		case 2:
			System.out.println("Vous �tes un : Chien");
		break;
		case 3:
			System.out.println("Vous �tes un : Porc!");
		break;
		
		case 4:
			System.out.println("Vous �tes un : Rat");
		break;
		
		case 5:
			System.out.println("Vous �tes un : Ox");
		break;
		
		case 6:
			System.out.println("Vous �tes un : Tigre GRR!");
		break;
		
		case 7:
			System.out.println("Vous �tes un : Lapin");
		break;
		
		case 8:
			System.out.println("Vous �tes un : Dragon");
		break;
		
		case 9:
			System.out.println("Vous �tes un : Serpent");
		break;
		
		case 11:
			System.out.println("Vous �tes un : Cheval");
		break;
		
		case 12:
			System.out.println("Vous �tes un : Mouton");
		break;
		default: 
			System.out.println("vous avez entrez une valeur n�gative");
		}
		
		input.close();
	}

}
