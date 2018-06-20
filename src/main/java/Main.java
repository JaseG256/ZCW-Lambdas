import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate birthday1 = LocalDate.of(1987, 11, 8);
        Person person1 = new Person(Person.Sex.MALE, "Jason", birthday1, "JT@yahoo.com");
        LocalDate birthday2 = LocalDate.of(1995, 2, 28);
        Person person2 = new Person(Person.Sex.FEMALE, "Jennifer", birthday2, "Jenn@yahoo.com");
        LocalDate birthday3= LocalDate.of(1980, 7, 1);
        Person person3 = new Person(Person.Sex.MALE, "Paul", birthday3, "PMoney@Gmail.com");
        LocalDate birthday4 = LocalDate.of(1993, 9, 15);
        Person person4 = new Person(Person.Sex.MALE, "Terry", birthday4, "TT@yahoo.com");
        Members myCrew = new Members();

        myCrew.addPerson(person1);
        myCrew.addPerson(person2);
        myCrew.addPerson(person3);
        myCrew.addPerson(person4);

        Members.printPersons(myCrew.memberList, p -> p.getGender() == Person.Sex.MALE);
        System.out.println();
        Members.printPersons(myCrew.memberList, p -> p.getName().contains("J"));
        System.out.println();

        LocalDate birthday5 = LocalDate.of(1989, 5, 23);
        Person person5 = new Person(Person.Sex.FEMALE, "Anette", birthday5, "Nettie@gmail.com");

        myCrew.addPerson(person5);

        Members.printPersons(myCrew.memberList, p -> p.getGender() == Person.Sex.FEMALE
                && p.getBirthday().getYear() < 1990);
        System.out.println();
        Members.printPersons(myCrew.memberList, p -> p.getAge() > 25);



    }
}
