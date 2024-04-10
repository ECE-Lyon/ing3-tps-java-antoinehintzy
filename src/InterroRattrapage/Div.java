package InterroRattrapage;

import java.util.ArrayList;
import java.util.List;

public class Div extends BaliseBlock {

    private List<Balise> balises;

    public Div() {
        super("div");
        this.balises = new ArrayList<>();
    }

    public List<Balise> getBalises() {
        return balises;
    }

    public void addBalise(Balise balise) {
        this.balises.add(balise);
    }

    public String toString() {
        return "<" + tag + " class=\"" + classes.toString() + "\">" + this.balises.toString() + "</" + tag + ">";
    }
}
