package pangestu.nugraha.collection;

import java.util.Iterator;
import java.util.List;

/*
Materi Iterable
 */
public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Pangestu", "Nugraha", "Wizjdan", "Cio", "Cireng");

        //Melakukan perulangan for untuk pengecekan data di Iterable

        for (var name : names){
            System.out.println(name);
        }

        //Contoh Iterator
        //Manual dengan menggunakan perulangan while
        System.out.println("Iterator");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

    }
}
