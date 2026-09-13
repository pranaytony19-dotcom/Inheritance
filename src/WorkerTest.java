import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    void calculateWeeklyPay40Hours() {

        Worker worker =
                new Worker(
                        "John",
                        "Doe",
                        "001",
                        "Mr.",
                        2000,
                        20.00
                );

        assertEquals(
                800.00,
                worker.calculateWeeklyPay(40),
                0.01
        );
    }

    @Test
    void calculateWeeklyPay50Hours() {

        Worker worker =
                new Worker(
                        "John",
                        "Doe",
                        "001",
                        "Mr.",
                        2000,
                        20.00
                );

        assertEquals(
                1100.00,
                worker.calculateWeeklyPay(50),
                0.01
        );
    }
}