import java.util.GregorianCalendar;
import java.util.Objects;

public class Rabattstrategie extends Angebot {
    private String bezeichnung;

    public Rabattstrategie(double regulaerpreis, GregorianCalendar flugdatum, String flugnummer, String bezeichnung) {
        Objects.requireNonNull(regulaerpreis);
        Objects.requireNonNull(flugdatum);
        Objects.requireNonNull(flugnummer);
        Objects.requireNonNull(bezeichnung);
        super(regulaerpreis, flugdatum, flugnummer);
        this.bezeichnung = bezeichnung;
    }

    public double getReduzierterPreis(double d) {

    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        Objects.requireNonNull(bezeichnung);
        this.bezeichnung = bezeichnung;
    }
}
