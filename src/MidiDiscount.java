import java.util.GregorianCalendar;
import java.util.Objects;

public class MidiDiscount extends Rabattstrategie {

    public MidiDiscount(double regulaerpreis, GregorianCalendar flugdatum, String flugnummer) {
        Objects.requireNonNull(regulaerpreis);
        Objects.requireNonNull(flugdatum);
        Objects.requireNonNull(flugnummer);
        super(regulaerpreis, flugdatum, flugnummer);
        this.setBezeichnung("MidiDiscount");
    }

    @Override
    public double getReduzierterPreis(double d) {
        return this.getRegulaerpreis() * 0.85;
    }
}
