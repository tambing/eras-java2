import java.util.Scanner;

/**
 * Segitiga
 */
public class Segitiga {
    private double alas;
    private double tinggi;
    private double miring;
    // private double Luas;
    // private Double Keliling;
    Scanner scan = new Scanner(System.in);

    public double getAlas() {
        return alas;
    }



    public void setAlas(double alas) {
        this.alas = alas;
    }



    public double getTinggi() {
        return tinggi;
    }



    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public Double luasSegitiga(){
        // Luas = 0.5 * this.alas;
        return 0.5*alas*tinggi;
    }

    public Double kelilingSegitiga(){
        miring = Math.sqrt((this.alas*this.alas)+( this.tinggi * this.tinggi ));
        return this.alas+this.tinggi+this.miring;
    }

    public void getInput(){
        System.out.print("Tinggi = ");
        double aTinggi = scan.nextDouble();
        System.out.print("Alas = ");
        double aAlas = scan.nextDouble();
        this.tinggi = aTinggi;
        this.alas = aAlas;
        // System.out.println("Luas Segitiga = "+luasSegitiga());
        // return luasSegitiga();
    }
    public void cetakLuas(){
        System.out.println("Luas Segitiga = "+luasSegitiga()+" cm^2");
    }

    public void cetakKeliling(){
        System.out.println("Keliling Segitiga = "+kelilingSegitiga()+" cm");
    }
    
}