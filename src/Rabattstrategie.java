import java.util.GregorianCalendar;
import java.util.Objects;

public abstract class Rabattstrategie {
    private String bezeichnung;

    public Rabattstrategie(String bezeichnung) {
        Objects.requireNonNull(bezeichnung);
        this.bezeichnung = bezeichnung;
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
