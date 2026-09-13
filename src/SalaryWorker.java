public class SalaryWorker extends Worker {

    private double annualSalary;

    public SalaryWorker(String firstName, String lastName,
                        String ID, String title, int YOB,
                        double hourlyPayRate, double annualSalary) {

        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52.0;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);

        System.out.printf("Annual Salary: $%.2f%n", annualSalary);
        System.out.printf("Weekly Pay (Annual Salary / 52): $%.2f%n",
                weeklyPay);
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + annualSalary;
    }

    @Override
    public String toXML() {
        return super.toXML()
                + "<annualSalary>" + annualSalary + "</annualSalary>";
    }

    public String toJSON() {
        return "{"
                + "\"firstName\":\"" + getFirstName() + "\","
                + "\"lastName\":\"" + getLastName() + "\","
                + "\"ID\":\"" + getID() + "\","
                + "\"title\":\"" + getTitle() + "\","
                + "\"YOB\":" + getYOB() + ","
                + "\"hourlyPayRate\":" + getHourlyPayRate() + ","
                + "\"annualSalary\":" + annualSalary
                + "}";
    }
}