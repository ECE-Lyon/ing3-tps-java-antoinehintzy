package Interro;

public class Radiateur extends Accessoire {
    private float temperature;
    private float temperatureCible;
    private boolean marche;

    public Radiateur(int id, int nom, float temperature, float temperatureCible) {
        super(id, nom);
        this.temperature = temperature;
        this.temperatureCible = temperatureCible;
        this.marche = false;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperatureCible() {
        return temperatureCible;
    }

    public void setTemperatureCible(float temperatureCible) {
        this.temperatureCible = temperatureCible;
    }

    public boolean isMarche() {
        return marche;
    }

    public void setMarche(boolean marche) {
        this.marche = marche;
    }

    public void allumer() {
        this.setMarche(true);
    }
    @Override
    public void eteindre() {
        this.setMarche(false);
    }

    @Override
    public String toString() {
        return "Radiateur{" +
                "temperature=" + temperature +
                ", temperatureCible=" + temperatureCible +
                ", marche=" + marche +
                "} " + super.toString();
    }
}
