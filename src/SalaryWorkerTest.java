import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    @Test
    void calculateWeeklyPay() {

        SalaryWorker worker =
                new SalaryWorker(
                        "Jane",
                        "Smith",
                        "004",
                        "Ms.",
                        1995,
                        0,
                        52000);

        assertEquals(
                1000.00,
                worker.calculateWeeklyPay(40),
                0.01);
    }
}