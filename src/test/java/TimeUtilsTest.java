import org.example.TimeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TimeUtilsTest {

    private final int inputSeconds;
    private final String expectedTime;

    public TimeUtilsTest(int inputSeconds, String expectedTime) {
        this.inputSeconds = inputSeconds;
        this.expectedTime = expectedTime;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {59, "00:00:59"},
                {86400, "24:00:00"},
                {3600, "01:00:00"},
                {1000000000, "277777:46:40"},
                {7200, "02:00:00"},
                {0, "00:00:00"},
                {1, "00:00:01"},
                {3661, "01:01:01"},
                {86399, "23:59:59"},
                {-100, "Negative input not accepted"},
                {-1, "Negative input not accepted"},

        });
    }


    @Test
    public void testSecToTime() {
        System.out.println("Test for " + inputSeconds + " seconds:");
        System.out.println("Expect:" + expectedTime);
        assertEquals(expectedTime, TimeUtils.secToTime(inputSeconds));
    }
}