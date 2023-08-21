package pangestu.nugraha.collection;

import java.util.HashMap;
import java.util.Map;

//Materi Map
public class HashMapApp {
    public static void main(String[] args) {

        //Map menggunakan Hashmap
        Map<String, String> map = new HashMap<>();

        //Cara menyimpan data menggunakan .put
        //.put jika diinput dengan Key yang sama makan hanya akan mengupdate
        //Jika .put dengan Key belum ada maka akan menginsert
        map.put("namaDepan", "Pangestu");
        map.put("namaBelakang", "Nugraha");

        //Untuk mengambil data menggunakan .get
        System.out.println(map.get("namaDepan"));
        System.out.println(map.get("namaBelakang"));

    }
}
