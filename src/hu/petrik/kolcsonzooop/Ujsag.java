package hu.petrik.kolcsonzooop;

public class Ujsag implements Kolcsonozheto{

    private String cim;
    private int kiadasiEv;
    private int kiadasiHet;


    public Ujsag(String cim, int kiadasiEv, int kiadasiHet) {
        this.cim = cim;
        this.kiadasiEv = kiadasiEv;
        this.kiadasiHet = kiadasiHet;
    }


    public String getCim() {
        return cim;
    }

    public int getKiadasiEv() {
        return kiadasiEv;
    }

    public int getKiadasiHet() {
        return kiadasiHet;
    }

    @Override
    public String megjelentendoNev() {
        return String.format("%s %d/%d.",this.cim,this.kiadasiEv,this.kiadasiHet);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 0;
    }
}
