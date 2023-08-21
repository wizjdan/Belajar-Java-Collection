package pangestu.nugraha.collection;

import java.util.Map;
import java.util.WeakHashMap;

//Materi WeakHashMap
public class WeakHashMapApp {
    public static void main(String[] args) {

        /*
        Week Hash Map cocok untuk di gunakan untuk menyimpan data cache di memory secara sementara.
        Karena jika tidak digunakan lagi maka data yang ada pada Weak Hash Map otomatis akan dihapus
         */

        //Contoh Kode Weak Hash Map
        Map<Integer, Integer> map = new WeakHashMap<>();

        for (int i = 0; i < 1_000_000; i++) {
            map.put(i,i);
        }

        //Untuk memaksa si Java merunning sistem Garbage Collection
        System.gc();

        //Dicek menggunakan .size untuk melihat kapasitas datanya
        System.out.println(map.size());

    }
}
