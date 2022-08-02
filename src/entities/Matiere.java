package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matiere {
	private int ref,coeff;
	private String libelle;
	private Note noteMat = new Note();
	public List<Note> listNote = new ArrayList<>();
	//CONSTRUCTEUR
	public Matiere() {}
	//GETTERS & SETTERS
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
	
	public void ajoutMatiere()
	{
		int ref,coef;
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
	public void afficherMatiere()
	{
		System.out.println("REFERENCE: "+this.getRef());
		System.out.println("LIBELLE: "+this.getLibelle());
		System.out.println("COEFFICIENT: "+this.getCoeff());
	}
	public void ajouterNote()
	{
		Scanner sc = new Scanner(System.in);
		this.noteMat.saisirNote();
		listNote.add(this.noteMat);
	}
	public void afficherNoteMatiere()
	{
		System.out.println("MATIERE: "+this.getLibelle());
		for (int i = 0; i < listNote.size(); i++) {
			listNote.get(i).afficherNote();
		}
	}
}
