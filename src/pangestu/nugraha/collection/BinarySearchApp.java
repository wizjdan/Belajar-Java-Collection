package pangestu.nugraha.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Materi Binary Search
public class BinarySearchApp {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(1000);

        for (int i = 1; i <= 1000; i++) {
            list.add(i);
        }

        //Misalkan mencari urutan ke 888
        int index = Collections.binarySearch(list, 888);

        System.out.println(index);

        //Bisa juga menggunakan comparator
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        //Misalkan mencari urutan ke 900
        int index2 = Collections.binarySearch(list, 900);

        System.out.println(index2);
    }
}
