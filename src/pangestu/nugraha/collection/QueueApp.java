package pangestu.nugraha.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

//Materi Queue
/*
Mendukung FIFO (First In First Out)
 */
public class QueueApp {
    public static void main(String[] args) {
        System.out.println("Contoh 1");
        //Cara menggunakan Queue dengan jumlah maksimal data pada contoh adalah 10
        Queue<String> queue = new ArrayDeque<>(10);

        for (int i = 0; i < 10; i++) {
            queue.add(String.valueOf(i));
        }

        //Untuk mengambil data satu per satu dari depan hingga belakang String next = queue.poll()
        //Selama nextnya tidak sama dengan null
        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println("Contoh 1");

        Queue<String> queue2 = new ArrayDeque<>();
        //Data di tambahkan
        queue2.add("Pangestu");
        queue2.add("Nugraha");
        queue2.add("Shiro");

        System.out.println(queue2.size());

        //Jika ingin membuat Queue tapi datanya ingin berurut
        //Maka bisa menggunakan PriorityQueue
        Queue<String> queue3 = new PriorityQueue<>();
        //Data di tambahkan
        queue3.add("Pangestu");
        queue3.add("Nugraha");
        queue3.add("Shiro");

        for (String next = queue3.poll(); next != null; next = queue3.poll()) {
            System.out.println(next);
        }

    }
}