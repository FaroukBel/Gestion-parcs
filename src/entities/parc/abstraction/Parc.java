package entities.parc.abstraction;

import entities.vehicule.types.Voiture;

import java.util.ArrayList;

public class Parc {
    String nom;
    String adresse;
    int nbrPlaces;
    int nbrPlacesDispo;

    ArrayList<Voiture> voitures = new ArrayList<>();

    public Parc() {
    }
    public Parc(String nom, String adresse, int nbrPlaces, int nbrPlacesDispo) {
        this.nom = nom;
        this.adresse = adresse;
        this.nbrPlaces = nbrPlaces;
        this.nbrPlacesDispo = nbrPlacesDispo;
    }

    @Override
    public String toString() {
        return "Parc{" + "nom=" + nom + ", adresse=" + adresse + ", nbrPlaces=" + nbrPlaces + ", nbrPlacesDispo=" + nbrPlacesDispo + '}';
    }

    public void ajouterVoiture(Voiture voiture) {
        try {
            if (voitures.size() == nbrPlaces) {
                throw new Exception("Parc plein");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        voitures.add(voiture);
    }

    public void listerVoitures() {
        for (Voiture v : voitures) {
            System.out.println(v);
        }
    }

    public void listerVoituresParMarque(String marque) {
        for (Voiture v : voitures) {
            if (v.getMarque().equals(marque)) {
                System.out.println(v);
            }
        }
    }
}
