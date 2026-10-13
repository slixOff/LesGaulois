package test_fonctionnel;

import personnages.Chaudron;
import personnages.Druide;
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
		Romains brutus = new Romains("Brutus",14);
		Chaudron chaudron = new Chaudron(0,1);
		Druide panoramix = new Druide("Panoramix",3,chaudron);
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		for(int i=0;i<3;i++) {
			asterix.frapper(brutus);
		}
	}

	private static void Gaulois(String string, int i) {
		// TODO Auto-generated method stub
		
	}
}
