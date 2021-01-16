import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumbersTest {
    private List<Integer> primeNumbers(int number) {
        if (number == 1)
            return emptyList();
        if (number % 2 == 0) {
            List<Integer> primeNumbers = new ArrayList<>();
            int division = number;
            while (division % 2 == 0) {
                primeNumbers.add(2);
                division = division / 2;
            }
            if (division > 1)
                primeNumbers.add(division);
            return primeNumbers;
        }
        return singletonList(number);
    }

    @Test
    public void severalPrimeNumbers() {
        assertEquals(emptyList(), primeNumbers(1));
        assertEquals(singletonList(2), primeNumbers(2));
        assertEquals(singletonList(3), primeNumbers(3));
        assertEquals(asList(2, 2), primeNumbers(4));
        assertEquals(singletonList(5), primeNumbers(5));
        assertEquals(asList(2, 3), primeNumbers(6));
        assertEquals(singletonList(7), primeNumbers(7));
        assertEquals(asList(2, 2, 2), primeNumbers(8));
    }
}
