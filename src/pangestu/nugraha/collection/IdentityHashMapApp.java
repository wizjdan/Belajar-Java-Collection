package pangestu.nugraha.collection;

//Materi IdentityHashMap

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "nama.depan";

        String nama = "nama";
        String dot = ".";
        String depan = "depan";

        String key2 = nama + dot + depan;

        //Jika di coba untuk mengkompare
        System.out.println(key1.equals(key2)); //Hasilnya True

        //Jika di kompare dengan equality
        System.out.println(key1 == key2); //False
        /*
        Jadi ketika menggunakan Identity Hash Map ketika di compare dengan equality
        antara key1 dan key2 makan hasilnya akan dianggap berbeda
         */
    }
}
