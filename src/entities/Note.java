package entities;
import java.util.Scanner;

public class Note {
	private int valNote,refMatiere;
	//CONSTRUCTEUR
	public Note() {}

	//GETTERS & SETTERS
	public int getValNote() {
		return valNote;
	}

	public void setValNote(int valNote) {
		this.valNote = valNote;
	}

	public int getRefMatiere() {
		return refMatiere;
	}

	public void setRefMatiere(int refMatiere) {
		this.refMatiere = refMatiere;
	}
	
	public void saisirNote()
	{
		int reference,valnote;
		Scanner sc = new Scanner(System.in);
		System.out.println("SAISIR LA REFERENCE DE LA MATIERE");
		reference = sc.nextInt();
		this.setRefMatiere(reference);
		System.out.println("SAISIR LA NOTE DE L'ETUDIANT");
		valnote = sc.nextInt();
		this.setValNote(valnote);
	}
	public void afficherNote()
	{
		System.out.println(this.getValNote());
	}
	
	
}
