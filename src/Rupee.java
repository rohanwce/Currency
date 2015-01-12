/**
 * Created by admin on 12-01-2015.
 */
public class Rupee extends Currency {


    Rupee(String currencyName, String currencySymbol) {
        super("Rupee", "Rs");
    }

    @Override
    public double convert(Currency other, Double convertRatio) {

        return 0;
    }
}
