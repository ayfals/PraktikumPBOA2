public class Mahasiswa {
    String NIM;
    String Nama;
    String ProgramStudi;

    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    public Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = "Kosong";
    }

    public Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    public Mahasiswa(Mahasiswa mhs) {
        this.NIM = mhs.NIM;
        this.Nama = mhs.Nama;
        this.ProgramStudi = mhs.ProgramStudi;
    }

    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi) {
        this.ProgramStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa mhs) {
        this.ProgramStudi = mhs.ProgramStudi;
    }

    public void View() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + ProgramStudi);
        System.out.println("-------------------------");
    }
}