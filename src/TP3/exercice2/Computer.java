package TP3.exercice2;

import java.util.Arrays;

public class Computer {
    private double price;
    private String description;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor[] monitors;

    // NB : tous les constructeurs qui suivent prennent un clavier, car la cardinalité est de 1 (0 impossible).
    // De plus, ils prennent soit un écran, soit plusieurs (cardinalité 1..*)
    // Constructeur "plusieurs écrans, sans souris"
    public Computer(double price, String description, Monitor[] monitors, Keyboard keyboard) {
        this.price = price;
        this.description = description;
        this.monitors = monitors;
        this.keyboard = keyboard;

    }

    // Constructeur "plusieurs écrans et une souris"
    public Computer(double price, String description, Monitor[] monitors, Keyboard keyboard, Mouse mouse) {
        this(price, description, monitors, keyboard);
        this.mouse = mouse;
    }

    // Constructeur "un écran, sans souris"
    public Computer(double price, String description, Monitor monitor, Keyboard keyboard) {
        this(price, description, new Monitor[]{monitor}, keyboard);
    }

    // Constructeur "un écran et une souris"
    public Computer(double price, String description, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this(price, description, new Monitor[]{monitor}, keyboard, mouse);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // Les mutateurs permettent de vérifier l'intégrité des modifications demandées :
        if(price >= 0.0) {
            this.price = price;
        }
        // else : on déclenchera une exception pour signaler l'incident
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor[] getMonitors() {
        return monitors;
    }

    public void setMonitors(Monitor[] monitors) {
        this.monitors = monitors;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", monitors=" + Arrays.toString(monitors) +
                '}';
    }
}
