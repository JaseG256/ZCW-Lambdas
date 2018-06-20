import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import static org.junit.Assert.*;

public class PersonTest {

    Person person;
    LocalDate birthday;

    @Before
    public void setUp() {
        birthday = LocalDate.of(1987, 11, 8);
        person = new Person(Person.Sex.MALE, "Jason", birthday, "JT@yahoo.com");
    }

    @Test
    public void personConstructorTest() {
        String expected = "Jason";
        String actual = person.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getGenderTest() {
        LocalDate birthday = LocalDate.of(1987, 11, 8);
        Person person = new Person(Person.Sex.MALE, "Jason", birthday, "JT@yahoo.com");
        Person.Sex expected = Person.Sex.MALE;
        Person.Sex actual = person.getGender();
    }

    @Test
    public void setNameTest() {
        String expected = "Jason";
        person.setName("Jason");
        String actual = person.getName();
    }

    @Test
    public void setEmailAddressTest() {
        String expected = "TH@gmail";
        person.setEmailAddress("TH@gmail");
        String actual = person.getEmailAddress();
        assertEquals(expected, actual);
    }

    @Test
    public void printPersonTest() {
        String expected = "Jason JT@yahoo.com";
        //person.printPerson();
        String actual = person.getName() + " " + person.getEmailAddress();
        assertEquals(expected, actual);
    }
}