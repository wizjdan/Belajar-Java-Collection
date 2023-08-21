package pangestu.nugraha.collection;

import java.util.Deque;
import java.util.LinkedList;

//Materi Deque
/*
Mendukung FIFO (First In First Out) dan mendukung LIFO (Last In First Out)
 */
public class DequeApp {
    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();

        //Menambahkan data di depan dalam deque
        //Ketika di print diurutkan berdasarkan urutan paling akhir terlebih dahulu
        deque.offerFirst("Pangestu");//3
        deque.offerFirst("Nugraha");//2
        deque.offerFirst("Celit"); //1

        //Di cek menggunakan perulangan for
        for (var nama : deque){
            System.out.println(nama);
        }

        //Cara mengambil data paling depan .pollFirst()
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());

        //Cara mengambil data paling belakang .pollLast()
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());

        System.out.println("offerLast Deque");

        //Menambakan data di belakang dalam deque
        deque.offerLast("Pangestu");
        deque.offerLast("Nugraha");
        deque.offerLast("Celit");

        //Di cek menggunakan perulangan for
        for (var nama : deque){
            System.out.println(nama);
        }


    }
}
