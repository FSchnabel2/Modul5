import java.util.GregorianCalendar;
import java.util.Objects;

public class Angebot {
    private double regulaerpreis;
    private GregorianCalendar flugdatum;
    private String flugnummer;

    public Angebot(double regulaerpreis, GregorianCalendar flugdatum, String flugnummer) {
        Objects.requireNonNull(regulaerpreis);
        Objects.requireNonNull(flugdatum);
        Objects.requireNonNull(flugnummer);
        this.regulaerpreis = regulaerpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
    }

    protected void rabattstrategieWaehlen() {

    }

    public double getRegulaerpreis() {
        return regulaerpreis;
    }

    public void setRegulaerpreis(double regulaerpreis) {
        Objects.requireNonNull(regulaerpreis);
        this.regulaerpreis = regulaerpreis;
    }

    public GregorianCalendar getFlugdatum() {
        return flugdatum;
    }

    public void setFlugdatum(GregorianCalendar flugdatum) {
        Objects.requireNonNull(flugdatum);
        this.flugdatum = flugdatum;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public void setFlugnummer(String flugnummer) {
        Objects.requireNonNull(flugnummer);
        this.flugnummer = flugnummer;
    }

    public double getReduzierterPreis() {
        return regulaerpreis;
    }

    public String anzeigen() {
        return "Angebot{" +
                "regulaerpreis=" + regulaerpreis +
                ", flugdatum=" + flugdatum +
                ", flugnummer='" + flugnummer + '\'' +
                '}';
    }
}
