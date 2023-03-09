import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.function.Executable;

@ExtendWith(MockitoExtension.class)
class MathApplicationTest1000 {
    private final CalculadoraService calculator = mock(CalculadoraService.class);
    private final Random random = new Random();
    private float generateRandomFloat() {
        return random.nextFloat();
    }
    @TestFactory
    public Stream<DynamicTest> testAddition() {
        final int[] i = {1};
        return Stream.generate(() -> {
            float a = generateRandomFloat();
            float b = generateRandomFloat();

            when(calculator.add(a, b)).thenReturn((double) (a + b));

            Executable exec = () -> assertEquals(a + b, calculator.add(a, b));

            String testName = "Prueba " + i[0] + " de suma de: " + a + " and " + b;
            i[0] = i[0] +1;
            return DynamicTest.dynamicTest(testName, exec);
        }).limit(1000);
    }
    @Test
    void add() {
    }
}