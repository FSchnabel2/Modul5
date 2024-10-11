import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Angebot {
    private double regulaerpreis;
    private GregorianCalendar flugdatum;
    private String flugnummer;
    private Rabattstrategie rabattstrategie;
    private double reduzierterPreis;

    public Angebot(double regulaerpreis, GregorianCalendar flugdatum, String flugnummer) {
        if(regulaerpreis <= 0) throw new IllegalArgumentException("Regulärpreis darf nicht kleiner gleich 0 sein!");
        Objects.requireNonNull(flugdatum, "Flugdatum darf nicht null sein!");
        Objects.requireNonNull(flugnummer, "Flugnummer darf nicht null sein!");
        this.regulaerpreis = regulaerpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
        rabattstrategieWaehlen();
        this.reduzierterPreis = this.rabattstrategie.getReduzierterPreis(this.getRegulaerpreis());
    }

    protected void rabattstrategieWaehlen() {
        int monat = this.flugdatum.get(Calendar.MONTH);
        if(monat == Calendar.JANUARY || monat == Calendar.APRIL || monat == Calendar.OCTOBER) {
            this.rabattstrategie = new MaxiDiscount();
        } else if(monat == Calendar.FEBRUARY || monat == Calendar.MARCH) {
            this.rabattstrategie = new MidiDiscount();
        } else {
            this.rabattstrategie = new ZeroDiscount();
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
        return reduzierterPreis;
    }

    public Rabattstrategie getRabattstrategie() {
        return rabattstrategie;
    }

    public String anzeigen() {
        return "Angebot{" +
                "regulaerpreis=" + regulaerpreis +
                ", flugdatum=" + flugdatum +
                ", flugnummer='" + flugnummer + '\'' +
                '}';
    }
}
