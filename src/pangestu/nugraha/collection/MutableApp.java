package pangestu.nugraha.collection;

import pangestu.nugraha.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Pangestu");

        person.addHobi("Bermain Game");
        person.addHobi("Coding");

        doSomethingWithHobbies(person.getHobi());

        for (var hobby : person.getHobi()){
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobi){
    hobi.add("Ini bukan hobi"); // Ini akan tereksekusi keluar
    }

}
