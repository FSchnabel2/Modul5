import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Angebot angebot = new Angebot(200, new GregorianCalendar(2024,10,24), "1");
        System.out.println("Regulärer Preis: " + angebot.getRegulaerpreis());
        System.out.println("Reduzierter Preis: " + angebot.getReduzierterPreis());
        System.out.println("Angewandte Rabattstrategie: " + angebot.getRabattstrategie().getBezeichnung());
    }
}