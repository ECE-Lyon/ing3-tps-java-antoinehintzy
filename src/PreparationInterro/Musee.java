package PreparationInterro;

import java.util.ArrayList;
import java.util.List;

public class Musee {
    private String nom;
    private List<SalleExpo> salles;

    public Musee(String nom, int nbSalles) {
        this.nom = nom;
        this.salles = new ArrayList<SalleExpo>();
        for (int i = 0; i < nbSalles; i++) {
            this.salles.add(new SalleExpo(i + 1)); // on pourrait demander la superficie au clavier.
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void ajouterSalle(SalleExpo salle) {
        this.salles.add(salle);
    }

    @Override
    public String toString() {
        return "Musee{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
