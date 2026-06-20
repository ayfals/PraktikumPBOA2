public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("101", "Arya");
        m1.setProgramStudi();

        Mahasiswa m2 = new Mahasiswa("102", "Naufal");
        m2.setProgramStudi("Informatika");

        Mahasiswa m3 = new Mahasiswa("103", "Akmal");
        m3.setProgramStudi(m1);

        m1.View();
        m2.View();
        m3.View();

        Mahasiswa m4 = new Mahasiswa();
        m4.View();

        Mahasiswa m5 = new Mahasiswa("104", "Bintang", "Sistem Komputer");
        m5.View();

        Mahasiswa m6 = new Mahasiswa(m5);
        m6.View();
    }
}