package pangestu.nugraha.collection;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

//Materi EnumHashMap
public class EnumHashMapApp {

    //Contoh enum
    public static enum Level{
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {

        Map<Level, String> map = new EnumMap<Level, String>(Level.class);

        map.put(Level.FREE, "Pangestu");
        map.put(Level.STANDARD, "Nugraha");
        map.put(Level.VIP, "Cio");
        map.put(Level.PREMIUM, "Ria");

        //Dilakukan iterasi dengan for
        for (var keys : map.keySet()){
            System.out.println(map.get(keys));
        }

        /*
        Untuk pembuatan Key lebih cocok menggunakan EnumMap agar algoritma pendistibusian key
        lebih optimal, dibandingakn menggunakan HashSet
         */

    }
}
