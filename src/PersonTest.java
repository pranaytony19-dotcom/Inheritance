import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void constructorTest() {
        Person person = new Person("John", "Doe", "12345", "Mr.", 2000);

        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals("12345", person.getID());
        assertEquals("Mr.", person.getTitle());
        assertEquals(2000, person.getYOB());
    }

    @Test
    void setFirstName() {
        Person person = new Person("John", "Doe", "12345", "Mr.", 2000);

        person.setFirstName("James");

        assertEquals("James", person.getFirstName());
    }

    @Test
    void setLastName() {
        Person person = new Person("John", "Doe", "12345", "Mr.", 2000);

        person.setLastName("Jones");

        assertEquals("Jones", person.getLastName());
    }

    @Test
    void setTitle() {
        Person person = new Person("John", "Doe", "12345", "Mr.", 2000);

        person.setTitle("Dr.");

        assertEquals("Dr.", person.getTitle());
    }

    @Test
    void setYOB() {
        Person person = new Person("John", "Doe", "12345", "Mr.", 2000);

        person.setYOB(2001);

        assertEquals(2001, person.getYOB());
    }

    @Test
    void fullName() {
        Person person = new Person("John", "Doe", "12345", "Mr.", 2000);

        assertEquals("John Doe", person.fullName());
    }

    @Test
    void formalName() {
        Person person = new Person("John", "Doe", "12345", "Mr.", 2000);

        assertEquals("Mr. John Doe", person.formalName());
    }

    @Test
    void getAge() {
        Person person = new Person("John", "Doe", "12345", "Mr.", 2000);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        assertEquals(
                String.valueOf(currentYear - 2000),
                person.getAge()
        );
    }

    @Test
    void getAgeForYear() {
        Person person = new Person("John", "Doe", "12345", "Mr.", 2000);

        assertEquals("25", person.getAge(2025));
    }

    @Test
    void toCSV() {
        Person person = new Person("John", "Doe", "12345", "Mr.", 2000);

        assertEquals(
                "John,Doe,12345,Mr.,2000",
                person.toCSV()
        );
    }

    @Test
    void toXML() {
        Person person = new Person("John", "Doe", "12345", "Mr.", 2000);

        String expected =
                "<Person>" +
                        "<firstName>John</firstName>" +
                        "<lastName>Doe</lastName>" +
                        "<ID>12345</ID>" +
                        "<title>Mr.</title>" +
                        "<YOB>2000</YOB>" +
                        "</Person>";

        assertEquals(expected, person.toXML());
    }

    @Test
    void testToString() {
        Person person = new Person("John", "Doe", "12345", "Mr.", 2000);

        assertNotNull(person.toString());
    }
}
