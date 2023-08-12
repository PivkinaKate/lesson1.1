import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {

    @Test

    public void buyLow1000() {
        CashBackHacker buy = new CashBackHacker();
        int amount = 450;


        int actual = buy.remain(amount);
        int expected = 550;

        assertEquals(expected, actual);
    }

    @Test

    public void buyMore1000() {
        CashBackHacker buy = new CashBackHacker();
        int amount = 2000;


        int actual = buy.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test

    public void buy1000() {
        CashBackHacker buy = new CashBackHacker();
        int amount = 1000;


        int actual = buy.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

}