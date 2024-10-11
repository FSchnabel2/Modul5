import java.util.GregorianCalendar;
import java.util.Objects;

public class MidiDiscount extends Rabattstrategie {

    public MidiDiscount(String bezeichnung) {
        Objects.requireNonNull(regulaerpreis);
        setBezeichnung("MidiDiscount");
    }

    @Override
    public double getReduzierterPreis(double d) {
        return d * 0.85;
    }
}
