package pangestu.nugraha.collection;

import pangestu.nugraha.collection.collection.SingelQueue;

import java.util.Queue;

public class SingelQueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new SingelQueue<>();

        System.out.println(queue.offer("Pangestu")); // Hasilnya True
        System.out.println(queue.offer("Nugraha")); // Hasilnya False
        System.out.println(queue.offer("Cio")); // Hasilnya False
        System.out.println(queue.offer("Cireng")); //Hasilnya False

        System.out.println(queue.size()); //Melihat ukuran
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());


    }
}
