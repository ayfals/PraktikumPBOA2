// NIM      : 24060124130089
// Nama     : Arya Naufal Akmal
// Tanggal  : 20 April 2026

class Civitasakademika {
    String nama;

    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return "-";
    }
}

class Dosen extends Civitasakademika {
    String nip;

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    @Override
    public String getNomor() {
        return nip;
    }
}

class Mahasisswa extends Civitasakademika {
    String nim;
    Dosen dosenwali;

    public Mahasisswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
        this.dosenwali = null;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public void setWali(Dosen dosen) {
        this.dosenwali = dosen;
    }

    public void tampilDataMahasiswa() {
        String namaWali = (dosenwali != null) ? dosenwali.getNama() : "Belum ditentukan";
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.println("Nama Dosenwali : " + namaWali);
    }
}

class Seminar {
    static final int maks = 100;
    Civitasakademika[] pesertas;
    int banyakpeserta;

    public Seminar() {
        pesertas = new Civitasakademika[maks];
        banyakpeserta = 0;
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void registrasi(Civitasakademika peserta) {
        if (banyakpeserta >= maks) {
            System.out.println("Registrasi gagal, kapasitas seminar sudah penuh!");
            return;
        }
        pesertas[banyakpeserta] = peserta;
        banyakpeserta++;
        System.out.println("Registrasi berhasil: " + peserta.getNama());
    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i + 1) + ". Nomor: " + pesertas[i].getNomor() + " | Nama: " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasisswa) {
                jumlah++;
            }
        }
        return jumlah;
    }
}

public class MainCivitas {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Dr. Cholifatul", "198001012005011001");
        Dosen d2 = new Dosen("Farkhan S.Kom", "198202022006042002");

        Mahasisswa mhs1 = new Mahasisswa("Arya Naufal Akmal", "24060124130089");
        Mahasisswa mhs2 = new Mahasisswa("Citra Lestari", "24060124130090");
        Mahasisswa mhs3 = new Mahasisswa("Dimas Pratama", "24060124130091");
        Mahasisswa mhs4 = new Mahasisswa("Eka Putri", "24060124130092");
        Mahasisswa mhs5 = new Mahasisswa("Fajar Nugraha", "24060124130093");

        mhs1.setWali(d1);
        mhs2.setWali(d1);
        mhs3.setWali(d2);
        mhs4.setWali(d2);
        mhs5.setWali(d1);

        Seminar seminar = new Seminar();
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(mhs1);
        seminar.registrasi(mhs2);
        seminar.registrasi(mhs3);
        seminar.registrasi(mhs4);
        seminar.registrasi(mhs5);
        System.out.println();

        System.out.println("Banyak peserta seminar  : " + seminar.countPeserta());
        System.out.println("Banyak peserta mahasiswa: " + seminar.countMahasiswa());
        System.out.println();

        seminar.tampilPeserta();
        System.out.println();

        mhs1.tampilDataMahasiswa();
        mhs2.tampilDataMahasiswa();
        mhs3.tampilDataMahasiswa();
        mhs4.tampilDataMahasiswa();
        mhs5.tampilDataMahasiswa();
    }
}
