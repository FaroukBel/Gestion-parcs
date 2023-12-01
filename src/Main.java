import entities.parc.abstraction.Parking;
import entities.vehicule.abstraction.Vehicule;
import entities.vehicule.types.Voiture;
import utils.Brands;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Voiture voiture = new Voiture(544000.0, LocalDate.of(2015,1,1), Brands.RENAULT.toString(), 1.6, 43000L, 630.0, 2L,"20930-23");
        System.out.println("Voiture 1: " + voiture);
        System.out.println("Prix courant: " + voiture.calculerPrixCourant()+ " DH");
        System.out.println("Possede nitro: " + voiture.possedeNitro());
        System.out.println("Liste des sponsors: ");
        voiture.listerSponsors();
        System.out.println("Nombre de participants: " + voiture.nbrParticipants());
        System.out.println("Conducteur: " + voiture.conducteur()+"\n");

        Voiture voiture2 = new Voiture(544000.0, LocalDate.of(2021,1,1), Brands.CITROEN.toString(), 1.6, 5000L, 990.0, 2L, "56421-34");
        System.out.println("Voiture 2: " + voiture2);
        System.out.println("Prix courant: " + voiture2.calculerPrixCourant() + " DH");
        System.out.println("Possede nitro: " + voiture2.possedeNitro());
        System.out.println("Liste des sponsors: ");
        voiture.listerSponsors();
        System.out.println("Nombre de participants: " + voiture2.nbrParticipants());
        System.out.println("Conducteur: " + voiture2.conducteur());


        Voiture voiture3 = new Voiture(233400.0, LocalDate.of(1998,1,1), Brands.FERRARI.toString(), 1.6, 82000L, 430.0, 2L, "62421-18");
        System.out.println("Voiture 3: " + voiture3);
        System.out.println("Prix courant: " + voiture3.calculerPrixCourant() + " DH");
        System.out.println("Possede nitro: " + voiture3.possedeNitro());
        System.out.println("Liste des sponsors: ");
        voiture.listerSponsors();
        System.out.println("Nombre de participants: " + voiture3.nbrParticipants());
        System.out.println("Conducteur: " + voiture3.conducteur());

        Voiture voiture4 = new Voiture(734000.0, LocalDate.of(2011,1,1), Brands.FIAT.toString(), 1.6, 50000L, 400.0, 4L, "35786-94");
        System.out.println("Voiture 4: " + voiture4);
        System.out.println("Prix courant: " + voiture4.calculerPrixCourant() + " DH");
        System.out.println("Possede nitro: " + voiture4.possedeNitro());
        System.out.println("Liste des sponsors: ");
        voiture.listerSponsors();
        System.out.println("Nombre de participants: " + voiture4.nbrParticipants());
        System.out.println("Conducteur: " + voiture4.conducteur());

        Voiture voiture5 = new Voiture(734000.0, LocalDate.of(2011,1,1), Brands.TESLA.toString(), 1.6, 50000L, 400.0, 4L, "55686-47");
        System.out.println("Voiture 5: " + voiture5);
        System.out.println("Prix courant: " + voiture5.calculerPrixCourant() + " DH");
        System.out.println("Possede nitro: " + voiture5.possedeNitro());
        System.out.println("Liste des sponsors: ");
        voiture.listerSponsors();
        System.out.println("Nombre de participants: " + voiture5.nbrParticipants());
        System.out.println("Conducteur: " + voiture5.conducteur());

        Voiture voiture6 = new Voiture(734000.0, LocalDate.of(2011,1,1), Brands.AUDI.toString(), 1.6, 50000L, 400.0, 4L, "25573-53");
        System.out.println("Voiture 6: " + voiture6);
        System.out.println("Prix courant: " + voiture6.calculerPrixCourant() + " DH");
        System.out.println("Possede nitro: " + voiture6.possedeNitro());
        System.out.println("Liste des sponsors: ");
        voiture.listerSponsors();
        System.out.println("Nombre de participants: " + voiture6.nbrParticipants());
        System.out.println("Conducteur: " + voiture6.conducteur());


        /*
        * Test du parking
        * Garer deux voitures
        * et garer une troisième voiture avec la même plaque d'immatriculation
        * retirer une voiture
        * et garer une quatrième et cinquième voiture
         */


        System.out.println("\nTest du parking 1: \n");

         Parking parking = new Parking(5);
        try {
            parking.garerVoiture(voiture);
            parking.garerVoiture(voiture2);
            parking.garerVoiture(voiture2);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        finally {
            parking.retirerVoiture("56421-34");
            try {
                parking.garerVoiture(voiture2);
                parking.garerVoiture(voiture3);
                parking.garerVoiture(voiture4);
                parking.garerVoiture(voiture5);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }


        /*
        * Test du parking
        * Garer six voitures
        * et tester l'exception de place insuffisante
         */

        System.out.println("\nTest du parking 2:\n");

        Parking parking2 = new Parking(5);
        try {
            parking2.garerVoiture(voiture);
            parking2.garerVoiture(voiture2);
            parking2.garerVoiture(voiture3);
            parking2.garerVoiture(voiture4);
            parking2.garerVoiture(voiture5);
            parking2.garerVoiture(voiture6);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}