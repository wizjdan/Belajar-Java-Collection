package pangestu.nugraha.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//Materi Immutable Map
public class ImmutableMapApp {
    public static void main(String[] args) {

        //Cara membuat ImmutableMap kosong
        Map<String, String> kosong = Collections.emptyMap();

        //Cara membuat hanya 1 ImmutableMap
        Map<String, String> satu = Collections.singletonMap("nama", "Pangestu");

        //Cara membuat satu per satu menggunakan Map.of()
        Map<String, String> map = Map.of(
            "namaDepan", "Pangestu",
            "namaTengah", "Nugraha",
            "namaBelakang", "Wizjdan");

        //Ini mutable
        Map<String, String> mutable = new HashMap<>();
        //Datanya di masukan
        mutable.put("nama", "Pangestu");

        //Pembuatan data yang mutable ke immutbale
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
        //Data dimasukan
        //immutable.put("nama", "Wizjdan"); Eror

    }
}
