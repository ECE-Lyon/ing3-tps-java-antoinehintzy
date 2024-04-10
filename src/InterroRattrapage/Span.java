package InterroRattrapage;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Bonus
 * Une balise span ne peut contenir ici que des balises inline.
 */
public class Span extends BaliseInline {

    private List<BaliseInline> balises;

    public Span() {
        super("span");
        this.balises = new ArrayList<>();
    }

    public List<BaliseInline> getBalises() {
        return balises;
    }

    public void addBalise(BaliseInline balise) {
        this.balises.add(balise);
    }

    public String toString() {
        return "<" + tag + " class=\"" + classes.toString() + "\">" + this.balises.toString() + "</" + tag + ">";
    }
}
