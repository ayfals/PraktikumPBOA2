/*  Nama File   : Matakuliah.java
 *  Deskripsi   : berisi atribut dan method dalam class Matakuliah
 *  Pembuat     : Arya Naufal Akmal
 *  Tanggal     : 9 Maret 2026
 */

public class Matakuliah {
    //Atribut
    private String idMatkul, NamaMatkul;
    private int Sks;

    //Method
    //Konstruktor tanpa parameter
    public Matakuliah () {
        this.idMatkul = "";
        this.NamaMatkul = "";
        this.Sks = 0;
    }

    //Konstruktor dengan parameter
    public Matakuliah (String idMatkul, String NamaMatkul, int Sks){
        this.idMatkul = idMatkul;
        this.NamaMatkul = NamaMatkul;
        this.Sks = Sks;
    }

    //Selektor dan Mutator
    //Selektor
    public String getIdMatkul(){
        return this.idMatkul;
    }

    public String getNamaMatkul(){
        return this.NamaMatkul;
    }

    public int getSks(){
        return this.Sks;
    }

    //Mutator
    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNamaMatkul(String NamaMatkul){
        this.NamaMatkul = NamaMatkul;
    }

    public void setSks (int Sks){
        this.Sks = Sks;
    }
}
