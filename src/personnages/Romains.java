package personnages;

import objets.Equipement;

public class Romains {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement=0;
	
	public Romains(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		int forceAvant=force;
		force = force - forceCoup;
		if (force>0) {
			parler("Aïe");
		}
		else {
			parler("J'abandonne !");
		}
		assert force<=forceAvant;
	}
	
	public void sEquiper(Equipement equipement) {
		if(nbEquipement==2) {
			System.out.println("Le soldat "+nom+" est déja bien protégé !");
		}
		else if(nbEquipement>0 && equipements[0]==equipement) {
			System.out.println("Le soldat "+nom+" possède déja un "+equipement+" !");
		}
		else {
			System.out.println("Le soldat "+nom+" s'équipe avec un "+equipement+" !");
			equipements[nbEquipement]=equipement;
			nbEquipement++;
		}
	}
	
	private Boolean isInvariantVerified() {
		 return force>=0;
	}
	 
	public static void main(String[] args) {
		Romains minus = new Romains("Minus", 6);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}

