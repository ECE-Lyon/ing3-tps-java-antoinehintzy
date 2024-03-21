package PreparationInterro;

public class Tableau extends Oeuvre {
    private float hauteur;
    private float largeur;
    boolean paysage;

    public Tableau(String nom, String description, float hauteur, float largeur, boolean paysage) {
        super(nom, description);
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.paysage = paysage;
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

    public boolean isPaysage() {
        return paysage;
    }

    public void setPaysage(boolean paysage) {
        this.paysage = paysage;
    }

    @Override
    public String toString() {
        return "Tableau{" +
                "hauteur=" + hauteur +
                ", largeur=" + largeur +
                ", paysage=" + paysage +
                "} " + super.toString();
    }
}
