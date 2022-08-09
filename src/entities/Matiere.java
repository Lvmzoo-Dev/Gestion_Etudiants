package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matiere {
	private int ref, coeff;
	private String libelle;
	private Note noteMat = new Note();
	public List<Note> listNote = new ArrayList<>();

	// CONSTRUCTEUR
	public Matiere() {
	}

	// GETTERS & SETTERS
	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getCoeff() {
		return coeff;
	}

	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void ajoutMatiere() {
		int ref, coef;
		String lib;
		Scanner sc = new Scanner(System.in);
		System.out.println("AJOUTER MATIERE");
		System.out.println("SAISIR LE LIBELLE DE LA MATIERE");
		lib = sc.nextLine();
		this.setLibelle(lib);
		System.out.println("SAISIR LA REFERENCE DE LA MATIERE");
		ref = sc.nextInt();
		this.setRef(ref);
		System.out.println("SAISIR LE COEFFICIENT DE LA MATIERE");
		coef = sc.nextInt();
		this.setCoeff(coef);
	}

	public void afficherMatiere() {
		System.out.println("REFERENCE: " + this.getRef());
		System.out.println("LIBELLE: " + this.getLibelle());
		System.out.println("COEFFICIENT: " + this.getCoeff());
	}

	public void ajouterNote() {
		Scanner sc = new Scanner(System.in);
		this.noteMat.saisirNote();
		listNote.add(this.noteMat);
	}

	public void afficherNoteMatiere() {
		System.out.println("MATIERE: " + this.getLibelle());
		for (int i = 0; i < listNote.size(); i++) {
			listNote.get(i).afficherNote();
		}
	}

	public void modifieEtu() {
		int choix;
		Scanner sc = new Scanner(System.in);
		this.afficherMatiere();
		System.out.println("QUE VOULEZ-VOUS MODIFER");
		System.out.println("1-REFRENCE");
		System.out.println("2-LIBELLE");
		System.out.println("3-COEFFICIENT");
		choix = Integer.parseInt(sc.nextLine());

		switch (choix) {
			case 1:
				int ref;
				System.out.println("SAISIR NOUVELLE REFERENCE");
				ref = sc.nextInt();
				this.setRef(ref);
				System.out.println("REFRENCE DE LA MATIERE MODIFIE AVEC SUCCES!!");
				break;
			case 2:
				String lib;
				System.out.println("SAISIR NOUVEAU LIBELLE");
				lib = sc.nextLine();
				this.setLibelle(lib);
				System.out.println("LIBELLE DE LA MATIERE MODIFIE AVEC SUCCES!!");
				break;
			case 3:
				int coeff;
				System.out.println("SAISIR NOUVEAU COEFFICIENT");
				coeff = sc.nextInt();
				this.setCoeff(coeff);
				System.out.println("COEFFICIENT DE LA MATIERE MODIFIE AVEC SUCCES!!");
				break;
		}
	}
}
