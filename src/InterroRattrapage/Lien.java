package InterroRattrapage;

public class Lien extends BaliseInline {
    private String text;
    private String url;

    public Lien(String text, String url) {
        super("a");
        this.text = text;
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString() {
        return "<" + tag + " href=\"" + this.url + "\" class=\"" + classes.toString() + "\">" + this.text + "</" + tag + ">";
    }
}
