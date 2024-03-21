package PreparationInterro;

public class Oeuvre {
    protected String nom;
    protected String description;
    protected Artiste artiste;

    public Oeuvre(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }
    public Oeuvre(String nom, String description, Artiste artiste) {
        this(nom, description);
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
