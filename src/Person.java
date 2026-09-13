import java.util.Calendar;
public class Person {
    private String firstName;
    private String lastName;
    private final String ID;
    private String title;
    private int YOB;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public int getYOB() {
        return YOB;
    }

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    /**
     * Return's the person full name.
     *
     * @return first name followed by last name
     */
    public String fullName() {
        return firstName + " " + lastName;
    }

    /**
     * Return the person's formal none
     *
     * @return title followed by the person's full name
     */
    public String formalName() {
        return title + " " + fullName();
    }

    /**
     * Calculates the person's age using the current year
     *
     * @return age based on the current year
     */
    public String getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return String.valueOf(currentYear - YOB);
    }

    /**
     * Calculates the person's age for a specified year.
     *
     * @param year year used to calculate age
     * @return calculated age
     */
    public String getAge(int year) {
        return String.valueOf(year - YOB);
    }

    /**
     * Converts this person into CSV format.
     *
     * @return Person information in CSV format
     */
    public String toCSV() {
        return firstName + "," +
                lastName + "," +
                ID + "," +
                title + "," +
                YOB;
    }

    /**
     * Converts this person into JSON format.
     *
     * @return person information in JSON format
     */
    public String toXML() {
        return "<Person>"
                + "<firstName>" + firstName + "</firstName>"
                + "<lastName>" + lastName + "</lastName>"
                + "<ID>" + ID + "</ID>"
                + "<title>" + title + "</title>"
                + "<YOB>" + YOB + "</YOB>"
                + "</Person>";
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID='" + ID + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }
}
