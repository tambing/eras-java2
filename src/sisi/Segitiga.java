package sisi;

import java.util.Scanner;

public class Segitiga {
    private double sisi1, sisi2, sisi3;
    // private Double sisi2;
    // private Double sisi3;
    Scanner scan = new Scanner(System.in);
    public Double semiPeriMeter(){
        return (0.5)*(sisi1+sisi2+sisi3);
    }
    public Double luasSegitiga(){
        return Math.sqrt((semiPeriMeter())*(semiPeriMeter()-this.sisi1)*(semiPeriMeter()-this.sisi2)*(semiPeriMeter()-this.sisi3));
    }
    public Double kelilingSegitiga(){
        return sisi1+sisi2+sisi3;
    }
    public void getInput(){
        System.out.print("Sisi 1 : ");
        double getSisi1 = scan.nextDouble();
        sisi1 = getSisi1;
        System.out.print("Sisi 2 : ");
        double getSisi2 = scan.nextDouble();
        sisi2 = getSisi2;
        System.out.print("Sisi 3 : ");
        double getSisi3 = scan.nextDouble();
        sisi3 = getSisi3;
    }
    public void detectSegitiga(){
        if (sisi1 == sisi2 && sisi1 == sisi3) {
            System.out.println("Segitiga sama sisi");
        }else if(sisi1 == sisi2 || sisi2==sisi3 || sisi3==sisi1){
            System.out.println("Segitiga sama kaki");
        }else if(sisi1*sisi1 == (sisi2*sisi2) + (sisi3*sisi3) || sisi2*sisi2  == (sisi1*sisi1) + (sisi3*sisi3) || sisi3*sisi3 == (sisi2*sisi2) + (sisi1*sisi1)){
            System.out.println("Segitiga siku-siku");
        }else{
            System.out.println("Segitiga sembarang");
        }
    }
    public void cetakLuas(){
        System.out.println("Luas Segitiga = "+luasSegitiga()+" cm^2");
    }

    public void cetakKeliling(){
        System.out.println("Keliling Segitiga = "+kelilingSegitiga()+" cm");
    }
}
