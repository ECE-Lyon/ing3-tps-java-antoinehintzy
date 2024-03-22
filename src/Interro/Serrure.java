package Interro;

public class Serrure extends Accessoire {
    private boolean estVerrouillee;

    public Serrure(int id, int nom, boolean estVerrouillee) {
        super(id, nom);
        this.estVerrouillee = estVerrouillee;
    }

    public boolean isEstVerrouillee() {
        return estVerrouillee;
    }

    public void verrouiller() {
        this.estVerrouillee = true;
    }
    public void deverrouiller() {
        this.estVerrouillee = false;
    }

    @Override
    public void eteindre() {
        this.verrouiller();
    }
}
