import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicStatisticTest {

    public void nrOfItemsWhenNoneArePresentIsZero() {
        //arrange
        BasicStatisticInterface bs = new BasicStatistic();
        //act
        int nrOfItems = bs.numberOfDataItems();
        //assert
        Assert.assertSame(0, nrOfItems);
    }
    public void nrOfItemsAfterAddingIsNotZero() {
        //arrange
        BasicStatisticInterface bs = new BasicStatistic();
        //act
        bs.addDoubleToData(2.42);
        int nrOfItems = bs.numberOfDataItems();
        //assert
        Assert.assertNotSame(0, nrOfItems);
    }
}