import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        ArrayList<Worker> workers = new ArrayList<>();

        // 3 hourly Workers
        workers.add(new Worker(
                "John", "Doe", "W001",
                "Mr.", 2000, 20.00));

        workers.add(new Worker(
                "Sarah", "Smith", "W002",
                "Ms.", 1999, 22.00));

        workers.add(new Worker(
                "Mike", "Brown", "W003",
                "Mr.", 1998, 25.00));

        // 3 SalaryWorkers
        workers.add(new SalaryWorker(
                "Robert", "Jones", "S001",
                "Mr.", 1985, 0.00, 52000.00));

        workers.add(new SalaryWorker(
                "Susan", "Miller", "S002",
                "Ms.", 1980, 0.00, 78000.00));

        workers.add(new SalaryWorker(
                "David", "Wilson", "S003",
                "Dr.", 1975, 0.00, 104000.00));

        // Week 1 = 40 hours
        // Week 2 = 50 hours
        // Week 3 = 40 hours
        double[] weeklyHours = {40, 50, 40};

        for (int week = 0; week < weeklyHours.length; week++) {

            double hours = weeklyHours[week];

            System.out.println();
            System.out.println("==============================================");
            System.out.println("WEEK " + (week + 1));
            System.out.println("==============================================");

            System.out.printf(
                    "%-20s %10s %12s%n",
                    "Employee",
                    "Hours",
                    "Weekly Pay");

            System.out.println(
                    "----------------------------------------------");

            for (Worker worker : workers) {

                double weeklyPay =
                        worker.calculateWeeklyPay(hours);

                System.out.printf(
                        "%-20s %10.2f %12.2f%n",
                        worker.fullName(),
                        hours,
                        weeklyPay);
            }
        }
    }
}