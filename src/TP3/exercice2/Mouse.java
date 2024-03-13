package TP3.exercice2;

public class Mouse {
    private int dpi;
    private String brand;

    public Mouse(int dpi, String brand) {
        this.dpi = dpi;
        this.brand = brand;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "dpi=" + dpi +
                ", brand='" + brand + '\'' +
                '}';
    }
}
