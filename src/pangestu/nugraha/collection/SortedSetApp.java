package pangestu.nugraha.collection;

import pangestu.nugraha.collection.data.Person;
import pangestu.nugraha.collection.data.PersonComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

//        SortedSet<Person> orang = new TreeSet<>();
//        orang.add(new Person("Oby"));
//        orang.add(new Person("Wahyu"));
//        orang.add(new Person("Zull"));
//
//        for (var manusia : orang){
//            System.out.println(manusia.getNama());
//        }
        //Kode ini akan eror Class person tidak bisa di konversi ke Class Comparable

        //Menambahkan Komparator agar tidak terjadi eror
        //Ketika di lakukan pengecekan maka akan di urutkan secara asending
        //Jika ingin di urutkan dari belakang makan bisa ditambahkan .revers
        SortedSet<Person> orang = new TreeSet<>(new PersonComparator());

        //contoh revers
//        SortedSet<Person> orang = new TreeSet<>(new PersonComparator().reversed());

        orang.add(new Person("Oby"));
        orang.add(new Person("Wahyu"));
        orang.add(new Person("Zull"));

        for (var manusia : orang){
            System.out.println(manusia.getNama());
        }


    }
}
