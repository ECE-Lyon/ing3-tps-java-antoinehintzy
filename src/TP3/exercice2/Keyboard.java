package TP3.exercice2;

import java.util.Objects;

public class Keyboard {
    private int nbKeys;
    private String disposition;

    public Keyboard(int nbKeys, String disposition) {
        this.nbKeys = nbKeys;
        this.disposition = disposition;
    }

    public int getNbKeys() {
        return nbKeys;
    }

    public void setNbKeys(int nbKeys) {
        this.nbKeys = nbKeys;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "nbKeys=" + nbKeys +
                ", disposition='" + disposition + '\'' +
                '}';
    }
}
