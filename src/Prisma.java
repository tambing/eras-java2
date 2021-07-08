import java.util.Scanner;

/**
 * Prisma
 */
public class Prisma extends Segitiga {
    private double tinggiPrisma;
    Scanner scan = new Scanner(System.in);
    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public Prisma(){

    }

    
    public Double volume(){
        //super digunakan ketika di dalam class Prisma ada method luas segitiga
        // return luasSegitiga()*this.tinggiPrisma;
        getInput();
        System.out.print("Masukkan Tinggi Prisma = ");
        double aTinggiPrisma = scan.nextDouble();
        tinggiPrisma = aTinggiPrisma;
        return super.luasSegitiga()*this.tinggiPrisma;
    }

    public void getVolume(){
        System.out.println("Volume Prisma = "+volume()+" cm^3");
    }
}