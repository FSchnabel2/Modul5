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
        if(regulaerpreis <= 0) throw new RuntimeException("Regulärpreis darf nicht kleiner gleich 0 sein!");
        Objects.requireNonNull(flugdatum);
        Objects.requireNonNull(flugnummer);
        this.regulaerpreis = regulaerpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
        rabattstrategieWaehlen();
        this.reduzierterPreis = this.rabattstrategie.getReduzierterPreis();
    }

    protected void rabattstrategieWaehlen() {
        if(this.flugdatum.get(Calendar.MONTH) == Calendar.JANUARY || this.flugdatum.get(Calendar.MONTH) == Calendar.APRIL || this.flugdatum.get(Calendar.MONTH) == Calendar.OCTOBER) {
            this.rabattstrategie = new MaxiDiscount(this.getRegulaerpreis(), this.getFlugdatum(), this.getFlugnummer());
        } else if(this.flugdatum.get(Calendar.MONTH) == Calendar.FEBRUARY || this.flugdatum.get(Calendar.MONTH) == Calendar.MARCH) {
            this.rabattstrategie = new MidiDiscount(this.getRegulaerpreis(), this.getFlugdatum(), this.getFlugnummer());
        } else {
            this.rabattstrategie = new ZeroDiscount(this.getRegulaerpreis(), this.getFlugdatum(), this.getFlugnummer());
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

    public String anzeigen() {
        return "Angebot{" +
                "regulaerpreis=" + regulaerpreis +
                ", flugdatum=" + flugdatum +
                ", flugnummer='" + flugnummer + '\'' +
                '}';
    }
}
