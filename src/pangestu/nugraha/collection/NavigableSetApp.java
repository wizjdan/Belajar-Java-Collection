package pangestu.nugraha.collection;

import java.util.*;

// Materi NavigableSet
public class NavigableSetApp {
    public static void main(String[] args) {

        //Cara penggunaan NavigableSet menggunakan new TreeSet<>()
        NavigableSet<String> names = new TreeSet<>();

        //Menambahkan data pada names .addAll(Set.of("Masukan datanya"));
        names.addAll(Set.of("Pangestu", "Nugraha", "Wizjdan", "Celit", "Shiro", "Cireng"));

        //Jika ingin hasil datanya diurutkan secara terbalik menggunakan .descendingSet()
        NavigableSet<String> namesRevers = names.descendingSet();

        //Jika ingin mengambil sebagian data
        //Menggunakan .headSet kemudian pilih data terakhir yang ingin dimasukan
        //Pada variable inclusive jika True maka Element yang di sebutkan akan ikut.
        //Jika False makan element yang disebutkan tidak akan terikut.
        NavigableSet<String> sebagianDepan = names.headSet("Wizjdan", false);

        //Jika ingin mengambil sebagian data
        //Menggunakan .tailSet kemudian pilih data paling belakang terakhir
        //Pada variable inclusive jika True maka Element yang di sebutkan akan ikut.
        //Jika False makan element yang disebutkan tidak akan terikut.
        NavigableSet<String> sebagianBelakang = names.tailSet("Nugraha", true);



        //Mengecek data dengan perulangan for.
        // Maka akan tereksekusi dengan ahsil yang berurut sesuai dengan adjad
        for (var name : names){
            System.out.println(name);
        }

        System.out.println("Reversed");

        //Mengecek data dengan perulangan for.
        // Maka akan tereksekusi dengan hasil yang berurut dimulai dari abjad paling belakang
        for (var nama : namesRevers){
            System.out.println(nama);

        }

        System.out.println("headSet()");

        //Mengecek data dengan perulangan for.
        //Maka akan tereksekusi dengan hasil yang berurut dimulai dari abjad paling depan
        //Sampai pada element yang terakhir di sebutkan
        for (var namane : sebagianDepan){
            System.out.println(namane);
        }

        System.out.println("tailSet()");

        //Mengecek data dengan perulangan for.
        //Maka akan tereksekusi dengan hasil yang berurut dimulai dari abjad paling belakang
        //Sampai pada element yang terakhir di sebutkan
        for (var namane : sebagianBelakang) {
            System.out.println(namane);
        }

        /*
        Jika ingin membuat NavigableSet menjadi immutable
        Menggunakan Collections.unmodifiableNavigableSet(Isikan datanya);
         */
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("Coba menambahkan"); Ini akan eror karena sudah di konversi kedalam Immutable

    }
}
