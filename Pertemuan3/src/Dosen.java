/*  Nama File   : Dosen.java
 *  Deskripsi   : berisi atribut dan method dalam class Dosen
 *  Pembuat     : Arya Naufal Akmal
 *  Tanggal     : 9 Maret 2026
 */

public class Dosen {
    //Atribut
    private String nip,nama,prodi;

    //Method
    //Konstruktor tanpa parameter
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    //Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Selektor dan Mutator
    //Selektor
    public String getNip(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    //Mutator
    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

}
