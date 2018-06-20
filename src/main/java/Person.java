import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    private Sex gender;
    private String name;
    private LocalDate birthday;
    private String emailAddress;

    public Person(Sex gender, String name, LocalDate birthday, String emailAddress) {
        this.gender = gender;
        this.name = name;
        this.birthday = birthday;
        this.emailAddress = emailAddress;
    }

    public Sex getGender() { return gender; }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public LocalDate getBirthday() { return birthday; }

    public int getAge() { return LocalDate.now().getYear() - birthday.getYear(); }

    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public String getEmailAddress() { return emailAddress; }

    public void printPerson() { System.out.println(this.name + " " + this.emailAddress);

    }

}
