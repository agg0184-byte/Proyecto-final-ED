package Hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {
    @Test
    public void testPrivateInsurranceStation() {
        Private p = new Private("Paul", "77927393N", 49, "TB");

        int days = 2;
        double expectedPrice = 160.00;


        assertEquals(expectedPrice, p.calcStationCost(days), 0.001);
    }



}
