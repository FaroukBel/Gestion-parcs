import entities.parc.abstraction.Parc;
import entities.vehicule.abstraction.Vehicule;
import entities.vehicule.types.Voiture;
import utils.Brands;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Voiture voiture = new Voiture(153000.0, LocalDate.of(2019,1,1), Brands.BMW.toString(), 1.6, 100000L, 100.0, 5L);
        System.out.println("Voiture 1: " + voiture);
        System.out.println("Prix courant: " + voiture.calculerPrixCourant()+ " DH");
        System.out.println("Possede nitro: " + voiture.possedeNitro());
        System.out.println("Liste des sponsors: ");
        voiture.listerSponsors();
        System.out.println("Nombre de participants: " + voiture.nbrParticipants());
        System.out.println("Conducteur: " + voiture.conducteur()+"\n");

        Voiture voiture2 = new Voiture(544000.0, LocalDate.of(2021,1,1), Brands.RENAULT.toString(), 1.6, 150000L, 100.0, 5L);
        System.out.println("Voiture 2: " + voiture2);
        System.out.println("Prix courant: " + voiture2.calculerPrixCourant() + " DH");
        System.out.println("Possede nitro: " + voiture2.possedeNitro());
        System.out.println("Liste des sponsors: ");
        voiture.listerSponsors();
        System.out.println("Nombre de participants: " + voiture2.nbrParticipants());
        System.out.println("Conducteur: " + voiture2.conducteur());

        ArrayList<Voiture> voitures = new ArrayList<>();
        voitures.add(voiture);
        voitures.add(voiture2);
        System.out.println("\nListe des voitures: ");
        for (Voiture v : voitures) {
            System.out.println(v);
        }

        Parc parc = new Parc("Parc 1", "Adresse 1", 2, 2);
        parc.ajouterVoiture(voiture);
        parc.ajouterVoiture(voiture2);
        System.out.println("\nListe des voitures du parc: ");
        parc.listerVoitures();
        System.out.println("\nListe des voitures du parc par marque: ");
        parc.listerVoituresParMarque(Brands.BMW.toString());

    }
}