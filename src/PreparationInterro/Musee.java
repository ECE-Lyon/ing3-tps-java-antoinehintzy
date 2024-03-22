package PreparationInterro;

import java.util.ArrayList;
import java.util.List;

public class Musee {
    private String nom;
    private List<SalleExpo> salles;

    public Musee(String nom) {
        this.nom = nom;
        this.salles = new ArrayList<SalleExpo>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void addSalle(int numero, float superficie) {
        this.salles.add(new SalleExpo(numero, superficie));
    }

    @Override
    public String toString() {
        return "Musee{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
