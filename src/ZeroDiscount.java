import java.util.GregorianCalendar;

public class ZeroDiscount extends Rabattstrategie {

    public ZeroDiscount(double regulaerpreis, GregorianCalendar flugdatum, String flugnummer, String bezeichnung) {
        super(regulaerpreis, flugdatum, flugnummer, bezeichnung);
    }

    public double berechneReduziertenPreis() {
        return this.getRegulaerpreis();
    }
}
