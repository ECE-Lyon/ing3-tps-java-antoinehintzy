package Interro;

import java.util.ArrayList;
import java.util.List;

public class Habitation {
    private String nom;
    private List<Utilisateur> utilisateurs;
    private List<Piece> pieces;

    public Habitation(String nom, Utilisateur utilisateur) {
        this.nom = nom;
        this.utilisateurs = new ArrayList<>();
        this.utilisateurs.add(utilisateur);
        this.pieces = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public void addUtilisateur(Utilisateur utilisateur) {
        this.utilisateurs.add(utilisateur);
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }

    public void addPiece(String nom) { // Composition, on crée en même temps qu'on ajoute
        this.pieces.add(new Piece(nom));
    }

    @Override
    public String toString() {
        return "Habitation{" +
                "nom='" + nom + '\'' +
                ", utilisateurs=" + utilisateurs +
                ", pieces=" + pieces +
                '}';
    }
}
