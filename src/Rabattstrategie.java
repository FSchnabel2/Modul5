import java.util.GregorianCalendar;
import java.util.Objects;

public abstract class Rabattstrategie extends Angebot {
    private String bezeichnung;

    public Rabattstrategie(double regulaerpreis, GregorianCalendar flugdatum, String flugnummer) {
        Objects.requireNonNull(regulaerpreis);
        Objects.requireNonNull(flugdatum);
        Objects.requireNonNull(flugnummer);
        super(regulaerpreis, flugdatum, flugnummer);
    }

    public abstract double getReduzierterPreis(double d);

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        Objects.requireNonNull(bezeichnung);
        this.bezeichnung = bezeichnung;
    }
}
