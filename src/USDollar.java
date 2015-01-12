/**
 * Created by admin on 12-01-2015.
 */
public  class USDollar extends Currency {
    @Override
    public double convert(Currency other, Double convertRatio) {
        return 0;
    }
    USDollar()
    {
        super("USDollar","USD");
    }

}
