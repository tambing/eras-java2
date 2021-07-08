public class Kubus extends Persegi{
    private double tinggi;

    
    public double getTinggi() {
        return tinggi;
    }


    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }


    public Double volume(){
        return luasPersegi()*tinggi;
    }
}
