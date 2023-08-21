package pangestu.nugraha.collection;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

//Materi Spliterator
public class SpliteratorApp {
    public static void main(String[] args) {

        List<String> list = List.of("Pangestu", "Nugraha", "Cio", "Cireng", "Ria", "Dumdum");

        Spliterator<String> spliterators1 = list.spliterator(); // Ini belum di split. Jadi jumlah datanya ada 6
        Spliterator<String> spliterators2 = spliterators1.trySplit(); //Untuk mensplit jadi 2 dari Spliterator1

        System.out.println(spliterators1.estimateSize()); //Hasilnya ada 3 data
        System.out.println(spliterators2.estimateSize()); //Hasilnya ada 3 data

        //Untuk meiterasi satu per satu menggunakan .forEachRemaining
        spliterators1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //Untuk meiterasi satu per satu menggunakan .forEachRemaining
        spliterators2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
