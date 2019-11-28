import java.util.ArrayList;

/**
 * very simple implementation of the BasicStatisticInterface
 */
public class BasicStatistic implements BasicStatisticInterface {

    private ArrayList<Double> items;

    public BasicStatistic() {
        items = new ArrayList<>();
    }

    @Override
    public void addDoubleToData(Double valueToAdd){
        items.add(valueToAdd);
    }

    @Override
    public void clearData(){
        items.clear();
    }

    @Override
    public int numberOfDataItems(){
        return items.size();
    }

    @Override
    public Double sum(){
        double rv = 0.0;
        return rv;
    }

}
