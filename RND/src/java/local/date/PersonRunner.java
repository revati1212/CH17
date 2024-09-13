package java.local.date;

public class PersonRunner {
	public static void main(String[] args) {




		Person person1 = new Person("Revati", "revatiahirasang.com", 22, "97462827");
        Person person2 = new Person("Sanji", "sanji@gmail.com", 23, "7785978751");
        Person person3 = new Person("Priya", "priya@gmail.com", 27, "6363234567");
        Person person4 = new Person("teju", "tej@gmail.com", 21, "99992727");
        Person person5 = new Person("sushmita", "sushmita@gmail.com", 22, "8364363890");


        Person[] persons = {person1, person2, person3, person4, person5};


        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

}
