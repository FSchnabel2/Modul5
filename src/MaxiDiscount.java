import java.util.GregorianCalendar;

public class MaxiDiscount extends Rabattstrategie {

    public MaxiDiscount(double regulaerpreis, GregorianCalendar flugdatum, String flugnummer, String bezeichnung) {
        super(regulaerpreis, flugdatum, flugnummer, bezeichnung);
    }

    public void berechneReduziertenPreis() {

    }
}
