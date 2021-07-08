public class Bola extends Lingkaran {

    public Double volume(){
        getInput();
        return 4/3.0*(getPhi()*getJariJari()*getJariJari()*getJariJari());
    }
}
