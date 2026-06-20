// NIM      : 24060124130089
// Nama     : Arya Naufal Akmal
// Tanggal  : 20 April 2026

public class StringKonkatInteger {
    public static void main(String[] args) {
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S(Konkatenasi) = " + S);
        System.out.println("Z(Jumlah Integer) = " + Z);
    }
}
