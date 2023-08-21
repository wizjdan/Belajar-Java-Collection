package pangestu.nugraha.collection;

//Materi LinkedHashMap

import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("nama.depan", "Pagestu");
        map.put("nama.belakang", "Nugraha");
        map.put("nama.tengah", "Wizjdan");

        //Coba untuk di ambil
        Set<String> names = map.keySet();
        for (var nama : names){
            System.out.println(nama);
        }
        /*
        Maka datanya akan berurut sesuai dengan kita memasukan data.
        Jika ingin urutannya selalu sama ketika kita ingin memasukan datanya dalam Map
        maka gunakan LinkedHashMap. Tapi untuk get data nya akan semakin lambat, terutama jika data yang
        akan di ambil adalah data paling akhir
         */



    }
}
