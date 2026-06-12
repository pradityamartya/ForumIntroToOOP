package inheritance;

// Class orangtua
class Bidang {
    private String nama;

    public Bidang(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama Objek : " + nama);
    }
}

// Class anak bernama Persegi
class Persegi extends Bidang {
    private int sisi;

    public Persegi(String nama, int sisi) {
        super(nama);
        this.sisi = sisi;
    }
    
    // Method baru khusus class anak
    public double hitungLuas() {
        return sisi * sisi;
    }
}

// Class anak bernama Lingkaran
class Lingkaran extends Bidang {
    private double radius;

    public Lingkaran(String nama, double radius) {
        super(nama);
        this.radius = radius;
    }

 // Method baru khusus class anak
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {

        Persegi p = new Persegi("Persegi", 6);
        p.info();
        System.out.println("Luas Persegi : " + p.hitungLuas());

        Lingkaran l = new Lingkaran("Lingkaran", 6);
        l.info();
        System.out.printf("Luas Lingkaran : %.2f\n", l.hitungLuas());
    }
}