package pangestu.nugraha.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        //ImmutableSet Kosong
        Set<String> kosong = Collections.emptySet();

        //ImmutableSet dengan 1 data
        Set<String> satu = Collections.singleton("Pangestu");

        //MutableSet
        Set<String> mutable = new HashSet<>();
        mutable.add("Pangestu");
        mutable.add("Nugraha");

        //Kemudian untuk merubah ke ImmutableSet
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        //Untuk membuat Set manual satu per satu
        Set<String> set = Set.of("Pangestu", "Nugraha");

    }
}
