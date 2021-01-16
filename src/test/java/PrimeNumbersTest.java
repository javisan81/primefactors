import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumbersTest {
    private List<Integer> primeNumbers(int number) {
        if (number == 1)
            return emptyList();
        if (number == 4)
            return asList(2,2);
        return singletonList(number);
    }

    @Test
    public void severalPrimeNumbers() {
        assertEquals(emptyList(), primeNumbers(1));
        assertEquals(singletonList(2), primeNumbers(2));
        assertEquals(singletonList(3), primeNumbers(3));
        assertEquals(asList(2, 2), primeNumbers(4));
    }
}
