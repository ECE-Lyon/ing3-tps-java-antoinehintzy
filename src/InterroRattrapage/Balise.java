package InterroRattrapage;

import java.util.ArrayList;
import java.util.List;

public abstract class Balise {
    protected String tag;

    protected List<String> classes;


    public Balise(String tag) {
        this.tag = tag;
        this.classes = new ArrayList<>();
    }

    public abstract String toString();

    public List<String> getClasses() {
        return classes;
    }

    public void addClasse(String classe) {
        this.classes.add(classe);
    }
}
