/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Scanner;

/**
 *
 * @author ZAHRA
 */
public class Classe {
    
    private String niveau,nom;
    private int code;
    //CONSTRUCTOR

    public Classe() {}
    //GETTERS & SETTERS

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    //FONCTIONS
    public void ajoutClasse()
    {
        String nomMat,niveauMat;
        int codeMat;
        Scanner sc = new Scanner(System.in);
        System.out.println("VEUILLEZ SAISIR LE CODE DE LA CLASSE:");
        codeMat = sc.nextInt();
        this.setCode(codeMat);
        System.out.println("VEUILLEZ SAISIR LE NOM DE LA CLASSE:");
        nomMat = sc.nextLine();
        this.setNom(nomMat);
        System.out.println("VEUILLEZ SAISIR LE NIVEAU DE LA CLASSE:");
        niveauMat = sc.nextLine();
        this.setNiveau(niveauMat);
        sc.close();
    }
    public void afficheMatiere()
    {
        System.out.println("CODE: "+this.getCode());
        System.out.println("NOM: "+this.getNom());
        System.out.println("NIVEAU: "+this.getNiveau());
    }
    
    
}
