// NIM      : 24060124130089
// Nama     : Arya Naufal Akmal
// Tanggal  : 20 April 2026

public class Coercion {
    public static void main(String[] args) {
        // 1a
        int nilai = 65;

        System.out.println("Integer = " + nilai);

        char huruf = (char) nilai;
        System.out.println("Char = " + huruf);

        double real = nilai;
        System.out.println("Double = " + real);

        // 1b
        int kembali = (int) real;
        System.out.println("Integer dari Double = " + kembali);

        // 1c
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("S(Konkatenasi) = " + S);
        System.out.println("Z(Jumlah Integer) = " + Z);

        // 1d
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R(Konkatenasi) = " + R);
        System.out.println("D(Jumlah Double) = " + D);

        // 1e
        Integer A = Integer.valueOf(S);
        System.out.println("A(Konversi S) = " + A);

        // 1f
        String T = A.toString();
        System.out.println("T(Konversi A) = " + T);
    }
}