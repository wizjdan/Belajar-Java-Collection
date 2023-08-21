package pangestu.nugraha.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

//Materi Default Method
public class CollectionDefaultMethodApp {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < 100; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        //Untuk merubah
        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 10; //Contoh setiap data dikalikan 10
            }
        });
        System.out.println(numbers);

        //Menggunakan ForEach
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        //Contoh removeAll
        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 500; //Contoh, akan menghapus jika integer datanya lebih dari 500
            }
        });
        System.out.println(numbers);

        /*
        Ada Juga Default Method di Map
         */

    }
}
