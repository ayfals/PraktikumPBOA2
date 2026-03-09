/*  Nama File: MLingkaran.java
    Deskripsi: Main Program untuk class Lingkaran
    Pembuat: Arya Naufal Akmal
    Tanggal: 9 Maret 2026
*/

public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran(5, "Merah", "Putih");
        System.out.println("Bangun Datar: Lingkaran");
        L1.printInfo();

        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());
    }
}
