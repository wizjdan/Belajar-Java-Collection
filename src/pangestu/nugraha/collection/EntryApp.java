package pangestu.nugraha.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Materi EntryMap
public class EntryApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Pangestu", "Pangestu Value");
        map.put("Nugraha", "Nugraha Value");
        map.put("Wizjdan", "Wizjdan Value");

        //map.keySet(); // .keySet untuk mengambil semua yang ada di Key nya yang berupa Set
        //map.values(); // .values untuk mengambil semua values nya yang berupa collection
        //map.entrySet(); // Untuk mengambil key dan values nya

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
