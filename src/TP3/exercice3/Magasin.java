package TP3.exercice3;

public class Magasin {
    private String nom;
    private Adresse adresse;
    private Livre[] livres;

    public Magasin(String nom, String rue, String codePostal, String ville, Livre[] livres) {
        this.nom = nom;
        this.adresse = new Adresse(rue, codePostal, ville);
        this.livres = livres;
    }
}
