package entities;

import java.util.Scanner;

public class Menu {

	public Menu() {
	}
	// FONCTIONS

	public int menuEtudiant() {
		int choix;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------- GESTION ETUDIANT -------");
			System.out.println("1- Afficher la liste des Etudiants");
			System.out.println("2- Ajout Etudiant");
			System.out.println("3- Modifier Etudiant");
			System.out.println("4- Rechercher Etudiant");
			System.out.println("5- Supprimer Etudiant");
			System.out.println("6- RETOUR");
			choix = sc.nextInt();
			if (choix < 1 || choix > 6) {
				System.out.println("CHOIX INDISPONIBLE");
			}
		} while (choix < 1 || choix > 6);
		return choix;
	}

	public int menuMatiere() {
		int choix;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------- GESTION MATIERE -------");
			System.out.println("1- Afficher la liste des matieres");
			System.out.println("2- Ajout Matiere");
			System.out.println("3- Modifier Matiere");
			System.out.println("4- Rechercher Matiere");
			System.out.println("5- Supprimer Matiere");
			System.out.println("6- RETOUR");
			choix = sc.nextInt();
			if(choix < 1 || choix > 6)
			{
				System.out.println("CHOIX INDISPONIBLE!!!");
			}
		} while (choix < 1 || choix > 6);
		return choix;
	}

	public int menuClasse() {
		int choix;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------- GESTION CLASSE -------");
			System.out.println("1- Afficher la liste des Classes");
			System.out.println("2- Ajout Classe");
			System.out.println("3- Modifier Classe");
			System.out.println("4- Rechercher Classe");
			System.out.println("5- Supprimer Classe");
			System.out.println("6- RETOUR");
			choix = sc.nextInt();
			if(choix < 1 || choix > 6)
			{
				System.out.println("CHOIX INDISPONIBLE!!!");
			}
		} while (choix < 1 || choix > 6);
		return choix;
	}

	public int menuNote() {
		int choix;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------- GESTION NOTES -------");
			System.out.println("1- Afficher la liste des Notes");
			System.out.println("2- Ajout Note");
			System.out.println("3- Modifier Note");
			System.out.println("4- Rechercher Note");
			System.out.println("5- Supprimer Note");
			System.out.println("6- RETOUR");
			choix = sc.nextInt();
			if(choix < 1 || choix > 6)
			{
				System.out.println("CHOIX INDISPONIBLE!!!");
			}
		} while (choix < 1 || choix > 6);
		return choix;
	}

	public int menuPrincipal() {
		int choix;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1- GESTION ETUDIANTS");
			System.out.println("2- GESTION MATIERES");
			System.out.println("3- GESTION CLASSES");
			System.out.println("4- GESTION NOTES");
			System.out.println("5- QUITTER");
			choix = sc.nextInt();
			if (choix < 1 || choix > 5) {
				System.out.println("CHOIX INDISPONIBLE");
			}
		} while (choix < 1 || choix > 5);

		return choix;

	}
}
