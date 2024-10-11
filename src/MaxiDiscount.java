import java.util.GregorianCalendar;
import java.util.Objects;

public class MaxiDiscount extends Rabattstrategie {

    public MaxiDiscount() {
        super("MaxiDiscount");
    }

    @Override
    public double getReduzierterPreis(double d) {
        return d * 0.7;
    }
}
