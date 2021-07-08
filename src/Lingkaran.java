import java.util.Scanner;

public class Lingkaran {
    private Double phi = 3.14;
    private Double jariJari;
    Scanner scan = new Scanner(System.in);
    // public Lingkaran(){

    // }
    public Double getPhi() {
        return phi;
    }
    public void setPhi(Double phi) {
        this.phi = phi;
    }
    public Double getJariJari() {
        return jariJari;
    }
    public void setJariJari(Double jariJari) {
        this.jariJari = jariJari;
    }
    public Double luasLingkaran(){
        return phi*jariJari*jariJari;
    }
    
    public Double kelilingLingkaran(){
        return 2*phi*jariJari;
    }

    public void getInput(){
        System.out.print("Jari-jari : ");
        double getJari = scan.nextDouble();
        this.jariJari = getJari;
    }

    public void cetakLuas(){
        System.out.println("Luas Lingkara = "+luasLingkaran()+" cm^2");
    }
    public void cetakKeliling(){
        System.out.println("Keliling Lingkaran = "+kelilingLingkaran()+" cm");
    }
}
