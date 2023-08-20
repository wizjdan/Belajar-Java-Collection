package pangestu.nugraha.collection.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Materi Immutable List
public class Person {

    private String nama;

    private List<String> hobi;

    public Person(String nama) {
        this.nama = nama;
        this.hobi = new ArrayList<>();
    }

    public void addHobi(String hobbi){
        hobi.add(hobbi);
    }

    public List<String> getHobi(){
        return Collections.unmodifiableList(hobi); // return hobi di Konversi ke Immutable List Collection Collections.unmodifiableList
    }

    public String getNama(){
        return nama;
    }


}
