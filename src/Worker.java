public class Worker extends Person {

    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID,
                  String title, int YOB, double hourlyPayRate) {

        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {

        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {

            double regularPay = 40 * hourlyPayRate;
            double overtimeHours = hoursWorked - 40;
            double overtimePay =
                    overtimeHours * hourlyPayRate * 1.5;

            return regularPay + overtimePay;
        }
    }

    public void displayWeeklyPay(double hoursWorked) {

        double regularHours =
                Math.min(hoursWorked, 40);

        double overtimeHours =
                Math.max(hoursWorked - 40, 0);

        double regularPay =
                regularHours * hourlyPayRate;

        double overtimePay =
                overtimeHours * hourlyPayRate * 1.5;

        double totalPay =
                calculateWeeklyPay(hoursWorked);

        System.out.printf(
                "Regular Hours: %.2f%n",
                regularHours);

        System.out.printf(
                "Regular Pay: $%.2f%n",
                regularPay);

        System.out.printf(
                "Overtime Hours: %.2f%n",
                overtimeHours);

        System.out.printf(
                "Overtime Pay: $%.2f%n",
                overtimePay);

        System.out.printf(
                "Total Pay: $%.2f%n",
                totalPay);
    }

    @Override
    public String toCSV() {
        return super.toCSV()
                + ","
                + hourlyPayRate;
    }

    @Override
    public String toXML() {
        return super.toXML()
                + "<hourlyPayRate>"
                + hourlyPayRate
                + "</hourlyPayRate>";
    }

    public String toJSON() {
        return "{"
                + "\"firstName\":\"" + getFirstName() + "\","
                + "\"lastName\":\"" + getLastName() + "\","
                + "\"ID\":\"" + getID() + "\","
                + "\"title\":\"" + getTitle() + "\","
                + "\"YOB\":" + getYOB() + ","
                + "\"hourlyPayRate\":" + hourlyPayRate
                + "}";
    }
}

