package personnages;

import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;
	private Village village;
	
	public void setVillage(Village village) {
		
	}
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}
	@Override
	public String toString() {
		return "Gaulois ["+ nom +"]";
	}
	public void frapper(Romains romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		int forceCoup = (force*effetPotion)/3;
		romain.recevoirCoup(forceCoup);
		if(effetPotion>1) {
			effetPotion=effetPotion-1;
		}
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
	}
	
	public void sePresenter() {
		if(village==null) {
			parler("Bonjour, je m'appelle "+nom+". Je voyage de villages en villages.");
		}
		else if(village.getChef()==nom) {
			parler("Bonjour, je m'appelle "+nom+". Je suis le chef le village : "+village.getNom()+".");
		}
		else {
			parler("Bonjour, je m'appelle "+nom+". J'habite le village : "+village.getNom()+".");
		}
	}
}