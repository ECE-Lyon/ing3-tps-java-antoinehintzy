package InterroRattrapage;

public class Paragraphe extends BaliseBlock {

    private String text;

    public Paragraphe(String text) {
        super("p");
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return "<" + tag + " class=\"" + classes.toString() + "\">" + this.text + "</" + tag + ">";
    }
}
