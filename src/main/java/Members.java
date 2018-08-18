
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.ArrayList;

public class Members {

    List<Person> memberList;
    Iterator<Person> iterator;

    public Members() { memberList = new ArrayList<>(); }

    public void addPerson(Person person) { memberList.add(person); }

    public boolean addPerson(Person person, CheckPerson tester) {
        boolean added = false;
        if (tester.test(person))
        added = memberList.add(person);
        return  added;
    }

    public boolean removePerson(Person person) { return memberList.remove(person); }

    public boolean removePerson(Person person, CheckPerson tester) {
        boolean removed = false;
        if (tester.test(person))
            removed = memberList.remove(person);
        return removed;
    }

    public Person getPerson(Person person) {
        Person rightPerson = null;
        iterator = new Members().iterator;
        while (iterator.hasNext()) {
            if (iterator.next().equals(person)) {
                rightPerson = iterator.next();
            }
        }
        return rightPerson;
    }

    public static void printPersons(List<Person> memberList, CheckPerson tester) {
        memberList.forEach(person -> { if(tester.test(person)) person.printPerson(); });
    }



}


