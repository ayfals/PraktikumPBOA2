// NIM      : 24060124130089
// Nama     : Arya Naufal Akmal
// Tanggal  : 20 Juni 2026

import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < this.nbelm) {
            return this.Lnama.get(indeks);
        }
        return "Indeks tidak valid";
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < this.nbelm) {
            this.Lnama.set(indeks, nama);
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }

    public void addNama(String nama) {
        this.Lnama.add(nama);
        this.nbelm++;
    }

    public void delNama(String nama) {
        if (this.Lnama.remove(nama)) {
            this.nbelm--;
        } else {
            System.out.println(nama + " tidak ditemukan dalam list.");
        }
    }

    public boolean isMember(String nama) {
        return this.Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        for (int i = 0; i < this.nbelm; i++) {
            if (this.Lnama.get(i).equals(nama)) {
                this.Lnama.set(i, namabaru);
            }
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : this.Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Teman:");
        for (int i = 0; i < this.nbelm; i++) {
            System.out.println("- " + this.Lnama.get(i));
        }
    }

    public static void main(String[] args) {
        Teman t = new Teman();
        
        t.addNama("Arya");
        t.addNama("Axel");
        t.addNama("Amar");
        t.addNama("Axel");
        
        t.showTeman();
        System.out.println("elemen: " + t.getNbelm());
        System.out.println("indeks 0: " + t.getNama(0));
        
        System.out.println("\nArya: " + t.isMember("Arya"));
        System.out.println("Jumlah Axel: " + t.countNama("Axel") + "\n");
        
        t.gantiNama("Axel", "Anggian");
        t.showTeman();
        
        t.delNama("Arya");
        t.showTeman();
    }
}