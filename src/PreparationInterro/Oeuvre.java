package PreparationInterro;

public class Oeuvre {
    protected String nom; // Les attributs d'une classe mère ne sont pas automatiquement protected.
    // Il peut être intéressant de les laisser privés jusqu'à ce qu'on en ait besoin dans les classes filles.
    protected String description;
    protected Artiste artiste;

    public Oeuvre(String nom, String description, Artiste artiste) {
        this.nom = nom;
        this.description = description;
        this.artiste = artiste;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Artiste getArtiste() {
        return artiste;
    }

    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    @Override
    public String toString() {
        return "Oeuvre{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
