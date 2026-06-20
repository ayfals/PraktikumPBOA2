// Arya Naufal Akmal
// 24060124130089

class Anabul {
    // Atribut
    String panggilan;
    double bobot;

    // Konstruktor
    public Anabul(String panggilan, double bobot) {
        this.panggilan = panggilan;
        this.bobot = bobot;
    }

    public String getPanggilan() {
        return panggilan;
    }

    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    public String getNama() {
        return panggilan;
    }

    public void setNama(String nama) {
        this.panggilan = nama;
    }
    public void gerak() {
        System.out.println(panggilan + " bergerak...");
    }

    public void bersuara() {
        System.out.println(panggilan + " bersuara...");
    }
}

class Kucing extends Anabul {

    public Kucing(String panggilan, double bobot) {
        super(panggilan, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(panggilan + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(panggilan + " berbunyi meong");
    }
}

class Anjing extends Anabul {

    public Anjing(String panggilan, double bobot) {
        super(panggilan, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(panggilan + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(panggilan + " bersuara guk-guk");
    }
}

class Burung extends Anabul {

    public Burung(String panggilan, double bobot) {
        super(panggilan, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(panggilan + " bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(panggilan + " berbunyi cuit");
    }
}

class Piaraan {
    private int nbelm;
    private Anabul[] Lanabul;
    private int max = 100;

    public Piaraan() {
        Lanabul = new Anabul[max];
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul a) {
        Lanabul[nbelm] = a;
        nbelm++;
    }

    public boolean isMember(Anabul a) {
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] == a) {
                return true;
            }
        }
        return false;
    }

    public Anabul getAnabul() {
        if (nbelm == 0) return null;
        return Lanabul[0];
    }

    public Anabul dequeueAnabul() {
        if (nbelm == 0) return null;

        Anabul temp = Lanabul[0];

        for (int i = 0; i < nbelm - 1; i++) {
            Lanabul[i] = Lanabul[i + 1];
        }

        nbelm--;
        return temp;
    }

    public void showAnabul() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(Lanabul[i].getPanggilan());
        }
    }

    public int countKucing() {
        int count = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double bobot = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] instanceof Kucing) {
                bobot = bobot + Lanabul[i].getBobot();
            }
        }
        return bobot;
    }
    
    public void showJenisAnabul() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Nama: " + Lanabul[i].getNama() + ", Jenis: " + Lanabul[i].getClass().getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Anabul[] hewan = {
            new Kucing("Kitty", 9.0),
            new Anjing("Doggy", 16.0),
            new Burung("Tweety", 3.0)
        };

        for (Anabul a : hewan) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }

        Piaraan p = new Piaraan();
        p.enqueueAnabul(new Kucing("Kiti", 8.5));
        p.enqueueAnabul(new Anjing("Dogi", 14.7));
        p.enqueueAnabul(new Burung("Berdi", 2.6));
        p.enqueueAnabul(new Kucing("Keti", 8.2));
        
        p.showAnabul();
        System.out.println(p.getNbelm());
        System.out.println(p.countKucing());
        System.out.println(p.bobotKucing());
        p.showJenisAnabul();
    }
}