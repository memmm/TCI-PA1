import java.util.ArrayList;
import java.util.Arrays;

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
        Double sum = 0.0;
        for (Double value : items) {
            sum +=value;
        }
        return sum;
    }

}
