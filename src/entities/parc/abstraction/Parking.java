package entities.parc.abstraction;

import entities.vehicule.types.Voiture;

import java.util.ArrayList;
import java.util.List;

class PlaceParkingInsuffisanteException extends Exception {
    public PlaceParkingInsuffisanteException(String message) {
        super(message);
    }
}

class VoitureDejaGareeException extends Exception {
    public VoitureDejaGareeException(String message) {
        super(message);
    }
}

public class Parking {
    private int capaciteMaximale;
    private List<Voiture> voituresGarees;

    public Parking(int capaciteMaximale) {
        this.capaciteMaximale = capaciteMaximale;
        this.voituresGarees = new ArrayList<>();
    }

    public void garerVoiture(Voiture voiture) throws PlaceParkingInsuffisanteException, VoitureDejaGareeException {
        if (voituresGarees.size() >= capaciteMaximale) {
            throw new PlaceParkingInsuffisanteException("Le parking est complet. Impossible de garer la voiture "+ voiture.getMarque() + " " + voiture.getImmatriculation());
        }

        if (voituresGarees.stream().anyMatch(v -> v.getImmatriculation().equals(voiture.getImmatriculation()))) {
            throw new VoitureDejaGareeException("La voiture " + voiture.getMarque() + " " + voiture.getImmatriculation() + " est déjà présente dans le parking.");
        }

        voituresGarees.add(voiture);
        System.out.println("La voiture " + voiture.getMarque() + " " + voiture.getImmatriculation() + " a été garée avec succès.");
    }

    public void retirerVoiture(String plaqueImmatriculation) {
        voituresGarees.removeIf(v -> v.getImmatriculation().equals(plaqueImmatriculation));
        System.out.println("La voiture avec la plaque d'immatriculation " + plaqueImmatriculation + " a été retirée du parking.");
    }
}
