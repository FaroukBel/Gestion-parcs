package entities.vehicule.abstraction;

import java.time.LocalDate;

public class Vehicule {

    String marque;
    LocalDate dateAchat;
    Double prixCourant, prixAchat;

    public Vehicule() {
    }
    public Vehicule(String marque, LocalDate dateAchat, Double prixCourant, Double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixCourant = prixCourant;
        this.prixAchat = prixAchat;
    }

    public Double getPrixAchat() {
        return prixAchat;
    }

    public Double getPrixCourant() {
        return prixCourant;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public String getMarque() {
        return marque;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrixAchat(Double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public void setPrixCourant(Double prixCourant) {
        this.prixCourant = prixCourant;
    }

    @Override
    public String toString() {
        return "Vehicule{" + "marque=" + marque + ", dateAchat=" + dateAchat + ", prixCourant=" + prixCourant + ", prixAchat=" + prixAchat + '}';
    }

    public Double calculerPrixCourant() {
       return prixAchat;
    }
}
