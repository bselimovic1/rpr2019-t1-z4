package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];


    public Artikl[] getArtikli() {
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbaceni=null;
        for(int i=0;i<artikli.length;i++){
            if(artikli[i].getKod().equals(kod)){
                izbaceni=new Artikl(artikli[i]);
                artikli[i]=null;
                return izbaceni;
            }
        }
        return null;
    }
    public boolean dodajArtikl(Artikl art){
        boolean dodat= false;
        for(int i=0;i<artikli.length;i++){
            if(artikli[i]==null){
                artikli[i]=art;
                return true;
            }
        }
        return false;
    }
    public int dajUkupnuCijenuArtikala(){
        int ukupnaCijena=0;
        for(int i=0;i<artikli.length;i++){
            if(artikli[i]!=null)
                ukupnaCijena+=artikli[i].getCijena();
        }
        return ukupnaCijena;
    }
}
