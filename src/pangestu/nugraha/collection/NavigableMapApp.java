package pangestu.nugraha.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

//Materi NavigableMap Interface
public class NavigableMapApp {
    public static void main(String[] args) {

        //Cara pembuatan NavigableMap
        NavigableMap<String, String> map = new TreeMap<>();

        //Cara pembuatan NavigableMap secara decending
        NavigableMap<String, String> mapDescending = map.descendingMap();

        //Cara pembuatan NavigableMap kosong
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();

        //Cara pembuatan Navigable yang Immutable
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);

        //Memasukan Data
        map.put("Depan", "Pangestu");
        map.put("Tengah", "Nugraha");
        map.put("Belakang", "Wizjdan");

        //Dilakukan pengecekan
        for (var nama : map.keySet()){
            System.out.println(nama);
        } //Hasilnya akan berurutan sesuai abjad

        //Jika ingin mengambil urutan kurang dari "Tengah" dari hasil diatas
        System.out.println(map.lowerKey("Tengah"));

        //Jika ingin mengambil urutan lebih dari "Depan" dari hasil diatas
        System.out.println(map.higherKey("Depan"));

        //Jika ingin mengambil urutan kurang dari sama dengan "Tengah" dari hasil diatas
        System.out.println(map.floorKey("Tengah"));

        //Jika ingin mengambil urutan lebih dari sama dengan "Tengah" dari hasil diatas
        System.out.println(map.ceilingKey("Tengah"));

        //Dilakukan pengecekan untuk desceding
        for (var nama : mapDescending.keySet()){
            System.out.println(nama);
        } //Hasilnya akan berurutan secara terbalik dari belakang

    }
}
