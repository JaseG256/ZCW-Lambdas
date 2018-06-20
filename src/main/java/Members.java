
import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;

public class Members {

    List<Person> memberList;

    public Members() { memberList = new ArrayList<>(); }

    public void addPerson(Person person) { memberList.add(person); }

    public boolean removePerson(Person person) { return memberList.remove(person); }

    public static void printPersons(List<Person> memberList, CheckPerson tester) {
        memberList.forEach(person -> { if(tester.test(person))
            person.printPerson(); });
    }



}


