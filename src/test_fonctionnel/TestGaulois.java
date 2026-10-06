package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romains;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obélix",16);
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		Romains minus = new Romains("Minus", 6);
		System.out.println("Dans la forêt "+ asterix +" et "+ obelix +"tombent nez à nez sur le romain" + minus);
		for(int i=0;i<3;i++) {
			asterix.frapper(minus);
		}
	}

	private static void Gaulois(String string, int i) {
		// TODO Auto-generated method stub
		
	}
}
