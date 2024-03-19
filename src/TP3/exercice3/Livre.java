package TP3.exercice3;

public class Livre {
    private int nbPages;
    private String isbn;
    private Auteur auteur;

    public Livre(int nbPages, String isbn, Auteur auteur) {
        this.nbPages = nbPages;
        this.isbn = isbn;
        this.auteur = auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "nbPages=" + nbPages +
                ", isbn='" + isbn + '\'' +
                ", auteur=" + auteur +
                '}';
    }
}
