import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Angebot {
    private double regulaerpreis;
    private GregorianCalendar flugdatum;
    private String flugnummer;
    private double reduzierterPreis;
    private Rabattstrategie rabattstrategie;

    public Angebot(double regulaerpreis, GregorianCalendar flugdatum, String flugnummer) {
        Objects.requireNonNull(regulaerpreis);
        Objects.requireNonNull(flugdatum);
        Objects.requireNonNull(flugnummer);
        this.regulaerpreis = regulaerpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
        rabattstrategieWaehlen();
    }

    protected void rabattstrategieWaehlen() {
        if(this.flugdatum.get(Calendar.MONTH) == Calendar.JANUARY || this.flugdatum.get(Calendar.MONTH) == Calendar.APRIL || this.flugdatum.get(Calendar.MONTH) == Calendar.OCTOBER) {
            this.rabattstrategie = new MaxiDiscount(this.getRegulaerpreis(), this.getFlugDatum(), this.getFlugnummer(), );
        }
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

        return this.reduzierterPreis;
    }

    public String anzeigen() {
        return "Angebot{" +
                "regulaerpreis=" + regulaerpreis +
                ", flugdatum=" + flugdatum +
                ", flugnummer='" + flugnummer + '\'' +
                '}';
    }
}
