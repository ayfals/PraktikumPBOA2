/*  Nama File: BangunDatar.java
    Deskripsi: File berisi method dan atribut dalam class BangunDatar
    Pembuat: Arya Naufal Akmal
    Tanggal: 9 Maret 2026
*/

public class BangunDatar{
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi (int jmlsisi){
        this.jmlSisi = jmlsisi;
    }

    public String getwarna(){
        return warna;
    }

    public void setWarna (String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }
    
    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}
