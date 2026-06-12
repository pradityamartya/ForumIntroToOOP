package polymorphism;

class Bidang {

    public void hitungLuas() {
        System.out.println("Menghitung luas bidang");
    }
}

class Persegi extends Bidang {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        System.out.println("Luas Persegi : " + (sisi * sisi));
    }
}

class Lingkaran extends Bidang {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public void hitungLuas() {
        System.out.printf("Luas Lingkaran : %.2f\n", Math.PI * radius * radius);
    }
}

public class Polymorphism {
    public static void main(String[] args) {

    	// Method hitungLuas() menghasilkan output berbeda pada class persegi & class lingkaran walaupun namanya sama
        Bidang b;

        b = new Persegi(6);
        b.hitungLuas();

        b = new Lingkaran(6);
        b.hitungLuas();
    }
}