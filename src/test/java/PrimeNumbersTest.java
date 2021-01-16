import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumbersTest {
    private List<Integer> primeNumbers(int number) {
        return emptyList();
    }

    @Test
    public void severalPrimeNumbers(){
        assertEquals(emptyList(), primeNumbers(1));
    }
}
