package js10;

/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */

public class Mobil {
    String merk, warna;
    int tahunproduksi;

    public void Maju() {
        int kec = 10;
        System.out.println("Mobil maju sejauh " + kec + "meter");
    }

    public void Mundur() {
        int kec = 5;
        System.out.println("Mobil mundur sejauh " + kec + "meter");
    }
}