package PreparationInterro;

public class Statue extends Oeuvre {
    private float hauteur;
    private float largeur;
    private float profondeur;
    private String matiere;

    public Statue(String nom, String description, float hauteur, float largeur, float profondeur, String matiere) {
        super(nom, description);
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.profondeur = profondeur;
        this.matiere = matiere;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(float profondeur) {
        this.profondeur = profondeur;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "Statue{" +
                "hauteur=" + hauteur +
                ", largeur=" + largeur +
                ", profondeur=" + profondeur +
                ", matiere='" + matiere + '\'' +
                "} " + super.toString();
    }
}
