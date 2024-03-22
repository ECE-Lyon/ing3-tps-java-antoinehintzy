package Interro;

import java.util.ArrayList;
import java.util.List;

public class Piece {
    private String nom;
    private List<Accessoire> accessoires; // Polymorphisme (la liste d'accessoires stockera en réalité des ampoules, serrures et radiateurs)

    public Piece(String nom) {
        this.nom = nom;
        this.accessoires = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Accessoire> getAccessoires() {
        return accessoires;
    }

    public void setAccessoires(List<Accessoire> accessoires) {
        this.accessoires = accessoires;
    }

    public void addAccessoire(Accessoire accessoire) {
        this.accessoires.add(accessoire);
    }

    @Override
    public String toString() {
        return "Piece{" +
                "nom='" + nom + '\'' +
                ", accessoires=" + accessoires +
                '}';
    }
}
