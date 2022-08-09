/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lamine
 */
public class Etudiant {

    private int numero;
    private String nom, prenom;
    private String email;
    private Date dateNaiss = new Date();
    private Matiere mat = new Matiere();
    //CONSTRUCTOR

    public Etudiant() {
    }
    //GETTERS & SETTERS

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    //FONCTIONS
    public void ajoutEtu() 
    {
        Scanner sc = new Scanner(System.in);
        String nom, prenom, email;
        Date daten = new Date();
        int numero;
        System.out.println("VEUILLEZ SAISIR VOTRE NUMERO");
        numero = Integer.parseInt(sc.nextLine());
        this.setNumero(numero); 
        System.out.println("VEUILLEZ SAISIR VOTRE PRENOM");
        prenom = sc.nextLine();
        this.setPrenom(prenom);
        System.out.println("VEUILLEZ SAISIR VOTRE NOM");
        nom = sc.nextLine();
        this.setNom(nom);
        System.out.println("VEUILLEZ SAISIR VOTRE EMAIL");
        email = sc.nextLine();
        this.setEmail(email);
        System.out.println("VEUILLEZ SAISIR VOTRE DATE DE NAISSANCE");
        this.dateNaiss.ajoutDate();
    }
    
    public void afficheEtu()
    {
        System.out.println("NUMERO: "+this.getNumero());
        System.out.println("NOM: "+this.getNom());
        System.out.println("PRENOM: "+this.getPrenom());
        System.out.println("MAIL: "+this.getEmail());
        this.dateNaiss.afficherDate();
    }
    
    public void modifierEtu()
    {
    	int choix;
    	Scanner sc = new Scanner(System.in);
    	this.afficheEtu();
    	System.out.println("QUE VOULEZ-VOUS MODIFIER ?");
    	System.out.println("1 - NUMERO");
    	System.out.println("2 - NOM");
    	System.out.println("3 - PRENOM");
    	System.out.println("4 - EMAIL");
    	System.out.println("5 - DATE DE NAISSANCE");
    	choix = Integer.parseInt(sc.nextLine());
    	
    	switch (choix) {
    	case 2:
			String nom;
			System.out.println("SAISIR NOUVEAU NOM");
			nom = sc.nextLine();
			this.setNom(nom);
			System.out.println("NOM DE L'ETUDIANT MODIFIE AVEC SUCCES!!");
			break;
    	case 3:
			String pnom;
			System.out.println("SAISIR NOUVEAU PRENOM");
			pnom = sc.nextLine();
			this.setPrenom(pnom);
			System.out.println("PRENOM DE L'ETUDIANT MODIFIE AVEC SUCCES!!");
			break;
    	case 4:
			String email;
			System.out.println("SAISIR NOUVEAU EMAIL");
			email = sc.nextLine();
			this.setNom(email);
			System.out.println("EMAIL DE L'ETUDIANT MODIFIE AVEC SUCCES!!");
			break;
    	case 5:
			Date d = new Date();
			d.ajoutDate();
			this.setDateNaiss(d);
			System.out.println("DATE DE NAISSANCE DE L'ETUDIANT MODIFIE AVEC SUCCES!!");
			break;
    	case 1:
			int num;
			System.out.println("SAISIR NOUVEAU NUMERO");
			num = sc.nextInt();
			this.setNumero(num);
			System.out.println("NUMERO DE L'ETUDIANT MODIFIE AVEC SUCCES!!");
			break;

		default:
			System.out.println("CHOIX INDISPONIBLE!!!");
			break;
		}
    	
    	
    }
    
    
    
}
   












