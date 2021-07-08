package sisi;

import java.util.Scanner;

public class Persegi {
    private double panjang;
    private double lebar;
    Scanner scan = new Scanner(System.in);

    // constructor default terbentuk apabila tidak ada cunstructor dengan argument
    // apabila ada constructor dengan argument maka constructor default harus di deklarasikan
    // public Persegi(){

    // }

    public Double luasPersegi(){
        return panjang*lebar;
    }

    public Double kelilingPersegi(){
        return 2*( panjang+lebar );
    }

    public void getInput(){
        System.out.print("Panjang : ");
        double getPanjang = scan.nextDouble();
        System.out.print("Lebar : ");
        double getLebar = scan.nextDouble();
        this.panjang = getPanjang;
        this.lebar = getLebar;
    }

    public void cetakLuas() {
        System.out.println("Luas Persegi = "+luasPersegi()+" cm^2");
    }

    public void cetakKeliling() {
        System.out.println("Keliling Persegi = "+kelilingPersegi()+" cm");
    }
}
