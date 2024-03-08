package TP3.exercice2;

public class Main {
    public static void main(String[] args) {
        // Ordinateur 1
        Monitor m1 = new Monitor(27, "ASUS");
        Computer o1 = new Computer(
                799.99d,
                "PC gaming HP",
                m1,
                new Keyboard(102, "AZERTY"));

        // Ordinateur 2
        Keyboard magicKeyboard = new Keyboard(110, "AZERTY");
        Monitor proDisplayXDR1 = new Monitor(32, "Apple");
        Monitor proDisplayXDR2 = new Monitor(32, "Apple");
        Computer macPro = new Computer(
                8_299d,
                "Mac Pro",
                new Monitor[]{proDisplayXDR1, proDisplayXDR2},
                magicKeyboard);
        macPro.setMouse(new Mouse(1600, "Apple"));

        System.out.println(o1);
        System.out.println(macPro);
    }
}
