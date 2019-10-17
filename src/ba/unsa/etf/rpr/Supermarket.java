package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli= new Artikl[1000];

    public Supermarket(){}


    public Artikl[] getArtikli() {
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbaceni=new Artikl();
        for(int i=0;i<artikli.length;i++){
            if(artikli[i].getKod().equals(kod)){
                izbaceni=artikli[i];
                artikli[i]=null;
            }
        }
        return izbaceni;
    }
    public boolean dodajArtikl(Artikl art){
        boolean dodat= false;
        for(int i=0;i<artikli.length;i++){
            if(artikli[i]==null){
                artikli[i]=art;
                return true;
            }
        }
        return dodat;
    }
}
