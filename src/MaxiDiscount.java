import java.util.GregorianCalendar;
import java.util.Objects;

public class MaxiDiscount extends Rabattstrategie {

    public MaxiDiscount(double regulaerpreis, GregorianCalendar flugdatum, String flugnummer) {
        Objects.requireNonNull(regulaerpreis);
        Objects.requireNonNull(flugdatum);
        Objects.requireNonNull(flugnummer);
        super(regulaerpreis, flugdatum, flugnummer);
        this.setBezeichnung("MaxiDiscount");
    }

    @Override
    public double getReduzierterPreis(double d) {
        return d * 0.7;
    }
}
