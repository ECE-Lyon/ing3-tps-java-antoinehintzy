package Interro;

public abstract class Accessoire {

    protected int id;
    protected int nom;

    public Accessoire(int id, int nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public abstract void eteindre();

    @Override
    public String toString() {
        return "Accessoire{" +
                "id=" + id +
                ", nom=" + nom +
                '}';
    }
}
