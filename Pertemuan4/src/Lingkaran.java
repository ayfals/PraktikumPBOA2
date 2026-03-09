/*  Nama File: Lingkaran.java
    Deskripsi: File berisi method dan atribut dalam class Lingkaran
    Pembuat: Arya Naufal Akmal
    Tanggal: 9 Maret 2026
*/

import java.lang.Math;

public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){
        setJmlSisi(0);;
    }

    public Lingkaran(double jari, String warna, String border){
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * (this.jari * this.jari);
    }

    public double getKeliling(){
        return 2 * Math.PI * this.jari;
    }
}
