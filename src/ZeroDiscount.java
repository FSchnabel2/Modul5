import java.util.GregorianCalendar;
import java.util.Objects;

public class ZeroDiscount extends Rabattstrategie {

    public ZeroDiscount() {
        super("ZeroDiscount");
    }

    @Override
    public double getReduzierterPreis(double d) {
        return d;
    }
}
