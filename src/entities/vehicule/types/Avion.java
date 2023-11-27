package entities.vehicule.types;

import entities.vehicule.abstraction.Vehicule;
import utils.MoteurAvion;

public class Avion extends Vehicule {
    MoteurAvion moteur;
    Long heuresVols;

    public Avion() {
    }
    public Avion(MoteurAvion moteur, Long heuresVols) {
        this.moteur = moteur;
        this.heuresVols = heuresVols;
    }
}
