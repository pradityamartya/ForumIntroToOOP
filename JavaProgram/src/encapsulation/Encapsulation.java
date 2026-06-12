package encapsulation;

class Bidang {
    private String nama; // Modifier variabel nama dibuat private
    private String warna; // Modifier variabel warna dibuat private

    public Bidang(String nama) {
        this.nama = nama;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Bidang b = new Bidang("Persegi");

        // Menggunakan getter
        System.out.println("Objek lama : " + b.getNama());

        // Menggunakan setter
        b.setNama("Lingkaran");

        // Menggunakan getter lagi
        System.out.println("Objek baru : " + b.getNama());

        b.setWarna("Biru");
        System.out.println("Warna      : " + b.getWarna());
    }
}