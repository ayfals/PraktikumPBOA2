/*  Nama File: Persegi.java
    Deskripsi: File berisi method dan atribut dalam class Persegi
    Pembuat: Arya Naufal Akmal
    Tanggal: 9 Maret 2026
*/

import java.lang.Math;

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String border, String warna){
        this.sisi = sisi;
        setBorder(border);
        setWarna(warna);
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return this.sisi * this.sisi;
    }

    public double getKeliling(){
        return this.sisi * 4;
    }

    public double getDiagonal(){
        return Math.sqrt(2 * (this.sisi * this.sisi));
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}
