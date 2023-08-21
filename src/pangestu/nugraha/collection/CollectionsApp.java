package pangestu.nugraha.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Materi Collections
public class CollectionsApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(List.of("Pangestu", "Nugraha", "Shiro", "Ria", "Cireng"));

        //Jika di printout biasa
        System.out.println(list); //Hasilnya seperti ketika data di masukan

        Collections.reverse(list);
        System.out.println(list); //Hasilnya data akan di tampilkan dari belakang terlebih dahulu

        Collections.shuffle(list);
        System.out.println(list); //Hasilnya data akan di tampilkan secara acak

    }
}
