package PreparationInterro;

import java.util.ArrayList;
import java.util.List;

public class SalleExpo {
    private int numero;
    private float superficie;
    private List<Oeuvre> oeuvres;

    public SalleExpo(int numero, float superficie) {
        this.numero = numero;
        this.superficie = superficie;
        this.oeuvres = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public void addOeuvre(Oeuvre oeuvre) {
        this.oeuvres.add(oeuvre);
    }

    @Override
    public String toString() {
        return "SalleExpo{" +
                "numero=" + numero +
                ", superficie=" + superficie +
                '}';
    }
}
