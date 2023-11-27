package entities.vehicule.types;

import entities.vehicule.abstraction.Vehicule;
import entities.vehicule.api.VehiculeCourse;
import utils.Brands;

import java.time.LocalDate;
import java.util.Objects;

public class Voiture extends Vehicule implements VehiculeCourse {

    Double cylindree;
    Long kilometrage;
    Double puissance;
    Long nbPortes;

    public Voiture() {
    }
    public Voiture (Double prixAchat, LocalDate dateAchat, String marque, Double cylindree, Long kilometrage, Double puissance, Long nbPortes) {
        super.setDateAchat(dateAchat);
        super.setMarque(marque);
        super.setPrixAchat(prixAchat);
        this.cylindree = cylindree;
        this.kilometrage = kilometrage;
        this.puissance = puissance;
        this.nbPortes = nbPortes;
    }

    @Override
    public Double calculerPrixCourant() {
        int annees = LocalDate.now().getYear() - super.getDateAchat().getYear();
        int tranches = kilometrage.intValue() / 10000;
        double resultat = 0;
        if (Objects.equals(super.getMarque(), Brands.RENAULT.toString()) || Objects.equals(super.getMarque(), Brands.PEUGEOT.toString())) {
            resultat = super.getPrixAchat() - (super.getPrixAchat() * 2 / 100 * annees) - (super.getPrixAchat() * 5 / 100 * tranches) - (super.getPrixAchat() * 20 / 100);
        }

        resultat =  super.getPrixAchat() - (super.getPrixAchat() * 2 / 100 * annees) - (super.getPrixAchat() * 5 / 100 * tranches) - (super.getPrixAchat() * 5 / 100) - (super.getPrixAchat() * 10 / 100);
        if (resultat < 0) {
            return 0.0;
        }
        return resultat;
    }
    @Override
    public boolean possedeNitro() {
        return false;
    }

    @Override
    public void listerSponsors() {
        System.out.println("Sponsor 1");
        System.out.println("Sponsor 2");
        System.out.println("Sponsor 3");
    }

    @Override
    public int nbrParticipants() {
        return 3;
    }

    @Override
    public String conducteur() {
        return "Farouk";
    }


    @Override
    public String toString() {
        return "{\n" + " date d'achat= "+ super.getDateAchat() +" ,\n prix d'achat= "+ super.getPrixAchat() + " DH,\n marque= " + super.getMarque() + ",\n cylindree= " + cylindree + ",\n kilometrage= " + kilometrage + ",\n puissance= " + puissance + ",\n nbPortes= " + nbPortes + "\n}\n";
    }

}
