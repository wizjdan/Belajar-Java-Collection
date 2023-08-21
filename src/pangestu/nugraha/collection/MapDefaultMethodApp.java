package pangestu.nugraha.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

//Materi Default Method Map
public class MapDefaultMethodApp {
    public static void main(String[] args) {

        //Contoh
        Map<String, String> map = new HashMap<>();
        map.put("Pangestu", "Pangestu Value");
        map.put("Nugraha","Nugraha Value");
        map.put("Shiro", "Shiro Value");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

    }
}
