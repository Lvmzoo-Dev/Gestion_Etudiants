
import entities.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lamine
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */

	public static Etudiant rechercheEtu(List<Etudiant> listEtu, int n) {
		for (int i = 0; i < listEtu.size(); i++) {
			if (listEtu.get(i).getNumero() == n) {
				return listEtu.get(i);
			}
		}
		return null;
	}

	public static Matiere rechercheMatiere(List<Matiere> mat, int n) {
		for (int i = 0; i < mat.size(); i++) {
			if (mat.get(i).getRef() == n) {
				return mat.get(i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO code application logic here
		List<Etudiant> etu = new ArrayList<>();
		List<Matiere> mat = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Menu m = new Menu();
		int choix, reponse = 2;
		do {
			choix = m.menuPrincipal();
			switch (choix) {
				case 1:// GESTION ETUDIANT
					int choixOption;
					choixOption = m.menuEtudiant();
					do {
						switch (choixOption) {
							case 1:
								if (etu.size() == 0) {
									System.out.println("AUCUN ETUDIANT INSCRIT");
								} else {
									for (int i = 0; i < etu.size(); i++) {
										etu.get(i).afficheEtu();
									}
								}
								do {
									System.out.println("VOULEZ-VOUS CONTINUER ?");
									System.out.println("1-OUI");
									System.out.println("2-NON");
									reponse = sc.nextInt();
									if (reponse != 1 && reponse != 2) {
										System.out.println("CHOIX INDISPONIBLE!!");
									}
								} while (reponse != 1 && reponse != 2);
								break;
							case 2:
								Etudiant e = new Etudiant();
								e.ajoutEtu();
								etu.add(e);
								System.out.println("ETUDIANT AJOUTE AVEC SUCCES!!");
								do {
									System.out.println("VOULEZ-VOUS CONTINUER ?");
									System.out.println("1-OUI");
									System.out.println("2-NON");
									reponse = sc.nextInt();
									if (reponse != 1 && reponse != 2) {
										System.out.println("CHOIX INDISPONIBLE!!");
									}
								} while (reponse != 1 && reponse != 2);
								break;
							case 3:
								// MODIF ETUDIANT
								Etudiant e1 = new Etudiant();
								int n;
								System.out.println("ENTRER LE NUMERO DE L'ETUDIANT A MODIFIER");
								n = sc.nextInt();
								e1 = rechercheEtu(etu, n);
								if (e1 == null) {
									System.out.println("NUMERO INEXISTANT !!");
								} else {
									e1.modifierEtu();
								}

								do {
									System.out.println("VOULEZ-VOUS CONTINUER ?");
									System.out.println("1-OUI");
									System.out.println("2-NON");
									reponse = sc.nextInt();
									if (reponse != 1 && reponse != 2) {
										System.out.println("CHOIX INDISPONIBLE!!");
									}
								} while (reponse != 1 && reponse != 2);
								break;
							case 4:
								Etudiant e2 = new Etudiant();
								int recherche;
								System.out.println("ENTRER LE NUMERO DE L'ETUDIANT A RECHERCHER");
								recherche = sc.nextInt();
								e2 = rechercheEtu(etu, recherche);
								if (e2 == null) {
									System.out.println("NUMERO INEXISTANT !!");
								} else {
									System.out.println("ETUDIANT TROUVE!!");
									e2.afficheEtu();
								}
								do {
									System.out.println("VOULEZ-VOUS CONTINUER ?");
									System.out.println("1-OUI");
									System.out.println("2-NON");
									reponse = sc.nextInt();
									if (reponse != 1 && reponse != 2) {
										System.out.println("CHOIX INDISPONIBLE!!");
									}
								} while (reponse != 1 && reponse != 2);
								break;
							case 5:
								// SUPPRESSION ETUDIANT
								Etudiant e3 = new Etudiant();
								int supp;
								System.out.println("ENTRER LE NUMERO DE L'ETUDIANT A SUPPRIMER");
								supp = sc.nextInt();
								e3 = rechercheEtu(etu, supp);
								if (e3 == null) {
									System.out.println("NUMERO INEXISTANT !!");
								} else {
									for (int i = 0; i < etu.size(); i++) {
										if (etu.get(i).getNumero() == supp) {
											etu.remove(i);
										}
									}
									System.out.println("ETUDIANT SUPPRIME AVEC SUCCES!!");
								}
								do {
									System.out.println("VOULEZ-VOUS CONTINUER ?");
									System.out.println("1-OUI");
									System.out.println("2-NON");
									reponse = sc.nextInt();
									if (reponse != 1 && reponse != 2) {
										System.out.println("CHOIX INDISPONIBLE!!");
									}
								} while (reponse != 1 && reponse != 2);

								break;
							// CASE 6
							case 6:
								choix = m.menuPrincipal();
								break;

							default:
								System.out.println("CHOIX INDISPONIBLE!!!");
								break;
						}

					} while (choixOption < 1 || choixOption > 6 || reponse == 1);
					break;
				case 2:
					do {
						choixOption = m.menuMatiere();
						switch (choixOption) {
							case 1:
								if (mat.size() == 0) {
									System.out.println("LA LISTE DES MATIERES EST VIDE !!");
								} else {
									for (int i = 0; i < mat.size(); i++) {
										mat.get(i).afficherMatiere();
									}
								}
								do {
									System.out.println("VOULEZ-VOUS CONTINUER ?");
									System.out.println("1-OUI");
									System.out.println("2-NON");
									reponse = sc.nextInt();
									if (reponse != 1 && reponse != 2) {
										System.out.println("CHOIX INDISPONIBLE!!");
									}
								} while (reponse != 1 && reponse != 2);
								break;

							case 2:
								Matiere mtr = new Matiere();
								mtr.ajoutMatiere();
								mat.add(mtr);
								System.out.println("MATIERE AJOUTE AVEC SUCCES !!");

								do {
									System.out.println("VOULEZ-VOUS CONTINUER ?");
									System.out.println("1-OUI");
									System.out.println("2-NON");
									reponse = sc.nextInt();
									if (reponse != 1 && reponse != 2) {
										System.out.println("CHOIX INDISPONIBLE!!");
									}
								} while (reponse != 1 && reponse != 2);
								break;
							case 3:
								Matiere m1 = new Matiere();
								int ref;
								System.out.println("ENTRER LA REFERENCE DE LA MATIERE A MODIFIER");
								ref = sc.nextInt();
								m1 = rechercheMatiere(mat, ref);
								if (m1 == null) {
									System.out.println("ERREUR DE REFERENCE OU REFERENCE INEXISTANT");
								} else {
									m1.modifieEtu();
								}
								do {
									System.out.println("VOULEZ-VOUS CONTINUER ?");
									System.out.println("1-OUI");
									System.out.println("2-NON");
									reponse = sc.nextInt();
									if (reponse != 1 && reponse != 2) {
										System.out.println("CHOIX INDISPONIBLE!!");
									}
								} while (reponse != 1 && reponse != 2);
								break;
							case 4:
								Matiere m2 = new Matiere();
								int recherche;
								System.out.println("ENTRER LA REFRENCE DE LA MATIERE A RECHERCHER");
								recherche = sc.nextInt();
								m2 = rechercheMatiere(mat, recherche);
								if (m2 == null) {
									System.out.println("ERREUR DE REFERENCE OU REFERENCE INEXISTANT");
								} else {
									System.out.println("MATIERE TROUVE !!");
									m2.afficherMatiere();
								}
								do {
									System.out.println("VOULEZ-VOUS CONTINUER ?");
									System.out.println("1-OUI");
									System.out.println("2-NON");
									reponse = sc.nextInt();
									if (reponse != 1 && reponse != 2) {
										System.out.println("CHOIX INDISPONIBLE!!");
									}
								} while (reponse != 1 && reponse != 2);
								break;

							case 5:
								Matiere m3 = new Matiere();
								int supp;
								System.out.println("ENTRER LA REFERENCE DE LA MATIERE A SUPPRIMER");
								supp = sc.nextInt();
								m3 = rechercheMatiere(mat, supp);
								if (m3 == null) {
									System.out.println("ERREUR DE REFERENCE OU REFERENCE INEXISTANT");
								} else {
									for (int i = 0; i < mat.size(); i++) {
										if (mat.get(i).getRef() == supp) {
											mat.remove(i);
										}
									}
									System.out.println("MATIERE SUPPRIME AVEC SUCCES!!");
								}
								do {
									System.out.println("VOULEZ-VOUS CONTINUER ?");
									System.out.println("1-OUI");
									System.out.println("2-NON");
									reponse = sc.nextInt();
									if (reponse != 1 && reponse != 2) {
										System.out.println("CHOIX INDISPONIBLE!!");
									}
								} while (reponse != 1 && reponse != 2);
								break;
								//RESTE A FAIRE LES 2 AUTRES {CLASSE ET NOTE}
							default:
								break;
						}

					} while (choixOption < 1 || choixOption > 6 || reponse == 1);
					break;
				case 3:
					m.menuClasse();
					break;
				case 4:
					m.menuNote();
					break;
				case 5:
					System.out.println("AU REVOIR...MERCI !!");
					break;

				default:
					System.out.println("CHOIX INDISPONIBLE");
					break;
			}
			if (reponse == 2) {
				System.out.println("AU REVOIR...MERCI !!");
			}
		} while (choix < 1 || choix > 5 || reponse == 1);

	}

}
