import java.util.GregorianCalendar;
import java.util.Objects;

public class ZeroDiscount extends Rabattstrategie {

    public ZeroDiscount(double regulaerpreis, GregorianCalendar flugdatum, String flugnummer) {
        Objects.requireNonNull(regulaerpreis);
        Objects.requireNonNull(flugdatum);
        Objects.requireNonNull(flugnummer);
        super(regulaerpreis, flugdatum, flugnummer);
        this.setBezeichnung("ZeroDiscount");
    }

    @Override
    public double getReduzierterPreis(double d) {
        return d;
    }
}
