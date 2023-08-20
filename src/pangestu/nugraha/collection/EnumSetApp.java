package pangestu.nugraha.collection;

import java.util.EnumSet;

public class EnumSetApp {

    public static enum Gender{
        MALE,FEMALE,NOT_MENTION
    }

    public static void main(String[] args) {

        /*
        Jika semua data ingin dimasukan menggunakan EnumSet.allOf()
         */
        EnumSet<Gender> genders1 = EnumSet.allOf(Gender.class);

        /*
        Jika ingin memasukan data satu per satu menggunakan EnumSet.of()
         */
        EnumSet<Gender> genders2 = EnumSet.of(Gender.MALE, Gender.FEMALE);


        for (var gender : genders2){
            System.out.println(gender);
        }


    }
}
