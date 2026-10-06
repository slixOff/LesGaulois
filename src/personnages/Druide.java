package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	private void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		System.out.println("J'ai conococté"+quantite+"doses de potion magique. Elle a une force de "+forcePotion+".");
		
	}
	
	private void booster(Gaulois gauloi) {
		if (chaudron.resterPotion()){
			String nomGaulois = gauloi.getNom();
			if (nomGaulois=="Obélix") {
				parler("Non, "+ nomGaulois +"Non !... Et tu le sais très bien !");
			}
			else {
				int forcePotion=chaudron.prendreLouche();
				if(forcePotion>0) {
				gauloi.boirePotion(forcePotion);
				}
				else {
					
				}
			}
		}
	}
	@Override
	public String toString() {
		return "Druide [nom=" + nom + "]";
	}
}
