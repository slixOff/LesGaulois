package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;
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
		int forceCoup = force/3;
		romain.recevoirCoup(forceCoup);
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
	}
}