package pangestu.nugraha.collection;

import java.util.Arrays;
import java.util.List;

//Materi Konversi ke Array
public class ArrayApp {
    public static void main(String[] args) {

        //Contoh menggunakan mutable
        List<String> names = List.of("Pangestu", "Nugraha", "Cio", "Cireng");

        //Contoh konversi ke Object Array
        Object[] objects = names.toArray();

        //Contoh konversi ke String Array
        String[] strings = names.toArray(new String[0]);

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));

    }
}
