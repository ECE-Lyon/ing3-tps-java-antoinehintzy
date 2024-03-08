package TP3.exercice2;

import java.util.Objects;

public class Monitor {
    private int screenSize;
    private String brand;

    public Monitor(int screenSize, String brand) {
        this.screenSize = screenSize;
        this.brand = brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "screenSize=" + screenSize +
                ", brand='" + brand + '\'' +
                '}';
    }
}
