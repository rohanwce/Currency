/**
 * Created by admin on 12-01-2015.
 */
public abstract class Currency {
    String currencyName;
    String currencySymbol;
    Currency(String currencyName,String currencySymbol){
        this.currencyName=currencyName;
        this.currencySymbol=currencySymbol;

    }
    abstract public double convert(Currency other,Double convertRatio);
}
