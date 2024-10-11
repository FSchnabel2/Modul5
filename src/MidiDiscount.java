import java.util.GregorianCalendar;
import java.util.Objects;

public class MidiDiscount extends Rabattstrategie {

    public MidiDiscount() {
        super("MidiDiscount");
    }

    @Override
    public double getReduzierterPreis(double d) {
        return d * 0.85;
    }
}
