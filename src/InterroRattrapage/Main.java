package InterroRattrapage;

public class Main {
    public static void main(String[] args) {
        PageWeb maPage = new PageWeb("ECE - Ecole d'ingénieurs");
        maPage.addBalise(new Paragraphe("Ceci est un paragraphe."));
        Paragraphe p = new Paragraphe("Ceci est un deuxième paragraphe.");
        p.addClasse("maClasseDeP");
        maPage.addBalise(p);
        Div div = new Div();
        Lien l = new Lien("ECE", "https://www.ece.fr");
        l.addClasse("c1");
        l.addClasse("c2");
        div.addBalise(l);
        div.addBalise(new Paragraphe("Paragraphe"));
        maPage.addBalise(div);
        div.addBalise(new Span());
        Span s = new Span();
        s.addClasse("rouge");
        s.addClasse("gras");
        //s.addBalise(new Paragraphe("Ne fonctionne pas car balise block"));
        s.addBalise(new Lien("Google", "https://www.google.com"));
        maPage.addBalise(s);
        System.out.println(maPage);
    }
}