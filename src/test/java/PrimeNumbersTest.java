import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumbersTest {
    private List<Integer> primeNumbers(int number) {
        List<Integer> primeNumbers = new ArrayList<>();
        int divisionResult = number;
        int prime = 2;
        do {
            while (divisionResult % prime == 0) {
                primeNumbers.add(prime);
                divisionResult = divisionResult / prime;
            }
            if (divisionResult > 1) {
                prime++;
            }
        } while (divisionResult != 1);
        return primeNumbers;
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
        assertEquals(asList(3, 3), primeNumbers(9));
        assertEquals(asList(2, 5), primeNumbers(10));
        assertEquals(singletonList(11), primeNumbers(11));
        assertEquals(asList(2,2,3), primeNumbers(12));
        assertEquals(singletonList(13), primeNumbers(13));
        assertEquals(asList(2,7), primeNumbers(14));
        assertEquals(asList(3,5), primeNumbers(15));
        assertEquals(asList(2,2, 7, 3527), primeNumbers(98756));
    }
}
