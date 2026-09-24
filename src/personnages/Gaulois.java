package personnages;

public class Gaulois {
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	private String nom;
	private int force;
	
	public void parler(String texte) {
		System.out.println(prendreParole() + nom + " : ");
		
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public String getNom() {
		return nom;
	}
	
}
