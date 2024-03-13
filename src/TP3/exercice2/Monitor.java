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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return screenSize == monitor.screenSize && Objects.equals(brand, monitor.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screenSize, brand);
    }

    /**
     * La fonction main suivante à pour objectif de vous montrer l'utilité des méthodes equals() et hashCode()
     */
    public static void main(String[] args) {
        Monitor m1 = new Monitor(27, "Apple");
        Monitor m2 = new Monitor(27, "Apple");
        Monitor m3 = m1;
        Monitor m4 = new Monitor(32, "Apple");


        // L'opérateur == vérifie si les références "pointent" sur le même objet :
        if(m1 == m3) { System.out.println("m1 == m3"); } else { System.out.println("m1 != m3"); } // oui
        if(m1 == m2) { System.out.println("m1 == m2"); } else { System.out.println("m1 != m2"); } // non
        if(m1 == m4) { System.out.println("m1 == m4"); } else { System.out.println("m1 != m4"); } // non
        // equals() vérifie si les objets ont les mêmes valeurs :
        if(m1.equals(m3)) { System.out.println("m1.equals(m3)"); } else { System.out.println("!m1.equals(m3)"); } // oui
        if(m1.equals(m2)) { System.out.println("m1.equals(m2)"); } else { System.out.println("!m1.equals(m2)"); } // oui
        if(m1.equals(m4)) { System.out.println("m1.equals(m4)"); } else { System.out.println("!m1.equals(m4)"); } // non

    }
}
