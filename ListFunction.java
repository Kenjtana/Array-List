package java.fundamental.listfunction;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

public class ListFunction {
    public static void main(String[] args) {
//        Deklarasi List
        List<String> elemen = new ArrayList<>(); // elemen adalah nama  List

        elemen.add("Geo"); // method add() untuk menambahkan objek kedalam List
        elemen.add("Pyro"); // objek yang ditambahkan tidak terbatas
        elemen.add("Cyro");
        elemen.add("Hydro");
        elemen.add("Anemo");
        elemen.add("Dendro");
        elemen.add("Electro");

        System.out.println("List elemen awal: ");
        for (int x = 0; x< elemen.size(); x++){ // method size() untuk mendapatkan panjang / ukuran List
            System.out.println("Elemen: "+elemen.get(x));
        }

        elemen.remove("Dendro");
        System.out.println(" ");

        System.out.println("List elemen akhir: ");
        for (int y = 0; y < elemen.size(); y++){
            System.out.println("Elemen yang tersisa: "+elemen.get(y)); // method get() untuk mendapatkan objek di dalam List sesuai index Y
        }

    }
}
