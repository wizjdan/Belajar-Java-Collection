package pangestu.nugraha.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

//Materi SortedMap
public class SortedMapApp {
    public static void main(String[] args) {

        //Membuat comparator sendiri
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); //Contoh dikompare ke Decending
            }
        };

        //Cara pembuatan SortedMap dengan comparator Sendiri
        SortedMap<String, String> sortedMapComparator = new TreeMap<>(comparator);

        //Cara pembuatan SortedMap dengan comparator String
        SortedMap<String, String> sortedMap = new TreeMap<>();

        //Cara membuat SortedMap Kosong
        SortedMap<String,String> kosong = Collections.emptySortedMap();

        //Memasukan data
        sortedMap.put("namaDepan", "Pangestu");
        sortedMap.put("namaTengah", "Nugraha");
        sortedMap.put("namaBelakang", "Wizjdan");

        //Dicek menggunakan perulangan
        for (var nama : sortedMap.keySet()){
            System.out.println(nama);
        } //Hasilnya data akan diurutkan secara otomatis sesuai abjad(kudaryavka)

        System.out.println("BATAS");

        sortedMapComparator.put("namaDepan", "Pangestu");
        sortedMapComparator.put("namaTengah", "Nugraha");
        sortedMapComparator.put("namaBelakang", "Wizjdan");

        //Pengecekan dengan komparator sendiri menggunakan perulangan
        for (var nama : sortedMapComparator.keySet()){
            System.out.println(nama);
        } //Hasilnya data akan diurutkan dari belakang

        //Membuat SortedMap Immutable
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

        //Jika Immutable di rubah
        // immutable.put("namaDepan", "Ria"); //Eror

    }
}
