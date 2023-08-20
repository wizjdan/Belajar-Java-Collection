package pangestu.nugraha.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Materi List Interface
public class ListApp {
    public static void main(String[] args) {

        //Membuat List Interface menggunakan ArrayList<>
        //Default ArrayList 10
        List<String> strings1 = new ArrayList<>();

        //Membuat List Interface menggunakan LinkedList<>
        List<String> strings2 = new LinkedList<>();

        /*
        Karena turunan dari Collection cara menambahkan datanya sama seperti di Collection.

        Pengoperasian LinkedList<> sama seperti ArrayList<> karena Impelemntasi dari turunan yang sama.
         */

        //Menambah data di ArrayList<>
        strings1.add("Pangestu");
        strings1.add("Nugraha");
        strings1.add("Cio");
        strings1.add("Cireng");

        //Merubah data di ArrayList<>
        strings1.set(2, "Celit"); // Masukan index yang akan di rubah. Pisahkan dengan koma dan masukan data yang baru

        //Menghapus data di ArrayList<>
        strings1.remove(3); // Masukan index yang akan di hapus.
        //strings1.remove(); remove menggunakan object

        //Mengambil data di ArrayList<>
        // strings1.get(0); Masukan nomor index

        System.out.println(strings1.get(1));

        //Iterasi untuk melihat data index strings1
        for (var nama : strings2){
            System.out.println(nama);
        }


    }
}
