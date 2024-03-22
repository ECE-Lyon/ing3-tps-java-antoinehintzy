package Interro;

public class Ampoule extends Accessoire {
    private int rouge;
    private int vert;
    private int bleu;
    private int puissance;

    public Ampoule(int id, int nom, int rouge, int vert, int bleu, int puissance) {
        super(id, nom);
        this.rouge = rouge;
        this.vert = vert;
        this.bleu = bleu;
        this.puissance = puissance;
    }

    public int getRouge() {
        return rouge;
    }

    public void setRouge(int rouge) {
        this.rouge = rouge;
    }

    public int getVert() {
        return vert;
    }

    public void setVert(int vert) {
        this.vert = vert;
    }

    public int getBleu() {
        return bleu;
    }

    public void setCouleur(int rouge, int vert, int bleu) {
        this.rouge = rouge;
        this.vert = vert;
        this.bleu = bleu;
    }

    public void setBleu(int bleu) {
        this.bleu = bleu;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public void allumer() {
        this.puissance = 65;
    }

    @Override
    public void eteindre() {
        this.puissance = 0;
    }

    @Override
    public String toString() {
        return "Ampoule{" +
                "rouge=" + rouge +
                ", vert=" + vert +
                ", bleu=" + bleu +
                ", puissance=" + puissance +
                ", id=" + id +
                ", nom=" + nom +
                '}';
    }
}
