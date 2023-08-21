package pangestu.nugraha.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Materi SortingList
public class SortingApp {
    public static void main(String[] args) {

        /*
        Pastikan Sorting List harus mutable, jika immutable makan akan eror. Karena posisinya tidak dapat
        dirubah lagi.
         */

        //Pembuatan Sorting List
        List<String> list = new ArrayList<>();

        //Menambahkan data ke dalam list
        //list.add("Pangestu"); Bisa seperti ini atau
        list.addAll(List.of("Pangestu", "Nugraha", "Wijdan", "Shiro", "Cireng", "Ria"));

        //Cara mengurutkan
        Collections.sort(list);

        for (var nama : list){
            System.out.println(nama);
        } //Hasilnya berurut sesuai dengan abjad(Kudaryavka)

        //Jika ingin membuat komparator sendiri juga bisa. Contoh
        Comparator<String> revers = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        //Cara mengurutkan
        Collections.sort(list, revers);

        for (var nama : list){
            System.out.println(nama);
        } //Hasilnya berurut secara descending



    }
}
