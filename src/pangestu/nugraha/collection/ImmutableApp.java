package pangestu.nugraha.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {

        List<String> satu = Collections.singletonList("Satu"); // Hanya 1 data
        List<String> kosong = Collections.emptyList(); // Kosong tidak ada data

        //Ini data mutable, Jadi bisa dirubah-rabah
        List<String> mutable =new ArrayList<>();
        mutable.add("Pangestu");
        mutable.add("Nugraha");
        // Agar data di mutable tidak bisa dirubah
        List<String> immutable = Collections.unmodifiableList(mutable);

        //Untuk memasukan data
        List<String> data = List.of("Pangestu", "Nugraha", "Celit", "Cio", "Cireng");
        data.add("Nenggleng"); //Eror. data tidak bisa di tambahkan lagi


    }
}
