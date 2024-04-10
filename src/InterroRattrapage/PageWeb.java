package InterroRattrapage;

import java.util.ArrayList;
import java.util.List;

public class PageWeb {
    private String title;

    private List<Balise> balises;

    public PageWeb(String title) {
        this.title = title;
        this.balises = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Balise> getBalises() {
        return balises;
    }

    public void addBalise(Balise balise) {
        this.balises.add(balise);
    }

    public String toString() {
        return "<!doctype html><html><head><title>" + title + "</title></head><body>" + this.balises.toString() + "</body></html>";
    }
}
