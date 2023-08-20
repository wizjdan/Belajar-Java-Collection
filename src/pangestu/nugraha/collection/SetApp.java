package pangestu.nugraha.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Materi Set
public class SetApp {
    public static void main(String[] args) {

        /*
        Data yang ada di dalam Set adalah data yang terduplikasi
         */

        Set<String> names = new HashSet<>();
        names.add("Pangestu");
        names.add("Nugraha");
        names.add("Shiro");

        //Ketika ada data yang sama di buat
        names.add("Pangestu");
        names.add("Nugraha");
        names.add("Shiro");

        //Dan dilakukan perulangan untuk pengecekan data. Data yang di terima hanya 1
        //Jadi tidak ada duplikat data.
        //Dan datanya tidak berurut

        for (var nama : names){
            System.out.println(nama);
        }

        System.out.println("LinkedHashSet");

        Set<String> jeneng = new LinkedHashSet<>();
        jeneng.add("Pangestu");
        jeneng.add("Nugraha");
        jeneng.add("Shiro");

        //Ketika ada data yang sama di buat

        jeneng.add("Pangestu");
        jeneng.add("Nugraha");
        jeneng.add("Shiro");

        //Dan dilakukan perulangan untuk pengecekan data. Data yang di terima hanya 1
        //Jadi tidak ada duplikat data.
        //Dan datanya berurut

        for (var sopo : jeneng) {
            System.out.println(sopo);
        }

    }
}
