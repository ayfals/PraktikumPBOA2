class Anabul {
    String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println(nama + " bergerak...");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara...");
    }
}

class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}

class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }
}

class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }
}

public class MainAnabul {
    public static void main(String[] args) {

        Anabul[] hewan = {
            new Kucing("Kitty"),
            new Anjing("Doggy"),
            new Burung("Tweety")
        };

        for (Anabul a : hewan) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}