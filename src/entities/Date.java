package entities;

import java.util.Scanner;

public class Date {
	private int j,m,a;
	//CONTRUCTEUR
	public Date() {}
	
	//GETTERS & SETTERS
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	//FONCTIONS
	public void ajoutDate()
	{
		int jour,mois,annee;
		Scanner sc = new Scanner(System.in);
		System.out.println("SAISIR JOUR: ");
		jour = sc.nextInt();
		this.setJ(jour);
		System.out.println("SAISIR MOIS: ");
		mois = sc.nextInt();
		this.setM(mois);
		System.out.println("SAISIR ANNEE: ");
		annee = sc.nextInt();
		this.setA(annee);
		
	}
	public void afficherDate()
	{
		System.out.println("DATE DE NAISSANCE: "+this.getJ()+"/"+this.getM()+"/"+this.getA());
	}
	
}
