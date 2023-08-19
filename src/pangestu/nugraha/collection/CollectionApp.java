package pangestu.nugraha.collection;

// Materi Collection

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        //Karena tidak ada direct implementasinya, maka percobaan menggunakan ArrayList<>
        Collection<String> collection = new ArrayList<>();

        //menambahkan data menggunakan .add
        collection.add("Pangestu");
        collection.add("Nugraha");
        collection.add("Wizjdan");
        collection.add("Cio");
        collection.add("Cireng");

        //atau menambahkan data dengan .addAll(List.of())
        collection.addAll(List.of("Pangestu", "Nugraha", "Wizjdan", "Cio", "Cireng"));

        //Untuk menampilkan data menggunakan perulangan for
        for (var value : collection){
            System.out.println(value);
        }

        //Cara menghapus data di Collection
        System.out.println("MENGHAPUS DATA DI COLECTION");

        // menggunakan .remove
        collection.remove("Wizjdan");

        //Jika lebih dari satu yang ingin dihapus
        collection.removeAll(List.of("Cio"));

        //Untuk menampilkan data menggunakan perulangan for
        for (var value : collection) {
            System.out.println(value);
        }

        //Untuk pengecekan data pada Collection menggunakan method .contains
        System.out.println(
                // collection.contains("Pangestu", "Nugraha", "Wizjdan")
                // Eror karena data Wizjdan sudah terhapus
                // collection.remove("Wizjdan");

                collection.contains("Pangestu")
        );

        System.out.println(
                collection.containsAll(List.of("Pangestu", "Nugraha", "Wizjdan", "Cio", "Cireng"))
        // Pada .containsAll datanya harus ada semua. Jika salah satu data tidak ada,
        // maka hasilnya akan false.
        // Contoh data "Cio" sudah di remove collection.removeAll(List.of("Cio")); Maka hasilnya akan false
        );

        //Untuk melihat jumlah data menggunakan .size
        System.out.println(collection.size());


        }
    }

