import java.util.GregorianCalendar;

public class MidiDiscount extends Rabattstrategie {

    public MidiDiscount(double regulaerpreis, GregorianCalendar flugdatum, String flugnummer, String bezeichnung) {
        super(regulaerpreis, flugdatum, flugnummer, bezeichnung);
    }

    public double berechneReduziertenPreis() {
        return this.getRegulaerpreis() * 0.85;
    }
}
