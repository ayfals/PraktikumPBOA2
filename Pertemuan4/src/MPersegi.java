/*  Nama File: MPersegi.java
    Deskripsi: Main Program untuk class Persegi
    Pembuat: Arya Naufal Akmal
    Tanggal: 9 Maret 2026
*/

public class MPersegi {
    public static void main(String[] args) {
        Persegi P1 = new Persegi();
        P1.setWarna("Merah");
        P1.setBorder("Putih");
        System.out.println("Bangun Datar: Persegi");
        P1.printInfo();

        P1.setSisi(5);
        System.out.println("Besar Sisi: " + P1.getSisi());
        System.out.println("Keliling: " + P1.getKeliling());
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Diagonal: " + P1.getDiagonal());
    }
}
